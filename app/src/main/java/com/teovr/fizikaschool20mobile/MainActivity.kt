package com.teovr.fizikaschool20mobile

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.widget.VideoView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun toLmicro(view: View) {
        startActivity(Intent(this, L_microMain::class.java))
    }

    fun WIP(view: View) {
        Toast.makeText(this@MainActivity, "В разработке", Toast.LENGTH_LONG).show()
    }

}