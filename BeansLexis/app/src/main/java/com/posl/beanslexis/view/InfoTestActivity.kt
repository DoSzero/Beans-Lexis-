package com.posl.beanslexis.view

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.posl.beanslexis.databinding.ActivityInfoTestBinding
import com.posl.beanslexis.model.Constants

class InfoTestActivity : AppCompatActivity() {

    private lateinit var binding: ActivityInfoTestBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityInfoTestBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnStart.setOnClickListener {
            if (binding.etName.text?.isEmpty() == true) {
                Toast.makeText(this@InfoTestActivity, "Пожалуйста, введите Ваше имя", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this@InfoTestActivity, TestQuestionsActivity::class.java)
                intent.putExtra(Constants.USER_NAME, binding.etName.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }
}