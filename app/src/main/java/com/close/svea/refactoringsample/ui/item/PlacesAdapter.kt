package com.close.svea.refactoringsample.ui.item

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.close.svea.refactoringsample.R
import com.close.svea.refactoringsample.domain.model.PlaceModel
import kotlinx.android.synthetic.main.recycler_item.view.*

class PlacesAdapter(private var places: List<PlaceModel>) :
    RecyclerView.Adapter<PlacesAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.recycler_item, parent, false)
        return ViewHolder(
            view
        )
    }

    override fun getItemCount(): Int = places.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.name.text = places[position].name
        holder.itemView.description.text = places[position].description
        Log.e("icon",places[position].icon)
    }
}
