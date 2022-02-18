package com.teovr.fizikaschool20mobile

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.teovr.fizikaschool20mobile.databinding.ActivityLmicroMainBinding

class L_microMain : AppCompatActivity() {
    lateinit var binding: ActivityLmicroMainBinding
    private val adapter = BundleAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityLmicroMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }

    fun tobundle1(view: View) {
        startActivity(Intent(this, Bundle1::class.java))
    }

    fun tobundle2(view: View) {
        startActivity(Intent(this, Bundle2::class.java))
    }
    fun toSite(view: View) {
        val uri = Uri.parse("https://sites.google.com/view/fizika-school20/L-micro")
        startActivity(Intent(Intent.ACTION_VIEW, uri))
    }
}