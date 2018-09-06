package main.java.authorization;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String username;
	private String password;
	
	public User(String username, String password) {
		setUsername(username);
		setPassword(password);
		System.out.println("Created new user: " + username);
	}
	
	public void setUsername(String username) {
		this.username = username.toLowerCase();
	}
	
	public String getUsername() {
		return username.toLowerCase();
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}
	
}
