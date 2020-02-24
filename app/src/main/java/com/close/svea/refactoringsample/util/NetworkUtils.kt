package com.close.svea.refactoringsample.util

import android.content.Context
import android.net.ConnectivityManager

object NetworkUtils {

    fun isConnected(context: Context): Boolean {
        val networkInfo: ConnectivityManager? =
            (context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager)
        return networkInfo?.activeNetworkInfo?.isConnected ?: false
    }
}