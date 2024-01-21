package com.example.kotlin_todos.domain.todos.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.Table
import lombok.Getter
import java.util.*

@Entity
@Table(name = "todos")
@Getter
class TodosEntity {
    @Id
    @GeneratedValue(generator = "uuid4")
    private val id: UUID? = null

    private val title: String? = null

    private val description: String? = null

    private val completed = false
}
