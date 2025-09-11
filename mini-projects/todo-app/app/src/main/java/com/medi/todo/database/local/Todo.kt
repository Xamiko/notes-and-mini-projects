package com.medi.todo.database.local

import androidx.room.Entity
import androidx.room.PrimaryKey
// Define the Todo entity with Room annotations
@Entity(tableName = "todo")
data class Todo(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String,
    val isDone: Boolean = false)