package com.diego.lab03

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_date_picker.*
import java.text.SimpleDateFormat
import java.util.*

class DatePickerActivity : AppCompatActivity() {
    private lateinit var tvDatePicker: TextView
    private lateinit var btnDatePicker: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_date_picker)

        dp_datePicker.init(Calendar.YEAR,Calendar.MONTH,Calendar.DAY_OF_MONTH){ datePicker, year, month, dayOfMonth ->
            tv_display_date.text = this.formatDate(dayOfMonth, month, year)
        }
    }

    fun pick(view: android.view.View) {
        tv_display_date.text = this.formatDate(dp_datePicker.dayOfMonth, dp_datePicker.month, dp_datePicker.year)
    }
}