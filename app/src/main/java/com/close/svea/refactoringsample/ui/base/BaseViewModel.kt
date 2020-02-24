package com.ltmtlu.volvocartask.ui.base

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.close.svea.refactoringsample.util.NetworkUtils
import kotlinx.coroutines.CoroutineExceptionHandler

open class BaseViewModel(val context: Context) : ViewModel() {

    protected var _hasVisibleProgressLiveData = MutableLiveData<Boolean>()
    val hasVisibleProgressLiveData: LiveData<Boolean>
        get() = _hasVisibleProgressLiveData

    protected var _hasError = MutableLiveData<ErrorType>()
    val hasError: LiveData<ErrorType>
        get() = _hasError

//    protected var _hasError = MutableLiveData<Boolean>()
//    val hasError: LiveData<Boolean>
//        get() = _hasError

    protected val coroutineExceptionHandler = CoroutineExceptionHandler { _, throwable ->
        _hasError.value = ErrorType.GENERAL_ERROR
        _hasVisibleProgressLiveData.value = false
    }

    init {
        _hasVisibleProgressLiveData.value = false
        _hasError.value = ErrorType.NO_ERROR
    }

    protected fun checkNetwork() {
        if (!NetworkUtils.isConnected(context))
            _hasError.value = ErrorType.NETWORK
        else {
            _hasError.value = ErrorType.NO_ERROR
        }
    }

    fun resetError() {
        _hasError.value = ErrorType.NO_ERROR
    }


}

enum class ErrorType {
    NETWORK,
    TRY_AGAIN,
    GENERAL_ERROR,
    NO_ERROR
}