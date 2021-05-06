package Concrete;

import Abstract.BaseGamerManager;
import Abstract.GamerCheckService;
import Entity.Gamer;

public class GamerManager extends BaseGamerManager {
	
	private GamerCheckService gamerCheckService;
	
	public GamerManager(GamerCheckService gamerCheckService) {
		
		this.gamerCheckService=gamerCheckService;
	}
	
	@Override
	public void save(Gamer gamer) {
		if(gamerCheckService.CheckIfRealPerson(gamer)) {
			super.save(gamer);
		}
		else {
			System.out.println("Not a valid person");
		}
	}
	
	@Override
	public void update(Gamer gamer) {
		if(gamerCheckService.CheckIfRealPerson(gamer)) {
			super.update(gamer);
		}
		else {
			System.out.println("Not a valid person");
		}
	}
	
	@Override 
	public void delete(Gamer gamer) {
		System.out.println(" Gamer deleted:"+gamer.getFirstname()+" "+gamer.getLastname());
	}

}
