package com.medi.todo.ui.todo_list

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.medi.todo.database.local.Todo
import com.medi.todo.database.repository.TodoRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

class TodoViewModel(private val repository: TodoRepository) : ViewModel() {

    val todos: Flow<List<Todo>> = repository.allTodos

    fun addTodo(title: String) {
        viewModelScope.launch {
            repository.insert(Todo(title = title, isDone = false))
        }
    }

    fun toggleDone(todo: Todo) {
        viewModelScope.launch {
            repository.update(todo.copy(isDone = !todo.isDone))
        }
    }

    fun deleteTodo(todo: Todo) {
        viewModelScope.launch {
            repository.delete(todo)
        }
    }
}