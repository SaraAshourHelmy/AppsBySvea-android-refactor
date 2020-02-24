package com.close.svea.refactoringsample.ui

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.close.svea.refactoringsample.data.repository.PlaceRepository
import com.close.svea.refactoringsample.domain.model.PlaceModel
import com.ltmtlu.volvocartask.ui.base.BaseViewModel
import com.ltmtlu.volvocartask.ui.base.ErrorType
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

class ShowPlacesViewModel(context: Context, val placeRepo: PlaceRepository) :
    BaseViewModel(context) {

    private val job = Job()
    private val coroutineScope = CoroutineScope(
        job + Dispatchers.Main + coroutineExceptionHandler
    )

    private var _placesLiveData = MutableLiveData<List<PlaceModel>>()
    val placesLiveData: LiveData<List<PlaceModel>>
        get() = _placesLiveData

    fun fetchPlaces() {
        _hasVisibleProgressLiveData.value = true
        coroutineScope.launch {
            _placesLiveData.value = placeRepo.getAllPlaces().place
            _hasVisibleProgressLiveData.value = false
            checkEmptyList()
        }
    }

    fun checkAndGetPlaces() {
        checkNetwork()
        if (_hasError.value == ErrorType.NO_ERROR) {
            fetchPlaces()
        }

    }

    private fun checkEmptyList() {
        if (_placesLiveData.value!!.isEmpty())
            _hasError.value = ErrorType.TRY_AGAIN
        else
            _hasError.value = ErrorType.NO_ERROR
    }
}