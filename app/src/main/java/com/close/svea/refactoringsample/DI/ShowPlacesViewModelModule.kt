package com.close.svea.refactoringsample.DI

import android.content.Context
import androidx.lifecycle.ViewModelProviders
import com.close.svea.refactoringsample.data.repository.PlaceRepositoryImpl
import com.close.svea.refactoringsample.ui.ShowPlacesActivity
import com.close.svea.refactoringsample.ui.ShowPlacesViewModel
import com.close.svea.refactoringsample.ui.item.ShowPlacesViewModelFactory
import com.ltmtlu.volvocartask.DI.PlaceRepoModule
import dagger.Module
import dagger.Provides

@Module(includes = [PlaceRepoModule::class])
class ShowPlacesViewModelModule(val activity: ShowPlacesActivity) {

    @Provides
    fun provideShowPlaceViewModel(placesViewModelFactory: ShowPlacesViewModelFactory): ShowPlacesViewModel {
        return ViewModelProviders.of(activity, placesViewModelFactory)
            .get(ShowPlacesViewModel::class.java)
    }

    @Provides
    fun providePlaceFactory(
        context: Context,
        placeRepository: PlaceRepositoryImpl
    ): ShowPlacesViewModelFactory {
        return ShowPlacesViewModelFactory(context, placeRepository)
    }
}