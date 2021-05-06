package Abstract;

import Entity.Gamer;

public interface GamerService {
	
	void save(Gamer gamer);
	void delete(Gamer gamer);
	void update(Gamer gamer);
	
}
