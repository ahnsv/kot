package dev.humphrey.kot.domain

import dev.humphrey.kot.domain.user.UserService
import org.junit.jupiter.api.Test

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest

@DataJpaTest
internal class UserServiceTest constructor(
        @Autowired private val userService: UserService
) {

    @Test
    fun `when user name exists, should throw error`() {
        userService.createUser(name = "hello", pw = "world", email = "hello@world.com")
    }
}