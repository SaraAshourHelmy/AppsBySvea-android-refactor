package com.ltmtlu.volvocartask.DI

import com.close.svea.refactoringsample.DI.ShowPlacesViewModelModule
import com.close.svea.refactoringsample.ui.ShowPlacesActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ShowPlacesViewModelModule::class])
interface PlacesComponent {

    fun inject(placesActivity: ShowPlacesActivity)
}