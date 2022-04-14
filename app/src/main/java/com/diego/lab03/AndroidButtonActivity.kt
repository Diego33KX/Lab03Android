package com.diego.lab03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.os.Message
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_android_button.*

class AndroidButtonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android_button)

        changeTextButton()
        declareClickListener()

    }
    private fun changeTextButton(){
        Handler(Looper.getMainLooper()).postDelayed({btnSimpleButton.text="New Text Button"},4000)

        Handler(Looper.getMainLooper()).postDelayed({btnButtonIcon.text="New Text Button Icon"},4000)
    }


    private fun declareClickListener(){
        btnSimpleButton.setOnClickListener {
            showToastShort("New Text btnSimpleButton")
        }

        btnButtonIcon.setOnClickListener {
            showToastShort("New Text btnButtonIcon")
        }


    }

    //SE PROGRAMA LAS FUNCIONES DE CADA BOTÓN DE LA VISTA
    fun callRightIconButton(view:android.view.View){
        showToastShort("RightIconButton && callBackgroundImageButton")
    }

    fun callBackgroundImageButton(view:android.view.View){
        showToastShort("callBackgroundImageButton")

    }
    fun callBorderRadiusButton(view:android.view.View){
        showToastShort("CallBorderRadiusButton")
    }

    fun callRoundButton(view:android.view.View){
        showToastShort("callRoundButton")
    }

    fun callMaterialDesignButton(view:android.view.View){
        showToastShort("callMaterialDesignButton")
    }
    private fun showToastShort(message: String)= Toast.makeText(this, message, Toast.LENGTH_LONG).show()

}