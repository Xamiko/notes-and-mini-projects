package com.medi.todo.database.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.medi.todo.database.local.TodoDao
import com.medi.todo.database.local.Todo

@Database(entities = [Todo::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun todoDao(): TodoDao
}