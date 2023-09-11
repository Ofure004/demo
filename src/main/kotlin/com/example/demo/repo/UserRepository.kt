package com.example.demo.repo

import com.example.demo.model.entity.User
import com.example.demo.model.request.*
import org.springframework.data.repository.CrudRepository

interface UserRepository: CrudRepository<User,Long>
//interface UserUpdateRepository: CrudRepository<UserUpdateRequest,Long>
//interface UserCreateRepository: CrudRepository<UserCreateRequest,Long>
//interface UserDeleteRepository: CrudRepository<UserDeleteRequest,Long>