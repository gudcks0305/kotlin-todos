package com.example.kotlin_todos.domain.todos.infra.web

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1")
class TodoController {

    @GetMapping("/todos")
    fun getTodos(): String {
        return "Hello World"
    }


}