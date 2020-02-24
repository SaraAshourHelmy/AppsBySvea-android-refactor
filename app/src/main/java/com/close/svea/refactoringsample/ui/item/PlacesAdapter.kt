package com.close.svea.refactoringsample.ui.item

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.close.svea.refactoringsample.databinding.RecyclerItemBinding
import com.close.svea.refactoringsample.domain.model.PlaceModel

class PlacesAdapter(private var places: List<PlaceModel>) :
    RecyclerView.Adapter<PlacesAdapter.PlaceViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaceViewHolder {
        val binding = RecyclerItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent, false
        )
        return PlaceViewHolder(binding)
    }

    override fun getItemCount(): Int = places.size

    override fun onBindViewHolder(holder: PlaceViewHolder, position: Int) {
        holder.bind(places[position])
    }

    class PlaceViewHolder(private val binding: RecyclerItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(placeModel: PlaceModel) {
            binding.name.text = placeModel.name
            binding.description.text = placeModel.description
        }
    }
}
