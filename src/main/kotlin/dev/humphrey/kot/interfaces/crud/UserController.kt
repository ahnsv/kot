package dev.humphrey.kot.interfaces.crud

import dev.humphrey.kot.domain.user.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/user")
class UserController constructor(
        @Autowired private val userService: UserService
) {

    @PostMapping("/create")
    fun signUp(@RequestBody userCreation: UserDto.UserCreation) {
        userService.createUser(userCreation.name, userCreation.pw, userCreation.email);
    }
}