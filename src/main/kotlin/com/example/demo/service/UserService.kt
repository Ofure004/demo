package com.example.demo.service

import com.example.demo.model.entity.User
//import com.example.demo.model.request.UserCreateRequest
//import com.example.demo.model.request.UserUpdateRequest
//import com.example.demo.repo.UserCreateRepository
//import com.example.demo.model.request.*
import com.example.demo.repo.UserRepository
//import com.example.demo.repo.*
import org.springframework.data.repository.findByIdOrNull
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service
class UserService(val repository: UserRepository){
    fun getUsers() = repository.findAll()


    fun addNewUser(user: User): User =  repository.save(user)

    fun update(user: User): User {
        return if (repository.existsById(user.id)) {
//            assert(user.id == id)
            repository.save(user)
        } else throw ResponseStatusException(HttpStatus.NOT_FOUND, "User not found")
    }
    fun deleteUser(id: Long) {
        if (repository.existsById(id)) repository.deleteById(id)
        else throw ResponseStatusException(HttpStatus.NOT_FOUND, "User not found")
    }
    fun getUserById(id:Long): User = repository.findByIdOrNull(id) ?: throw ResponseStatusException(HttpStatus.NOT_FOUND, "User not found")
}