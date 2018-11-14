package entities;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;


public class AccountTest {
	
	private Account account;
	private User mockUser = mock(User.class);

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

}
