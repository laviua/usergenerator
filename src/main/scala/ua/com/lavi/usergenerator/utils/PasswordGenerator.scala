package ua.com.lavi.usergenerator.utils

import scala.util.Random


/**
 * Created by Oleksandr Loushkin
 */

class PasswordGenerator {

    private val DEFAULT_PASSWORD_LENGTH = 8


    def generatePassword(): String = {
        generatePassword(DEFAULT_PASSWORD_LENGTH)
    }

    def generatePassword(length: Int): String = {
        val random = new Random
        val sb = new StringBuilder
        for (i <- 1 to length) {
            sb.append(random.nextPrintableChar)
        }
        sb.toString
    }
}
