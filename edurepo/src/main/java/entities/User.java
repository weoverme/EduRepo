package entities;

public class User {
	
	private String username;
	private String password;
	private boolean loggedIn = false;

	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean getLoggedIn() {
		return this.loggedIn;
	}
	
	public void setLoggedIn(Boolean bool) {
		if (bool) {
			this.loggedIn = true;
		} else {
			this.loggedIn = false;
		}
	}
	

}
