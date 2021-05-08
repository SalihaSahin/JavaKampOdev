package gun4Odev;

import Abstract.BaseGamerManager;
import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GamerManager;
import Concrete.ProductManager;
import Concrete.SaleManager;
import Entity.Campaign;
import Entity.Gamer;
import Entity.Product;

public class Main {

	public static void main(String[] args) {
		
		BaseGamerManager gamerManager = new GamerManager(new MernisServiceAdapter()); 
		Gamer gamer1= new Gamer(1, "SALİHA", "ŞAHİN", "19669109900", 2000);
		gamerManager.save(gamer1);
		
		ProductManager productManager= new ProductManager();
		Product product1= new Product(1,"GTA",50);
		productManager.add(product1);
		productManager.buy(product1,gamer1);
		
		CampaignManager campaignManager= new CampaignManager();
		Campaign campaign1= new Campaign(1, "spring sale", 40);
		campaignManager.add(campaign1);
		
		SaleManager saleManager = new SaleManager();
		saleManager.sale(gamer1, product1, campaign1);
	
		

	}

}

