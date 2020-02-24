package com.close.svea.refactoringsample.ui

import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.close.svea.refactoringsample.DI.ContextModule
import com.close.svea.refactoringsample.DI.ShowPlacesViewModelModule
import com.close.svea.refactoringsample.R
import com.close.svea.refactoringsample.databinding.ShowPlacesActivityBinding
import com.close.svea.refactoringsample.ui.base.BaseActivity
import com.close.svea.refactoringsample.ui.item.PlacesAdapter
import com.ltmtlu.volvocartask.DI.DaggerPlacesComponent
import com.ltmtlu.volvocartask.DI.PlacesComponent
import com.ltmtlu.volvocartask.ui.base.ErrorType
import javax.inject.Inject

class ShowPlacesActivity : BaseActivity(), View.OnClickListener {

    private lateinit var binding: ShowPlacesActivityBinding
    private lateinit var placeComponent: PlacesComponent

    @Inject
    lateinit var viewModel: ShowPlacesViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        observeData()
    }

    override fun init() {
        placeComponent =
            DaggerPlacesComponent.builder().contextModule(ContextModule(applicationContext))
                .showPlacesViewModelModule(ShowPlacesViewModelModule(this))
                .build()
        placeComponent.inject(this)

        binding = DataBindingUtil.setContentView(
            this, R.layout.show_places_activity
        )
        binding.viewModel = viewModel
        binding.setLifecycleOwner(this)
        binding.button.setOnClickListener(this)
    }

    private fun observeData() {
        viewModel.hasError.observe(this, Observer {
            when (it) {
                ErrorType.TRY_AGAIN -> showTryAgainView()
                ErrorType.NETWORK -> showNetworkErrorView()
                ErrorType.GENERAL_ERROR -> showError(binding.parentLayout, viewModel)
                else -> binding.message.visibility = View.GONE
            }
        })

        viewModel.placesLiveData.observe(this, Observer {
            binding.placesRecyclerView.adapter =
                PlacesAdapter(it)
        })

    }

    private fun showTryAgainView() {
        binding.message.text = getString(R.string.try_again_msg)
        binding.message.visibility = View.VISIBLE
    }

    private fun showNetworkErrorView() {
        binding.message.text = getString(R.string.connection_error_msg)
        binding.message.visibility = View.VISIBLE
    }

    override fun onClick(v: View?) {
        viewModel.checkAndGetPlaces()
    }
}

