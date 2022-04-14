package com.diego.lab03

import android.os.Bundle
import android.widget.TimePicker.OnTimeChangedListener
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_time_picker.*


class TimePickerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time_picker)

        timePicker.setOnTimeChangedListener(OnTimeChangedListener { view, hourOfDay, minute ->
            textView.text="Time: $hourOfDay:$minute"
        })
    }

    fun pick(view: android.view.View){
        textView.text=this.formatTime(timePicker.currentHour, timePicker.currentMinute)
    }
}