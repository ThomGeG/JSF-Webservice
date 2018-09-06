package main.java.authorization;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ApplicationScoped
@ManagedBean(name="userService")
public class UserServiceImpl implements UserService {

	private final Map<String, User> users = new ConcurrentHashMap<>();
	
	public UserServiceImpl() {
		users.put("tom", new User("Tom", "password")); //TODO - Delete this dummy user
	}
	
	@Override
	public User getUser(String username) {
		return users.get(username.toLowerCase());
	}
	
	@Override
	public void saveUser(User u) {
		users.put(u.getUsername().toLowerCase(), u);
	}
	
}
