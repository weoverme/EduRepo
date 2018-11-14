package factories;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import entities.Account;
import entities.User;

public class AccountFactoryTest {
	
	private AccountFactory fac;
	
	@Before
	public void setUp() {
		this.fac = new AccountFactory();
	}
	
	@Test
	public void test_new_account_factory_exists() {
		assertNotNull(this.fac);
	}
	
	@Test
	public void test_account_factory_creates_an_account() {
		Account acc = this.fac.createAccount(new User("usern", "pasw"));
		assertNotNull(acc);
	}

}
