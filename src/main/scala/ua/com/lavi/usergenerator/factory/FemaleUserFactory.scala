package ua.com.lavi.usergenerator.factory

/**
 * Created by Oleksandr Loushkin
 */

class FemaleUserFactory extends UserFactory {

    override def getLastname: String = {
        randomStringFromList(readResourceLines("femalelastnames.txt"))
    }

    override def getName: String = {
        randomStringFromList(readResourceLines("femalenames.txt"))
    }

    override def getPatronomyc: String = {
        randomStringFromList(readResourceLines("femalepatronymics.txt"))
    }
}
