package com.ltmtlu.volvocartask.DI

import com.close.svea.refactoringsample.ui.ShowPlacesActivity
import com.close.svea.refactoringsample.util.NetworkUtils
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [PlaceRepoModule::class])
interface PlacesComponent {

    fun inject(placesActivity: ShowPlacesActivity)
}