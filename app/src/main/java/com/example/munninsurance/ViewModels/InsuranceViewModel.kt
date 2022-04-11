package com.example.munninsurance.ViewModels

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.util.Patterns
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.lifecycle.ViewModel
import com.example.munninsurance.Model.Insurance
import com.example.munninsurance.R
import com.example.munninsurance.databinding.ActivityInsuranceDetailsBinding
import java.util.regex.Pattern


class InsuranceViewModel:ViewModel()
{

    lateinit var  insurance: Insurance
    fun validate(binding: ActivityInsuranceDetailsBinding):Boolean
    {

        with(binding)
        {
            for(editext in arrayListOf<EditText>(etPostalCode,etPolicyBeginDate,etFirstName,etLastName,etPhone,etEmail,etStreetAddress,etdwellingReplacementCost,etdistanceToFireHydrant,etdistanceToFireHall,etYearsAtCurrentAddress,etYearsBuilt,etDateOfBirth,etYearsWithInsurance))
            {
                if(editext.text.isEmpty())
                {
                    editext.error="Required Field"
                    editext.requestFocus()
                    return false
                }

            }
            if(!Pattern.matches(Patterns.EMAIL_ADDRESS.pattern(),etEmail.text.toString()))
            {
                etEmail.error="Invalid email"
                etEmail.requestFocus()
                return false
            }
            if(!Pattern.matches(Patterns.PHONE.pattern(),etPhone.text.toString()))
            {
                etPhone.error="Invalid Phone"
                etPhone.requestFocus()
                return false
            }


        }




        return true
    }

    fun setVals(binding: ActivityInsuranceDetailsBinding):Insurance
    {
        insurance=Insurance()
        with(binding)
        {
           // insurance.
            insurance.postalCode=etPostalCode.text.toString()
            insurance.insurance_policy=spinnerPolicyType.selectedItem.toString()
            insurance.date_need_policy=etPolicyBeginDate.text.toString()

            insurance.first_name=etFirstName.text.toString()
            insurance.last_name=etLastName.text.toString()
            insurance.phone=etPhone.text.toString()
            insurance.email=etEmail.text.toString()
            insurance.street_address=etStreetAddress.text.toString()
            insurance.current_insurance_company=etCurrentInsCompany.text.toString()

            insurance.dwelling_replacement_cost=etdwellingReplacementCost.text.toString()
            insurance.distance_to_fire_hydrant=etdistanceToFireHydrant.text.toString()
            insurance.distance_to_fire_hall=etdistanceToFireHall.text.toString()
            insurance.years_at_current_address=etYearsAtCurrentAddress.text.toString()
            insurance.no_of_families_occuping_dwelling=getTextFromRadio(binding,radioNoFamilies)


            insurance.building_type=spinnerBuildingType.selectedItem.toString()
            insurance.construction_type=spinnerConstType.selectedItem.toString()
            insurance.year_built=etYearsBuilt.text.toString()

            insurance.primary_heating_source=spinnerPrimaryHeatingSource.selectedItem.toString()
            insurance.auxilary_heating_source=spinnerAuxiliarySource.selectedItem.toString()


            insurance.burglar_alarm=getTextFromRadio(binding,radioBurglerAlarm)
            insurance.fire_alarm=getTextFromRadio(binding,radioFireAlarm)

            insurance.date_of_birth=etDateOfBirth.text.toString()

            insurance.co_applicant=spinnerCoapplicant.selectedItem.toString()

            insurance.no_of_claims_in_10_years=getTextFromRadio(binding,radioGroupClaims)
            insurance.no_of_moratge_for_this_dwelling=getTextFromRadio(binding,radioNoOfMortagages)
            insurance.all_non_smokers=getTextFromRadio(binding,radioAllMemembers)

            return  insurance;
        }
    }


    fun sendMail(context: Context,insurance: Insurance)
    {
        val intent=Intent(Intent.ACTION_SEND)
        intent.type="text/html"

        intent.putExtra(Intent.EXTRA_EMAIL, "youremail@gmail.com")
        intent.setData(Uri.parse("mailto:"+insurance.email))
        intent.putExtra(Intent.EXTRA_SUBJECT, context.getString(R.string.app_name))
        intent.putExtra(Intent.EXTRA_TEXT, insurance.toString())
        context.startActivity(Intent.createChooser(intent, "Send Email"))

    }

    private fun getTextFromRadio(binding: ActivityInsuranceDetailsBinding, radioGroup: RadioGroup): String
    {

        val radioButton=binding.root.findViewById<RadioButton>(radioGroup.checkedRadioButtonId)
        return radioButton.text.toString()

    }
}