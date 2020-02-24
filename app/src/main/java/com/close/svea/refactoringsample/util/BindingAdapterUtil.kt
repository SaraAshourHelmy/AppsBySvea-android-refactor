package com.close.svea.refactoringsample.util

import android.view.View
import androidx.databinding.BindingAdapter


@BindingAdapter("visibility")
fun setErrorVisibility(view: View, isVisible: Boolean) {
    isVisible.let {
        view.visibility = if (isVisible) View.VISIBLE else View.GONE
    }
}