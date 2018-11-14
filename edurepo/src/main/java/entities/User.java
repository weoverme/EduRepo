package entities;

import factories.AccountFactory;

public class User {
	
	private String username;
	private String password;
	private Account account;
	private boolean loggedIn = false;

	public User(String username, String password) {
		this.username = username;
		this.password = password;
		
		AccountFactory accFactory = new AccountFactory();
		this.account = accFactory.createAccount(this);
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
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

	public Account getAccount() {
		return this.account;
	}	

}
