package entities;

import java.util.ArrayList;

public class Account {
	
	private String id;
	private ArrayList<Portfolio> portfolios;
	
	public Account(User user) {
		id = user.getUsername();
		portfolios = new ArrayList<Portfolio>();
	}
	
	public String getID() {
		return this.id;
	}

	public void addPortfolio(Portfolio p) {
		this.portfolios.add(p);
	}
	
	public ArrayList<Portfolio> getPortfolios() {
		return this.portfolios;
	}

}
