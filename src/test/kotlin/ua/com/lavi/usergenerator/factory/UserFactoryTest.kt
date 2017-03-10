package ua.com.lavi.usergenerator.factory

import org.junit.Assert
import org.junit.Test

/**
 * Created by Oleksandr Loushkin
 */

class UserFactoryTest {

    val femaleUserFactory: FemaleUserFactory = FemaleUserFactory()
    val maleUserFactory: MaleUserFactory = MaleUserFactory()

    @Test
    fun testLastname() {
        Assert.assertTrue(femaleUserFactory.getLastname().isNotEmpty())
        Assert.assertTrue(maleUserFactory.getLastname().isNotEmpty())
    }

    @Test
    fun testName() {
        Assert.assertTrue(femaleUserFactory.getName().isNotEmpty())
        Assert.assertTrue(maleUserFactory.getName().isNotEmpty())
    }

    @Test
    fun testPatronomyc() {
        Assert.assertTrue(femaleUserFactory.getPatronomyc().isNotEmpty())
        Assert.assertTrue(maleUserFactory.getPatronomyc().isNotEmpty())
    }

    @Test
    fun testUser() {
        val user = femaleUserFactory.getUser()
        Assert.assertTrue(user.name.isNotEmpty())
        Assert.assertTrue(user.lastname.isNotEmpty())
        Assert.assertTrue(user.patronomyc.isNotEmpty())
        Assert.assertTrue(user.username.isNotEmpty())
        Assert.assertTrue(user.password.isNotEmpty())
        Assert.assertTrue(
                user.fullname.contains(user.name) &&
                user.fullname.contains(user.lastname) &&
                user.fullname.contains(user.patronomyc))

    }

    @Test
    fun testUsersCollection() {
        Assert.assertTrue(femaleUserFactory.getUsers(10).size == 10)
    }

}