package dev.humphrey.kot.domain.user

import lombok.ToString
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.validation.constraints.Email

@Entity
@ToString
data class User(
        @Id @GeneratedValue val id: Int = 0,
        val name: String,
        @Email @Column(unique = true) val email: String,
        @ToString.Exclude val hashedPassword: String
)