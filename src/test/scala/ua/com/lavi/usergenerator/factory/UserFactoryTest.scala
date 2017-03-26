import org.junit.{Assert, Test}
import ua.com.lavi.usergenerator.factory.{FemaleUserFactory, MaleUserFactory}

/**
 * Created by Oleksandr Loushkin on 27.03.17.
 */

@Test
class UserFactoryTest {

    val femaleUserFactory: FemaleUserFactory = new FemaleUserFactory()
    val maleUserFactory: MaleUserFactory = new MaleUserFactory()

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

}