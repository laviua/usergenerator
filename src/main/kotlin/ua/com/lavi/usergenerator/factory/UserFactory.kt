package ua.com.lavi.usergenerator.factory

import ua.com.lavi.usergenerator.FakeUser
import ua.com.lavi.usergenerator.utils.PasswordGenerator
import ua.com.lavi.usergenerator.utils.Transliterator
import java.io.BufferedReader
import java.util.*

/**
 * Created by Oleksandr Loushkin
 */

abstract class UserFactory {

    private val transliterator: Transliterator = Transliterator()

    private val passwordGenerator: PasswordGenerator = PasswordGenerator()

    abstract fun getLastname(): String

    abstract fun getName(): String

    abstract fun getPatronomyc(): String

    fun getUser(): FakeUser {
        val lastname = getLastname()
        val name = getName()
        val patronomyc = getPatronomyc()

        val fullname = "$lastname $name $patronomyc"
        val username = transliterator.transliterate(fullname.replace(" ", "_").toLowerCase())
        val password = passwordGenerator.generatePassword()
        val fakeUser = FakeUser(
                lastname,
                name,
                patronomyc,
                fullname,
                username,
                password)

        return fakeUser
    }


    fun getUsers(count: Int): List<FakeUser> {
        val fakeUsers: MutableList<FakeUser> = ArrayList(count)
        var x = 0
        while (x < count) {
            fakeUsers.add(getUser())
            x++
        }
        return fakeUsers
    }

    protected fun readResourceLines(filename: String): List<String> {
        return this.javaClass.classLoader.getResourceAsStream(filename).bufferedReader().
                use(BufferedReader::readLines)
    }

    protected fun randomStringFromList(list: List<String>): String {
        val rnd = Random().nextInt(list.size)
        return list[rnd]
    }


}
