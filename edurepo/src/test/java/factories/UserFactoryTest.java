package factories;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import entities.User;

public class UserFactoryTest {
	
	private UserFactory fac;
	
	@Before
	public void setUp() {
		fac = new UserFactory();
	}
	
	@Test
	public void test_user_is_created() {
		User user = fac.createUser("name", "pass");
		assertNotNull(user);
	}

}
