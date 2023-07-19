package demo;

public class TourController {
	private Tour model;
	private TourView view;

	public TourController(Tour model, TourView view) {
		this.model = model;
		this.view = view;
	}

	public void setName(String name) {
		model.setName(name);
	}

	public void setDescription(String description) {
		model.setDescription(description);
	}

	public void setDays(int days) {
		model.setDays(days);
	}

	public void setBasePrice(double basePrice) {
		model.setBasePrice(basePrice);
	}

	public void setPricingStrategy(PricingStrategy pricingStrategy) {
		model.setPricingStrategy(pricingStrategy);
	}

	public void updateView() {
		view.printTourDetails(model.getName(), model.getDescription(), model.getDays(),
				model.getPricingStrategy().calculatePrice(model));
	}
}
