package com.diego.lab03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_switch_button.*

class SwitchButtonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_switch_button)

        tvtextView.text=switchButton1.isChecked.toString()
        switchButton1.setOnClickListener{
            tvtextView.text = if(switchButton1.isChecked) "Switch is ON" else "Switch is OFF"

        }
        textView2.text=switchButton2.isChecked.toString()
        switchButton2.setOnClickListener{
            textView2.text = when(switchButton2.isChecked){
                true -> "Switch is ON"
                false -> "Switch is OFF"
            }
        }
    }
}