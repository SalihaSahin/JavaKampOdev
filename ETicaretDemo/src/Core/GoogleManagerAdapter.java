package Core;

import Google.GoogleManager;

public class GoogleManagerAdapter implements GoogleService {

	@Override
	public void signUp(String message) {
		GoogleManager manager= new GoogleManager();
		manager.signUp(message);
		
	}

}
