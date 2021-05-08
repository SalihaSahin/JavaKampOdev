package DataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import DataAccess.abstracts.UserDao;
import Entities.concretes.User;

public class UserInMemoryDao implements UserDao {
	
	List<User> users = new ArrayList<User>();

	@Override
	public void add(User user) {
		users.add(user);
		System.out.println(user.getFirstName()+" "+user.getLastName()+" adli kullanici eklendi");
		
	}

	@Override
	public void delete(User user) {
		user = users.remove(user.getId());
		System.out.println(user.getFirstName()+" "+user.getLastName()+" adli kullanici silindi");
		
	}

	@Override
	public List<User> getAll() {
		return users;
	}

	@Override
	public boolean getControl(String email) {
		for (User user : users) {
			if(user.getEmail().equals(email)) {
				return true;
			}
		}
		return false;
	}



}
