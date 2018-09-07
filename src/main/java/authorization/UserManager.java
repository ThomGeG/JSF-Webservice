package main.java.authorization;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@SessionScoped
@ManagedBean(name="userManager", eager=true)
public class UserManager implements Serializable {

	private static final long serialVersionUID = 1L;

	private User currentUser;
	
	@ManagedProperty(value="#{userService}")
	private UserService userService;
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	public boolean isSignedIn() {
		return getCurrentUser() != null;
	}
	
	public User getCurrentUser() {
		return currentUser;
	}
	
	public String signIn(String username, String password) {
		
		User u = userService.getUser(username);
		
		if(u == null || password.compareTo(u.getPassword()) != 0) {
			return "signup";
		}
		
		this.currentUser = u;
		return "other"; 
		
	}
	
	public String signOut() {
		
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		
		return "home?faces-redirect=true";
		
	}
	
	public String save(User u) {
		userService.saveUser(u);
		currentUser = u;
		return "home";
	}
	
}
