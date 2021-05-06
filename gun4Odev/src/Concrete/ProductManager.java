package Concrete;

import Abstract.ProductService;
import Entity.Gamer;
import Entity.Product;

public class ProductManager implements ProductService {

	@Override
	public void add(Product product) {
		System.out.println("Game added:"+product.getGameName()+"-"+product.getGamePrice()+"TL");
		
	}

	@Override
	public void update(Product product) {
		System.out.println("Game update:"+product.getGameName() +  " - " + product.getGamePrice() +" TL");		
		
	}

	@Override
	public void delete(Product product) {
		System.out.println("Game deleted:"+product.getGameName());
		
	}
	@Override 
	public void buy(Product product, Gamer gamer) {
		System.out.println(gamer.getFirstname()+" "+gamer.getLastname()+" bought the game called "+product.getGameName());	
	}

}
