package com.medi.todo

import android.app.Application
import androidx.room.Room
import com.medi.todo.database.local.AppDatabase

class TodoApplication : Application(){
    lateinit var database: AppDatabase
        private set

    override fun onCreate() {
        super.onCreate()
        database = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java,
            "todo-database"
        ).build()
    }
}