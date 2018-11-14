package entities;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

import enums.OperatingSystem;

import static org.mockito.Mockito.*;

public class PortfolioTest {
	
	private Portfolio portfolio;
	
	@Before
	public void setUp() {
		this.portfolio = new Portfolio();
	}
	
	@Test
	public void test_portfolio_exists() {
		assertNotNull(this.portfolio);
	}
	
	@Test
	public void test_portfolio_os_is_set_to_0_windows() {
		this.portfolio.setOS(0);
		assertEquals(OperatingSystem.WINDOWS, this.portfolio.getOS());
	}
	
	@Test
	public void test_portfolio_os_is_set_to_1_ios() {
		this.portfolio.setOS(1);
		assertEquals(OperatingSystem.IOS, this.portfolio.getOS());
	}
	
	@Test
	public void test_portfolio_os_is_set_to_2_android() {
		this.portfolio.setOS(2);
		assertEquals(OperatingSystem.ANDROID, this.portfolio.getOS());
	}
}
