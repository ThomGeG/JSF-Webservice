package main.java.authorization;

public interface UserService {

	User getUser(String username);

	void saveUser(User u);

}
