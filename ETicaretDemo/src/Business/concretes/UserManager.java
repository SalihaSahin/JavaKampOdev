package Business.concretes;

import java.util.regex.Pattern;

import Business.abstracts.UserService;
import Core.GoogleService;
import DataAccess.abstracts.UserDao;
import Entities.concretes.User;

public class UserManager implements UserService{
	
	private UserDao userDao;
	private GoogleService googleService;

	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}
	public UserManager(GoogleService googleService) {
		super();
		this.googleService=googleService;
	}
	

	public static final Pattern Email_Regex = 
			Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

	@Override
	public void register(User user) {
		if(user.getPassword().length() >= 6 && 
				   Email_Regex.matcher(user.getEmail()).find() && 
				   user.getFirstName().length() >=2 && 
				   user.getLastName().length() >= 2 && !userDao.getControl(user.getEmail())) {
					System.out.println("Kayit islemi basarili");
					
					this.userDao.add(user);
					
				}else {
					System.out.println("Kayit islemi gerceklestirilemedi. Lutfen bilgilerinizi kontrol ediniz.");
					return;
				}
		
	}


	@Override
	public void login(String email, String password) {
		for (User user : userDao.getAll()) {
			if(user.getEmail() == email && user.getPassword() == password) {
				System.out.println("Basarili bir sekilde giris yapildi.");
				return;
			}else {
				System.out.println("Emailiniz veya parolanizi hatali girdiniz lütfen kontol edin.");
			}
		}
	}


	@Override
	public void withGooglelogin(User user) {
		
		this.googleService.signUp(" Hoşgeldin "+user.getFirstName());
		
	}
}

