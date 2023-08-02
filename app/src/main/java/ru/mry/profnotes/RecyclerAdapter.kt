package ru.mry.profnotes

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import ru.mry.profnotes.databinding.ItemBlankBinding

class RecyclerAdapter(
    private val items: List<String>
    ) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: ItemBlankBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemBlankBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.tvItem.text = items[position]
    }
}