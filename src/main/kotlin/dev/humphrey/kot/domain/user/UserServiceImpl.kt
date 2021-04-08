package dev.humphrey.kot.domain.user

import lombok.extern.slf4j.Slf4j
import org.apache.logging.log4j.LogManager
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.logging.Logger
import javax.transaction.Transactional
import kotlin.math.log

@Service
@Slf4j
class UserServiceImpl constructor(
        @Autowired private val userRepository: UserRepository
) : UserService {
    companion object {
        @Suppress("JAVA_CLASS_ON_COMPANION")
        private val logger = LogManager.getLogger()
    }

    @Transactional
    override fun createUser(name: String, pw: String, email: String): User {
        val doesUserExist = userRepository.existsByName(name = name)
        if (doesUserExist) {
            throw Error("hello world") // FIXME
        }
        val nextUser = userRepository.save(User(name = name, hashedPassword = pw, email = email))
        logger.info("User를 생성했습니다 [{}]", nextUser)
        return nextUser
    }
}