package Abstract;

import Entity.Campaign;
import Entity.Gamer;
import Entity.Product;

public interface SaleService {
	
	void sale(Gamer gamer,Product product,Campaign campaign);

}
