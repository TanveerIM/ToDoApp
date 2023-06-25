package com.example.todoapp.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Update
import com.example.todoapp.data.models.ToDoData

@Dao
interface ToDoDao {

    @Insert
    suspend fun insertToDo(toDoData: ToDoData)

    @Update
    suspend fun updateToDo(toDoData: ToDoData)

    @Delete
    suspend fun deleteItem(toDoData: ToDoData)
}