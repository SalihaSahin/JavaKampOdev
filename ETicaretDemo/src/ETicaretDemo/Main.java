package ETicaretDemo;

import java.util.Scanner;

import Business.concretes.UserManager;
import Core.GoogleManagerAdapter;
import DataAccess.concretes.UserInMemoryDao;
import Entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		UserManager userManager = new UserManager(new UserInMemoryDao());
		UserManager userManager2 = new UserManager(new GoogleManagerAdapter());
		
		userManager2.withGooglelogin(new User(1,"Saliha","Şahin","salihasahin@gmail.com","123456"));
		userManager.register(new User(1,"Saliha","Şahin","salihasahin@gmail.com","123456"));
		userManager.login("salihasahin@gmail.com","123456");
		
		
		
		
		
	

	}

}
