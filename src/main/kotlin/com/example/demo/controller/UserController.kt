package com.example.demo.controller

import com.example.demo.model.entity.User
import com.example.demo.service.UserService
import com.example.demo.model.request.*
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import com.example.demo.model.request.DeleteRequest

@RestController
@RequestMapping("/user")
class UserController(val service: UserService) {
    @PostMapping("/get")
    fun fetch() = service.getUsers()

    @PostMapping("/add")
    fun addUser(@RequestBody user: User) = service.addNewUser(user)

    @PostMapping("/update")
    fun updateUser(@RequestBody user: User) = service.update(user)

    @PostMapping("/delete")
    fun deleteUser(@RequestBody request: UserDeleteRequest) = service.deleteUser(request.id)

    @PostMapping("/retrieve")
    fun getById(@RequestBody request: UserDeleteRequest) = service.getUserById(request.id)
}
