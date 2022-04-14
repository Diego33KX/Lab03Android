package com.diego.lab03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_check_box.view.*
import kotlinx.android.synthetic.main.activity_progress_bar.*

class ProgressBarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_progress_bar)
        pb_progressbar1.progress=0

    }
    fun show(view: android.view.View) {
        val progressText = edt_numberText.text.toString().toInt()
        if (progressText in 0..100){

            pb_progressbar1.progress = progressText
        } else {
            Toast.makeText(this, "Numero no permitido", Toast.LENGTH_SHORT).show()
        }
    }

}