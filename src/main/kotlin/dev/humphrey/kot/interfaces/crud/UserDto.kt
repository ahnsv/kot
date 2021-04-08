package dev.humphrey.kot.interfaces.crud

class UserDto {
    data class UserCreation(
            val name: String,
            val pw: String,
            val email: String
    )
}