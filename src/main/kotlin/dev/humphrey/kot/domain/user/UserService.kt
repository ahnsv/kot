package dev.humphrey.kot.domain.user

import org.springframework.stereotype.Service

@Service
interface UserService {
    fun createUser(name: String, pw: String, email: String): User
}