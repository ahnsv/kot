package dev.humphrey.kot.domain.user

import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface UserRepository: JpaRepository<User, UUID> {
    fun findByName(name: String): User
    fun existsByName(name: String): Boolean
}