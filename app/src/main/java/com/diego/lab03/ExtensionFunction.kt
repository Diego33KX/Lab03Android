package com.diego.lab03

import android.content.Context
import android.widget.Toast
import java.time.Month

fun Context.showToast(message: CharSequence) = Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

fun Context.showToastLong(message: CharSequence) = Toast.makeText(this, message, Toast.LENGTH_LONG).show()

fun Context.formatDate(dayOfMonth: Int, month: Int, year: Int): String {
    val monthCorrect = month + 1
    return "Día: $dayOfMonth - Mes: $monthCorrect - Año: $year"
}

fun Context.formatTime(hora: Int, minuto: Int): String {
    return "Time: $hora : $minuto"
}