package com.close.svea.refactoringsample

import com.close.svea.refactoringsample.data.network.PlacesApiService
import com.close.svea.refactoringsample.data.repository.PlaceRepositoryImpl
import com.close.svea.refactoringsample.domain.model.PlaceModel
import com.close.svea.refactoringsample.domain.model.PlacesModel
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.verify
import com.nhaarman.mockitokotlin2.whenever
import junit.framework.Assert.assertEquals
import kotlinx.coroutines.*
import kotlinx.coroutines.test.TestCoroutineDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.setMain
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test

@ExperimentalCoroutinesApi
class PlaceRepoTest {

    @get:Rule
    var coroutinesTestRule = CoroutineTestRule()
    private lateinit var service: PlacesApiService
    private lateinit var placeRepository: PlaceRepositoryImpl
    lateinit var placeModel: PlaceModel
    lateinit var placesModel: PlacesModel

    @Before
    fun setup() {
        Dispatchers.setMain(coroutinesTestRule.testDispatcher)
        service = mock()
        placeRepository = PlaceRepositoryImpl(service)

        // place model
        placeModel = PlaceModel(
            "london",
            "london", 124.25, 235.14, "description",
            "image/45225555"
        )

        // places model
        val places = listOf(placeModel, placeModel)
        placesModel = PlacesModel(places, 2)

        whenever(service.getAllPlaces())
            .thenReturn(GlobalScope.async { placesModel })
    }

    @Test
    fun `test call getAllPlaces verify`() {
        runBlocking {
            withContext(Dispatchers.IO)
            {
                placeRepository.getAllPlaces()
                verify(service).getAllPlaces()
            }
        }
    }

    @Test
    fun `test call getAllPlaces result`() {
        runBlocking {
            withContext(Dispatchers.IO)
            {
                val actualCityModel = placeRepository.getAllPlaces()
                assertEquals(placesModel, actualCityModel)
            }
        }
    }

    @After
    fun tearDown() {
        Dispatchers.resetMain()
        coroutinesTestRule.testDispatcher.cleanupTestCoroutines()
    }
}