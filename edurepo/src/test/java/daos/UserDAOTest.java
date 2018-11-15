package daos;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

import entities.User;

import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

public class UserDAOTest {
	
	private UserDAO userdao;
	
	@Before
	public void setUp() {
		this.userdao = new UserDAO();
	}
	
	@Test
	public void test_user_dao_returns_list_of_users() {
		assertTrue(this.userdao.listUsers() instanceof ArrayList);
	}
	


}
