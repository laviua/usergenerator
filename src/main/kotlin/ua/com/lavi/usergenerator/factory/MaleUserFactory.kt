package ua.com.lavi.usergenerator.factory

/**
 * Created by Oleksandr Loushkin
 */

class MaleUserFactory : UserFactory() {

    override fun getLastname(): String {
        return randomStringFromList(readResourceLines("malelastnames.txt"))
    }

    override fun getName(): String {
        return randomStringFromList(readResourceLines("malenames.txt"))
    }

    override fun getPatronomyc(): String {
        return randomStringFromList(readResourceLines("malepatronymics.txt"))
    }
}
