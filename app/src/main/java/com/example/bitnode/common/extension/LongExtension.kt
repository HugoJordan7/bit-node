package com.example.bitnode.common.extension

import android.annotation.SuppressLint
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

fun Long.satsToBitcoin(): Double{
    return this/100000000.0
}

@SuppressLint("SimpleDateFormat")
fun Long.unixTimeToDate(): String{
    val date = Date(this * 1000)
    val dataFormat = SimpleDateFormat("dd/MM/yyyy 'às' HH:mm'h'", Locale.getDefault())
    return dataFormat.format(date)
}