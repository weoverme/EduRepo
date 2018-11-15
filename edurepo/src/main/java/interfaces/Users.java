package interfaces;

import java.util.List;

import entities.User;

public interface Users {
	
	public void addUser(User user);
	public User getUser(String username);
	public void removeUser(String username);
	public void updateUser(User user);
	public List<User> listUsers();

}
