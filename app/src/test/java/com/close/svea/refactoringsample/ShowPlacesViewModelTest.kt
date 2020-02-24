package com.close.svea.refactoringsample

import android.content.Context
import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.close.svea.refactoringsample.data.repository.PlaceRepositoryImpl
import com.close.svea.refactoringsample.domain.model.PlaceModel
import com.close.svea.refactoringsample.domain.model.PlacesModel
import com.close.svea.refactoringsample.ui.ShowPlacesViewModel
import com.ltmtlu.volvocartask.ui.base.ErrorType
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.whenever
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.test.setMain
import kotlinx.coroutines.withContext
import org.junit.Assert
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.mockito.Mockito


@ExperimentalCoroutinesApi
class ShowPlacesViewModelTest {


    @get:Rule
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    @get:Rule
    var coroutinesTestRule = CoroutineTestRule()

    private lateinit var mMockContext: Context
    private lateinit var placeRepository: PlaceRepositoryImpl
    private lateinit var showPlacesViewModel: ShowPlacesViewModel
    lateinit var placesModel: PlacesModel
    lateinit var placesEmptyModel: PlacesModel

    @Before
    fun setUp() {
        Dispatchers.setMain(coroutinesTestRule.testDispatcher)
        mMockContext = mock()
        placeRepository = mock()
        showPlacesViewModel = ShowPlacesViewModel(mMockContext, placeRepository)

        // place model
        val placeModel = PlaceModel(
            "london",
            "london", 124.25, 235.14, "description",
            "image/45225555"
        )

        // places model
        val places = listOf(placeModel, placeModel)
        placesModel = PlacesModel(places, 2)
        placesEmptyModel = PlacesModel(listOf(), 0)


    }

    @Test
    fun `test verify call getAllPlaces `() {
        runBlocking {
            withContext(Dispatchers.IO) {
                whenever(placeRepository.getAllPlaces()).thenReturn(placesModel)
                showPlacesViewModel.fetchPlaces()
                Mockito.verify(placeRepository).getAllPlaces()
            }
        }
    }


    @Test
    fun `test result return getAllPlaces`() {
        runBlocking {
            withContext(Dispatchers.IO) {
                whenever(placeRepository.getAllPlaces()).thenReturn(placesModel)
                showPlacesViewModel.fetchPlaces()
                val result = showPlacesViewModel.placesLiveData.value
                Assert.assertEquals(placesModel.place, result)
            }
        }
    }


    @Test
    fun `test assert has no error `() {
        runBlocking {
            withContext(Dispatchers.IO) {
                whenever(placeRepository.getAllPlaces()).thenReturn(placesModel)
                showPlacesViewModel.fetchPlaces()
                Assert.assertEquals(ErrorType.NO_ERROR, showPlacesViewModel.hasError.value)
            }
        }
    }


    @Test
    fun `test assert has visible progress false `() {
        runBlocking {
            withContext(Dispatchers.IO) {
                whenever(placeRepository.getAllPlaces()).thenReturn(placesModel)
                showPlacesViewModel.fetchPlaces()
                Assert.assertEquals(false, showPlacesViewModel.hasVisibleProgressLiveData.value)
            }
        }
    }

    @Test
    fun `test assert places list size `() {
        runBlocking {
            withContext(Dispatchers.IO) {
                whenever(placeRepository.getAllPlaces()).thenReturn(placesModel)
                showPlacesViewModel.fetchPlaces()
                Assert.assertEquals(
                    placesModel.place.size,
                    showPlacesViewModel.placesLiveData.value?.size
                )
            }
        }
    }

    @Test
    fun `test assert empty places list  `() {
        runBlocking {
            withContext(Dispatchers.IO) {
                whenever(placeRepository.getAllPlaces()).thenReturn(placesEmptyModel)
                showPlacesViewModel.fetchPlaces()
                Assert.assertEquals(
                    ErrorType.TRY_AGAIN, showPlacesViewModel.hasError.value
                )
            }
        }
    }
}