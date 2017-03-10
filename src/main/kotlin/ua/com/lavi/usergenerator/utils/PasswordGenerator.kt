package ua.com.lavi.usergenerator.utils

import org.apache.commons.lang3.RandomStringUtils

/**
 * Created by Oleksandr Loushkin
 */

class PasswordGenerator {

    private val DEFAULT_PASSWORD_LENGTH = 8

    fun generatePassword(length: Int): String {
        return RandomStringUtils.randomAlphanumeric(length)
    }

    fun generatePassword(): String {
        return RandomStringUtils.randomAlphanumeric(DEFAULT_PASSWORD_LENGTH)
    }
}
