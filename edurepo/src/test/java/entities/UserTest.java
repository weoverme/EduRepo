package entities;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

public class UserTest {
	
	private User user;
	private Account mockAccount = mock(Account.class);
	private Portfolio mockPortfolio = mock(Portfolio.class);
	
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
	
	@Test
	public void test_user_has_an_account() {
		assertNotNull(this.user.getAccount());
	}
	
	@Test
	public void test_user_can_access_account_details() {
		Account acc = this.user.getAccount();
		assertEquals("user", acc.getID());
	}
	
	@Test
	public void test_user_can_get_list_of_portfolios() {
		Account acc = this.user.getAccount();
		ArrayList<Portfolio> portfolios = acc.getPortfolios();

		assertNotNull(portfolios);
		acc.addPortfolio(mockPortfolio);
		acc.addPortfolio(mockPortfolio);
		assertEquals(2, portfolios.size());
	}
	
}
