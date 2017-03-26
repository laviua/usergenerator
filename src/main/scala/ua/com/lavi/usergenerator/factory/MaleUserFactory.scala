package ua.com.lavi.usergenerator.factory

/**
 * Created by Oleksandr Loushkin
 */

class MaleUserFactory extends UserFactory {

    override def getLastname: String = {
        randomStringFromList(readResourceLines("malelastnames.txt"))
    }

    override def getName: String = {
        randomStringFromList(readResourceLines("malenames.txt"))
    }

    override def getPatronomyc: String = {
        randomStringFromList(readResourceLines("malepatronymics.txt"))
    }
}
