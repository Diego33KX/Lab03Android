package com.diego.lab03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_toggle_button.*

class ToggleButtonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toggle_button)
        toggleButton1.setOnClickListener{
            when(toggleButton1.isChecked){
                true -> text_view1.text="ToggleButton is ON"
                false -> text_view1.text="ToggleButton is OFF"
            }
        }
        toggleButton2.setOnClickListener{
            when(toggleButton2.isChecked){
                true -> text_view2.text="ToggleButton is ON"
                false -> text_view2.text="ToggleButton is OFF"
            }
        }
    }
}