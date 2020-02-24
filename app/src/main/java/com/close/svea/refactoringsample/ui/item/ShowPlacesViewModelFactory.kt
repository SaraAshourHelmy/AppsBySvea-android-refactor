package com.close.svea.refactoringsample.ui.item

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.close.svea.refactoringsample.data.repository.PlaceRepository
import com.close.svea.refactoringsample.ui.ShowPlacesViewModel


class ShowPlacesViewModelFactory(
    val context: Context,
    val placeRepository: PlaceRepository
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ShowPlacesViewModel::class.java)) {
            return ShowPlacesViewModel(context, placeRepository) as T
        }
        throw IllegalArgumentException("ViewModel not found")
    }
}