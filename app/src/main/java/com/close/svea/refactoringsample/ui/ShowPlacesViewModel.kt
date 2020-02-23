package com.close.svea.refactoringsample.ui

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.close.svea.refactoringsample.data.repository.PlaceRepository
import com.close.svea.refactoringsample.domain.model.Place
import com.ltmtlu.volvocartask.ui.base.BaseViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

class ShowPlacesViewModel(application: Application, val placeRepo: PlaceRepository) :
    BaseViewModel(application) {

    private val job = Job()
    private val coroutineScope = CoroutineScope(
        job + Dispatchers.Main
    )

    private var _placesLiveData = MutableLiveData<List<Place>>()
    val placesLiveData: LiveData<List<Place>>
        get() = _placesLiveData

    fun getAllPlaces() {
        checkNetwork()
        if (_hasNetwork.value!!) {
            coroutineScope.launch {
                _placesLiveData.value = placeRepo.getAllPlaces().place
            }
        }
    }
}