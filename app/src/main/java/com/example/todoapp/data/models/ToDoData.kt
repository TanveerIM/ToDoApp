package com.example.todoapp.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity("todo_table")
data class ToDoData(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val title: String,
    val description: String
)
