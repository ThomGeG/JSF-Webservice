package main.java.authorization;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UserServiceImpl implements UserService {

	private final Map<String, User> users = new ConcurrentHashMap<>();
	
	@Override
	public User getUser(String username) {
		return users.get(username);
	}
	
	@Override
	public void saveUser(User u) {
		users.put(u.getUsername(), u);
	}
	
}
