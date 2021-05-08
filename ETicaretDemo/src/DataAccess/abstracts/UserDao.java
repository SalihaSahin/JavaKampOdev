package DataAccess.abstracts;

import java.util.List;

import Entities.concretes.User;

public interface UserDao {
	
	void add(User user);
	void delete(User user);
	List<User> getAll();
	boolean getControl(String email);
	

}
