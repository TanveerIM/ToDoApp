package com.example.todoapp.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
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
    @Query("SELECT * FROM todo_table ORDER BY id ASC")
    fun getAllData(): LiveData<List<ToDoData>>

    @Query("DELETE FROM todo_table")
    suspend fun deleteALl()

    @Query("SELECT * FROM todo_table WHERE title LIKE :searchQuery")
    fun searchItemInDb(searchQuery: String): LiveData<List<ToDoData>>
}