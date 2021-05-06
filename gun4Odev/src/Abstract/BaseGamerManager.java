package Abstract;

import Entity.Gamer;

public abstract class BaseGamerManager implements GamerService {
		
	@Override
		public void save(Gamer gamer) {
			System.out.println("Saved to db:"+gamer.getFirstname()+" " +gamer.getLastname());
		}
		@Override
		public void update(Gamer gamer) {
			System.out.println("Update to db:"+gamer.getFirstname()+" " +gamer.getLastname());
		}
		@Override
		public void delete(Gamer gamer) {
			System.out.println("Deleted to db:"+gamer.getFirstname()+" " +gamer.getLastname());
		}
}
