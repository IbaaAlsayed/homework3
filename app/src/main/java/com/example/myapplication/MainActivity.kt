package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioGroup
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val pay=findViewById<Button>(R.id.btn)
        val choice=findViewById<RadioGroup>(R.id.radioGroup)
        val cream=findViewById<CheckBox>(R.id.cream)
        val sugar=findViewById<CheckBox>(R.id.sugar)

        pay.setOnClickListener{
            val selectedButton:Int=choice.checkedRadioButtonId
            val btn=findViewById<RadioGroup>(selectedButton)
            var string="$btn"
            if(cream.isChecked){
                string= "$string & cream"
            }
            if(sugar.isChecked){
                string= "$string & Sugar"
            }
            Toast.makeText(this,string,Toast.LENGTH_SHORT).show()
        }
    }
}