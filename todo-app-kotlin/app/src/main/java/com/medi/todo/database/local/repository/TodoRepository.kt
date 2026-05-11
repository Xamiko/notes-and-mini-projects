package com.medi.todo.database.local.repository

import com.medi.todo.database.local.Todo
import com.medi.todo.database.local.TodoDao
import kotlinx.coroutines.flow.Flow

class TodoRepository(private val dao: TodoDao) {

    fun getAllTodos(): Flow<List<Todo>> {
        return dao.getAllTodos()
    }

    suspend fun insert(todo: Todo) {
        dao.insert(todo)
    }

    suspend fun update(todo: Todo) {
        dao.update(todo)
    }

    suspend fun delete(todo: Todo) {
        dao.delete(todo)
    }
}