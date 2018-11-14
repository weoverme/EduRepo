package factories;

import entities.Account;
import entities.User;

public class AccountFactory {

	public Account createAccount(User user) {
		return new Account(user);
	}

}
