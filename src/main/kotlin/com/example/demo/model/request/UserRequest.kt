package com.example.demo.model.request

data class UserCreateRequest(
    var firstName: String? = null,
    var lastName: String? = null,
    var password: String? = null,
    var age: Int
)

data class UserReadRequest(
    var id: Long,
    var firstName: String? = null,
    var lastName: String? = null,
    var password: String? = null,
    var age: Int
)

data class UserUpdateRequest(
    var id: Long,
    var firstName: String? = null,
    var lastName: String? = null,
    var password: String? = null,
    var age: Int
)
data class UserDeleteRequest(
    var id: Long
)