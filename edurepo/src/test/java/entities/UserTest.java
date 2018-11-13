package entities;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class UserTest {
	
	private User user;
	
	@Before
	public void setUp() {
		this.user = new User("user", "pass");
	}
	
	@Test
	public void test_user_has_username_and_password() {
		assertEquals("user", this.user.getUsername());
		assertEquals("pass", this.user.getPassword());
	}

	@Test
	public void test_user_loggedIn_is_true() {
		this.user.setLoggedIn(true);
		assertEquals(true, this.user.getLoggedIn());
	}
	
	@Test
	public void test_user_loggedIn_is_false() {
		assertEquals(false, this.user.getLoggedIn());
	}
	
	
}
