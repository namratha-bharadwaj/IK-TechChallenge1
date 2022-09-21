package com.tps.challenge.features.storefeed

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.tps.challenge.databinding.ItemStoreBinding
import com.tps.challenge.network.model.StoreResponse

/**
 * A RecyclerView.Adapter to populate the screen with a store feed.
 */
class StoreFeedAdapter() : ListAdapter<StoreResponse, StoreItemViewHolder>(StoreDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoreItemViewHolder {
        return StoreItemViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: StoreItemViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }


}

class StoreItemViewHolder(val binding: ItemStoreBinding): RecyclerView.ViewHolder(binding.root) {

    //Bind viewHolder
    fun bind (storeResponse: StoreResponse) {
        binding.storeItem = storeResponse
        binding.executePendingBindings()
    }

    companion object {
        fun from(parent: ViewGroup): StoreItemViewHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            val binding = ItemStoreBinding.inflate(layoutInflater, parent, false)
            return StoreItemViewHolder(binding)
        }
    }

}

class StoreDiffCallback: DiffUtil.ItemCallback<StoreResponse>() {
    override fun areItemsTheSame(oldItem: StoreResponse, newItem: StoreResponse): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: StoreResponse, newItem: StoreResponse): Boolean {
        return oldItem == newItem
    }

}
