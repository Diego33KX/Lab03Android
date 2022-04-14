package com.diego.lab03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_check_box.view.*
import kotlinx.android.synthetic.main.activity_radio_buttont.*
import kotlinx.android.synthetic.main.activity_radio_buttont.view.*

class RadioButtontActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio_buttont)
        answer()
    }
    fun answer(){
        btnButton.setOnClickListener{

            val id: Int = radioGroup.checkedRadioButtonId
            if (id!=-1){
                val radio:RadioButton = findViewById(id)
                Toast.makeText(applicationContext,"Your selected :" + " ${radio.text}", Toast.LENGTH_SHORT).show()
            }else{

                Toast.makeText(applicationContext,"Your selected :" + " nothing selected", Toast.LENGTH_SHORT).show()
            }
        }
    }

    fun radioButtonClicked(view: android.view.View){

        val radio: RadioButton = findViewById(radioGroup.checkedRadioButtonId)
        Toast.makeText(applicationContext,"Your selected : ${radio.text}", Toast.LENGTH_SHORT).show()
    }

}