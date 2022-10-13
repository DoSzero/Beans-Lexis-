package com.posl.beanslexis.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.posl.beanslexis.databinding.ActivityMenuBinding

class MenuActivity: AppCompatActivity() {

    private lateinit var binding: ActivityMenuBinding
    private val btnAbout by lazy { binding.btnAbout }
    private val btnTest by lazy { binding.btnTest }
    private val btnLearn by lazy { binding.btnLearn }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (supportActionBar != null) {
            this.supportActionBar?.hide();
        }

        btnAbout.setOnClickListener {
            val intent = Intent(this, AboutActivity::class.java)
            startActivity(intent)
        }

        btnTest.setOnClickListener {
            val intent = Intent(this, InfoTestActivity::class.java)
            startActivity(intent)
        }

        btnLearn.setOnClickListener {
            val intent = Intent(this, LessonsActivity::class.java)
            startActivity(intent)
        }
    }
}