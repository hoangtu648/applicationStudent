package demo;

public class DiscountPricingStrategy implements PricingStrategy {
	private double discountRate;

	public DiscountPricingStrategy(double discountRate) {
		this.discountRate = discountRate;
	}

	public double calculatePrice(Tour tour) {
		return tour.getBasePrice() * (1 - discountRate);
	}

}
