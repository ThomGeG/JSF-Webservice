package main.java.authorization;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

@RequestScoped
@ManagedBean(name="loginRequest")
public class LoginRequest {
	
	public String username;
	public String password;
	
	@ManagedProperty("#{userManager}")
	UserManager userManager;
	
	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}
	
	public LoginRequest() {}
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void submit() {
		userManager.signIn(username, password);
	}

}
