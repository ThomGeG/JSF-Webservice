package main.java.authorization;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean
public class UserDetails {
	
	@ManagedProperty(value="#{userManager}")
	private UserManager userManager;
	
	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}
	
	private User user;

	public User getUser() {
		return user;
	}
	
	public void onLoad() {
		if(userManager.isSignedIn())
			user = userManager.getCurrentUser();
		else
			user = new User();
	}
	
	public String submit() {
		
		userManager.save(user);
		
		return "home";
		
	}

	
}
