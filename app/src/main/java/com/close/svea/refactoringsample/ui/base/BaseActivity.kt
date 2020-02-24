package com.close.svea.refactoringsample.ui.base

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.close.svea.refactoringsample.R
import com.google.android.material.snackbar.Snackbar
import com.ltmtlu.volvocartask.ui.base.BaseViewModel

abstract class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
    }

    abstract fun init()

    open fun showError(view: View, viewModel: BaseViewModel) {
        Snackbar.make(view, getString(R.string.error), Snackbar.LENGTH_SHORT).show()
        viewModel.resetError()
    }
}