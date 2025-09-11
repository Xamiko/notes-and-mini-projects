package com.medi.todo.database.repository

import com.medi.todo.database.local.TodoDao
import com.medi.todo.database.local.Todo
import kotlinx.coroutines.flow.Flow

class TodoRepository(private val dao: TodoDao) {
    val allTodos: Flow<List<Todo>> = dao.getAllTodos()

    suspend fun insert(todo: Todo) = dao.insert(todo)
    suspend fun update(todo: Todo) = dao.update(todo)
    suspend fun delete(todo: Todo) = dao.delete(todo)
}