package entities;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

import enums.OperatingSystem;

import static org.mockito.Mockito.*;

import java.util.ArrayList;




public class AccountTest {
	
	private Account account;
	private User mockUser = mock(User.class);
	private Portfolio mockPortfolio = mock(Portfolio.class);

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		when(mockUser.getUsername()).thenReturn("username");
		account = new Account(mockUser);
	}
	
	@Test
	public void test_account_id_matches_mockUser_username() {
		assertEquals("username", account.getID());
	}

	@Test
	public void test_get_list_of_portfolios_returns_empty_list() {
		ArrayList<Portfolio> portfolios = this.account.getPortfolios();
		assertEquals(0, portfolios.size());	
		assertTrue(portfolios.isEmpty());
	}
	
	@Test
	public void test_add_portfolio_to_account() {
		when(mockPortfolio.getOS()).thenReturn(OperatingSystem.IOS);
		this.account.addPortfolio(mockPortfolio);
		ArrayList<Portfolio> portfolios = this.account.getPortfolios();
		assertFalse(portfolios.isEmpty());
		assertEquals(1, portfolios.size());
	}
	
	@Test
	public void test_get_list_of_portfolios_returns_list_with_one_ios_portfolio() {
		when(mockPortfolio.getOS()).thenReturn(OperatingSystem.IOS);
		this.account.addPortfolio(mockPortfolio);
		ArrayList<Portfolio> portfolios = this.account.getPortfolios();
		assertEquals(OperatingSystem.IOS, portfolios.get(0).getOS());
	}
}
