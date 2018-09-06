package main.java.authorization;

import java.io.Serializable;

import javax.inject.Named;
import javax.inject.Inject;
import javax.enterprise.context.SessionScoped;

@Named
@SessionScoped
public class UserManager implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private UserService userService;
	
	private User currentUser;
	
	public boolean isSignedIn() {
		return currentUser != null;
	}
	
	public User getCurrentUser() {
		return currentUser;
	}
	
	public String signIn(String username, String password) {
		return null; //TODO
	}
	
	public String signOut() {
		return null; //TODO
	}
	
	public String save(User u) {
		return null; //TODO
	}
	
}
