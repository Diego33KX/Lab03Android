package com.diego.lab03

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.custom_dialog.*

class CustomAlertDialogActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_alert_dialog)
    }
    fun showDialog(view: android.view.View) {
        val dialog = Dialog(this)
        dialog.setContentView(R.layout.custom_dialog)
        // Custom Android Allert Dialog Title
        // Custom Android Allert Dialog Title
        dialog.setTitle("Custom Dialog Example")

        val dialogButtonCancel: Button = dialog.customDialogCancel
        val dialogButtonOk: Button = dialog.customDialogOk
        // Click cancel to dismiss android custom dialog box
        // Click cancel to dismiss android custom dialog box
        dialogButtonCancel.setOnClickListener {
            Toast.makeText(applicationContext, "Cancel process!", Toast.LENGTH_SHORT).show()
            this.showToast("Cancel process!")
            dialog.dismiss()
        }

        // Your android custom dialog ok action
        // Action for custom dialog ok button click

        // Your android custom dialog ok action
        // Action for custom dialog ok button click
        dialogButtonOk.setOnClickListener {
            this.showToast("Success process!")
            dialog.dismiss()
        }

        dialog.show()

    }
}