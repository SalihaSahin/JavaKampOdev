package Abstract;

import Entity.Product;
import Entity.Gamer;

public interface ProductService {
	void add(Product product);
	void update(Product product);
	void delete(Product product);
	void buy(Product product, Gamer gamer);
}
