package ua.com.lavi.usergenerator.factory

/**
 * Created by Oleksandr Loushkin
 */

class FemaleUserFactory : UserFactory() {

    override fun getLastname(): String {
        return randomStringFromList(readResourceLines("femalelastnames.txt"))
    }

    override fun getName(): String {
        return randomStringFromList(readResourceLines("femalenames.txt"))
    }

    override fun getPatronomyc(): String {
        return randomStringFromList(readResourceLines("femalepatronymics.txt"))
    }
}
