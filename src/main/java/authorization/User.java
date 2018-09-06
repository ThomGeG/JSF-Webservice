package main.java.authorization;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	private String username;
	private String password;
	
	public User(String username, String password) {
		setUsername(username);
		setPassword(password);
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getUsername() {
		return null;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
