package demo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Tour {
    private String name;
    private String description;
    private int days;
    private double basePrice;
    private PricingStrategy pricingStrategy;

    private List<TourObserver> observers = new ArrayList<>();

    public Tour(String name, String description, int days, double basePrice) {
        this.name = name;
        this.description = description;
        this.days = days;
        this.basePrice = basePrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyObservers();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
        notifyObservers();
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
        notifyObservers();
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
        notifyObservers();
    }

    public PricingStrategy getPricingStrategy() {
        return pricingStrategy;
    }

    public void setPricingStrategy(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
        notifyObservers();
    }

    public void attach(TourObserver observer) {
        observers.add(observer);
    }

    public void detach(TourObserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (TourObserver observer : observers) {
            observer.update(this);
        }
    }
}