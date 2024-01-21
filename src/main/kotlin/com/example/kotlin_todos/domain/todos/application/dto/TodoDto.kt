package com.example.kotlin_todos.domain.todos.application.dto

import java.time.Instant

data class TodoDto(
    val id: Long,
    val title: String,
    val description: String,
    val done: Boolean,
    val createdAt: Instant,
    val updatedAt: Instant,
)
