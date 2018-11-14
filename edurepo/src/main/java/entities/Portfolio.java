package entities;

import enums.OperatingSystem;

public class Portfolio {
	
	private OperatingSystem os;
	
	public Portfolio() {
		
	}
	

	public OperatingSystem getOS() {
		return this.os;
	}


	public void setOS(int opSys) {
		if (opSys == 0) {
			this.os = OperatingSystem.WINDOWS;
		} else if (opSys == 1) {
			this.os = OperatingSystem.IOS;
		} else if (opSys == 2) {
			this.os = OperatingSystem.ANDROID;
		} else {
			this.os = null;
		}
	}

}
