package com.diego.lab03

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar


class SnackbarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snackbar)

    }

    fun showSnackbar(view: android.view.View?) {

         val mySnackbar = Snackbar.make(
            findViewById(R.id.coordinatorLayout),
            "Hello, I am Android Snackbar!",
            Snackbar.LENGTH_LONG)
        mySnackbar.setAction("Undo"){
            Toast.makeText(this, "Undo proccess!", Toast.LENGTH_SHORT).show();
        }

        mySnackbar.show()


    }
}