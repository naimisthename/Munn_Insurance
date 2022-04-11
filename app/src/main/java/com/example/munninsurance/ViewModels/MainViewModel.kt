package com.example.munninsurance.ViewModels

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.core.content.ContextCompat.startActivity
import androidx.lifecycle.ViewModel
import com.example.munninsurance.R


class MainViewModel : ViewModel()
{

    fun callNum(context: Context)
    {
        val intent=Intent(Intent.ACTION_DIAL, Uri.parse("tel:" +context.getString(R.string._1_844_554_0525)))
        context.startActivity(intent)
    }

}