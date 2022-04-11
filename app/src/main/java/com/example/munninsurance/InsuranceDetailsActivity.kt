package com.example.munninsurance

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.lifecycle.ViewModelProvider
import com.example.munninsurance.ViewModels.InsuranceViewModel

import   com.example.munninsurance.databinding.ActivityInsuranceDetailsBinding
class InsuranceDetailsActivity : AppCompatActivity() {


    lateinit var binding: ActivityInsuranceDetailsBinding
    lateinit var viewModel: InsuranceViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityInsuranceDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel=ViewModelProvider(this).get(InsuranceViewModel::class.java)



        binding.btnFinish.setOnClickListener {

            if(viewModel.validate(binding))
            {
                val insurance=viewModel.setVals(binding)
                viewModel.sendMail(this,insurance)
                Handler().postDelayed(Runnable {
                    startActivity(Intent(this,ThankYouActivity::class.java).putExtra("Email",insurance.email))

                },3000)
            }

        }
    }
}