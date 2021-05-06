package Concrete;

import Abstract.SaleService;
import Entity.Campaign;
import Entity.Gamer;
import Entity.Product;

public class SaleManager implements SaleService{

	@Override
	public void sale(Gamer gamer, Product product, Campaign campaign) {
		double discountPrice = product.getGamePrice() - (product.getGamePrice()*campaign.getDiscount()/100);
		
		System.out.println(gamer.getFirstname()+" "+gamer.getLastname()+" bought the game called "+product.getGameName()+
				" with "+campaign.getDiscount() +"% discount for "+discountPrice+"TL.");
		
	}

}
