package com.diego.lab03


import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_edit_text.*


class EditTextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.diego.lab03.R.layout.activity_edit_text)

    }
    fun register(view: android.view.View){
        /*
        if(edtfirstName.text.isBlank() && edtlastName.text.isBlank()){
            tvdisplayName.text= "Ingresar texto"
        }else{
            tvdisplayName.text= "Your username is ${edtfirstName.text} ${edtlastName.text}"
        }*/

        when (edtfirstName.text.isBlank() && edtlastName.text.isBlank()){
            true -> tvdisplayName.text= "Ingresar texto"
            false -> tvdisplayName.text= "Your username is ${edtfirstName.text} ${edtlastName.text}"
        }
    }
}