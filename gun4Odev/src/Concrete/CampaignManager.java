package Concrete;

import Abstract.CampaignService;
import Entity.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println("Campaign added :"+campaign.getCampaignName()+" %"+campaign.getDiscount());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Campaign updated "+campaign.getCampaignName()+" %"+campaign.getDiscount());
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Campaign deleted:"+campaign.getCampaignName());
		
	}

}
