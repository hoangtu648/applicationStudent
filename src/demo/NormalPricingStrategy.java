package demo;

public class NormalPricingStrategy implements PricingStrategy {

	@Override
	public double calculatePrice(Tour tour) {
		// TODO Auto-generated method stub
		 return tour.getBasePrice();
	}

}
