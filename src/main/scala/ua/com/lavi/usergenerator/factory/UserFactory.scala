package ua.com.lavi.usergenerator.factory

import ua.com.lavi.usergenerator.FakeUser
import ua.com.lavi.usergenerator.utils.{PasswordGenerator, Transliterator}

import scala.io.Source
import scala.util.Random

/**
  * Created by Oleksandr Loushkin
  */

abstract class UserFactory {

  val transliterator: Transliterator = new Transliterator()

  private val passwordGenerator: PasswordGenerator = new PasswordGenerator()

  def getLastname(): String

  def getName(): String

  def getPatronomyc(): String

  def getUser(): FakeUser = {
    val lastname: String = getLastname()
    val name: String = getName()
    val patronomyc: String = getPatronomyc()

    val fullname = lastname + " " + name  + " " + patronomyc
    val username = transliterator.transliterate(fullname.replace(" ", "_").toLowerCase())
    val password = passwordGenerator.generatePassword()
    val fakeUser = FakeUser(
      lastname,
      name,
      patronomyc,
      fullname,
      username,
      password)

    fakeUser
  }

  protected def readResourceLines(filename: String): List[String] = {
    Source.fromResource(filename).getLines().toList
  }

  def randomStringFromList(list: List[String]): String = {
    list(new Random().nextInt(list.size))
  }

}
