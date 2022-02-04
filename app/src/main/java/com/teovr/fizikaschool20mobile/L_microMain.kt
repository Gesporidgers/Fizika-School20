package com.teovr.fizikaschool20mobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.teovr.fizikaschool20mobile.databinding.ActivityLmicroMainBinding

class L_microMain : AppCompatActivity() {
    lateinit var binding: ActivityLmicroMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityLmicroMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val DescP1 = listOf(
            "Весы электронные",
            "Измерительный цилиндр ",
        )
        val DeskP2 = listOf(
            "предел измерения не менее 200г",
            "предел измерения 250 мл (C= 2мл) (мензурка)",
        )
    }
}