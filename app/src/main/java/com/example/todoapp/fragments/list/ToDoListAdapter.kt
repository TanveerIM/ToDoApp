package com.example.todoapp.fragments.list

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.todoapp.data.models.ToDoData

class ToDoListAdapter(
    private val onClick: (ToDoData) -> Unit
) : ListAdapter<ToDoData, ToDoListAdapter.ToDoViewHolder>(ToDoDiffCallback){

    class ToDoViewHolder(
        itemView: View,
        val onCLick: (ToDoData) -> Unit
    ) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ToDoListAdapter.ToDoViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ToDoListAdapter.ToDoViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    object ToDoDiffCallback : DiffUtil.ItemCallback<ToDoData>() {
        override fun areItemsTheSame(oldItem: ToDoData, newItem: ToDoData): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: ToDoData, newItem: ToDoData): Boolean {
            return oldItem.id == newItem.id
        }

    }
}