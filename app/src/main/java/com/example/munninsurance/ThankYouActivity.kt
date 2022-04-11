package com.example.munninsurance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.munninsurance.databinding.ActivityThankYouBinding

class ThankYouActivity : AppCompatActivity() {

    lateinit var binding:ActivityThankYouBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityThankYouBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val email=intent.getStringExtra("Email")

        binding.txtMessage.text="Thank you! we will send you the quote to ${email} ."
    }
}