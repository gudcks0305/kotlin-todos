package com.example.kotlin_todos.domain.todos.service
// how to implement in kotlin  ,plz example
// class TodosService implements GetTodosUseCase {
//     @Override
//     public SequencedCollection<TodoDto> getTodos() {
//         return null;
//     }

// }

//

import com.example.kotlin_todos.domain.todos.application.usecase.GetTodosUseCase
import com.example.kotlin_todos.domain.todos.application.dto.TodoDto
import org.springframework.stereotype.Service
import java.util.*

@Service
class TodosService() : GetTodosUseCase {

    override fun getTodos(): SequencedCollection<TodoDto> {
        return null!!
    }
}