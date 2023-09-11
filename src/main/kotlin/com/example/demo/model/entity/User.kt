package com.example.demo.model.entity


import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.GenerationType
import jakarta.persistence.GeneratedValue

@Entity
data class User(
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long,
    var firstName: String? = null,
    var lastName: String? = null,
    var password: String? = null,
    var age: Int
)
