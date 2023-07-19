package demo;

public class TourView {
	public void printTourDetails(String name, String description, int days, double price) {
		System.out.println(String.format("Tour name: %s", name));
		System.out.println(String.format("Description: %s", description));
		System.out.println(String.format("Duration: %d days", days));
		System.out.println(String.format("Price: %.2f", price));
	}
}
