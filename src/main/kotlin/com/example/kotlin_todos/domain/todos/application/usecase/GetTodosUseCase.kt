package com.example.kotlin_todos.domain.todos.application.usecase

import com.example.kotlin_todos.domain.todos.application.dto.TodoDto
import java.util.SequencedCollection

interface GetTodosUseCase {
    fun getTodos(): SequencedCollection<TodoDto>
}