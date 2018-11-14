package entities;

public class Account {
	
	private String id;
	
	public Account(User user) {
		id = user.getUsername();
	}
	
	public String getID() {
		return this.id;
	}

}
