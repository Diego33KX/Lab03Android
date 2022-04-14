package com.diego.lab03

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class FloatingActionButtonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_floating_action_button)


    }
    fun action(view: android.view.View) {
        Toast.makeText(this, "FAB Action!", Toast.LENGTH_SHORT).show()
    }

}