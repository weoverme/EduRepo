package daos;

import java.util.ArrayList;
import java.util.List;

import entities.User;
import interfaces.Users;

public class UserDAO implements Users {
	
	private List<User> users = new ArrayList<User>();

	public void addUser(User user) {
		// TODO Auto-generated method stub

	}

	public User getUser(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	public void removeUser(String username) {
		// TODO Auto-generated method stub

	}

	public void updateUser(User user) {
		// TODO Auto-generated method stub

	}

	public List<User> listUsers() {
		return this.users;
	}

}
