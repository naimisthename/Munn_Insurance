package com.example.munninsurance.Model

class Insurance {
    var postalCode: String?=null
    var insurance_policy: String?=null
    var date_need_policy: String?=null
    var first_name: String?=null
    var last_name: String?=null
    var phone: String?=null
    var email: String?=null
    var street_address: String?=null
    var current_insurance_company: String?=null
    var dwelling_replacement_cost: String?=null
    var distance_to_fire_hydrant: String?=null
    var distance_to_fire_hall: String?=null
    var years_at_current_address: String?=null
    var no_of_families_occuping_dwelling: String?=null
    var building_type: String?=null
    var construction_type: String?=null
    var year_built: String?=null
    var primary_heating_source: String?=null
    var auxilary_heating_source: String?=null
    var burglar_alarm: String?=null
    var fire_alarm: String?=null
    var date_of_birth: String?=null
    var co_applicant: String?=null
    var years_with_resendtial_insurance: String?=null
    var no_of_claims_in_10_years: String?=null
    var no_of_moratge_for_this_dwelling: String?=null
    var all_non_smokers: String?=null
    override fun toString(): String {
        return  "======================== INSURANCE DETAILS ===================\n "+
                "\npostalCode= " + postalCode  +
                "\ninsurance_policy= " + insurance_policy  +
                "\ndate_need_policy= " + date_need_policy  +
                "\nfirst_name= " + first_name  +
                "\nlast_name= " + last_name  +
                "\nphone= " + phone  +
                "\nemail= " + email  +
                "\nstreet_address= " + street_address  +
                "\ncurrent_insurance_company= " + current_insurance_company  +
                "\ndwelling_replacement_cost= " + dwelling_replacement_cost  +
                "\ndistance_to_fire_hydrant= " + distance_to_fire_hydrant  +
                "\ndistance_to_fire_hall= " + distance_to_fire_hall  +
                "\nyears_at_current_address= " + years_at_current_address  +
                "\nno_of_families_occuping_dwelling= " + no_of_families_occuping_dwelling  +
                "\nbuilding_type= " + building_type  +
                "\nconstruction_type= " + construction_type  +
                "\nyear_built= " + year_built  +
                "\nprimary_heating_source= " + primary_heating_source  +
                "\nauxilary_heating_source= " + auxilary_heating_source  +
                "\nburglar_alarm= " + burglar_alarm  +
                "\nfire_alarm= " + fire_alarm  +
                "\ndate_of_birth= " + date_of_birth  +
                "\nco_applicant= " + co_applicant  +
                "\nyears_with_resendtial_insurance= " + years_with_resendtial_insurance  +
                "\nno_of_claims_in_10_years= " + no_of_claims_in_10_years  +
                "\nno_of_moratge_for_this_dwelling= " + no_of_moratge_for_this_dwelling  +
                "\nall_non_smokers= " + all_non_smokers ;
    }
}