package com.example.moviesappjetpack.utils

import android.util.Log

object LogManager {

    fun addLog(tag: String, message: String) {
        Log.d(tag, message)
    }

}



