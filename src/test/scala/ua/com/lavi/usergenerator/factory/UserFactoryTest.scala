import org.junit.{Assert, Test}
import ua.com.lavi.usergenerator.factory.{FemaleUserFactory, MaleUserFactory}

/**
  * Created by Oleksandr Loushkin on 27.03.17.
  */

@Test
class UserFactoryTest {

  val femaleUserFactory: FemaleUserFactory = new FemaleUserFactory()
  val maleUserFactory: MaleUserFactory = new MaleUserFactory()

  import org.junit.Test

  @Test
  def testLastname() {
    Assert.assertTrue(!femaleUserFactory.getLastname.isEmpty)
    Assert.assertTrue(!maleUserFactory.getLastname.isEmpty)
  }

  @Test
  def testName() {
    Assert.assertTrue(!femaleUserFactory.getName.isEmpty)
    Assert.assertTrue(!maleUserFactory.getName.isEmpty)
  }

  @Test
  def testPatronomyc() {
    Assert.assertTrue(!femaleUserFactory.getPatronomyc.isEmpty)
    Assert.assertTrue(!maleUserFactory.getPatronomyc.isEmpty)
  }

  @Test
  def testUser() {
    val user = femaleUserFactory.getUser()
    Assert.assertTrue(!user.name.isEmpty)
    Assert.assertTrue(!user.lastname.isEmpty)
    Assert.assertTrue(!user.patronomyc.isEmpty)
    Assert.assertTrue(!user.username.isEmpty)
    Assert.assertTrue(!user.password.isEmpty)
    Assert.assertTrue(
      user.fullname.contains(user.name) &&
        user.fullname.contains(user.lastname) &&
        user.fullname.contains(user.patronomyc))

  }

  @Test
  def testUsersCollection() {
    Assert.assertTrue(femaleUserFactory.getUsers(10).size == 10)
  }
}