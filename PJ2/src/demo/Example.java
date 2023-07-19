package demo;

public class Example {

	public static void main(String[] args) {
		Tour tour = new Tour("Japan Tour", "A tour to Japan", 10, 1000.0);
		tour.setPricingStrategy(new NormalPricingStrategy());

		TourView view = new TourView();
		TourController controller = new TourController(tour, view);

		// Update the tour details
		controller.setName("Japan Tour 2");
		controller.setDescription("A tour to Japan 2");
		controller.setDays(12);
		controller.setBasePrice(1200.0);
		controller.setPricingStrategy(new DiscountPricingStrategy(0.1));

		// Update the view
		controller.updateView();
	}

}
