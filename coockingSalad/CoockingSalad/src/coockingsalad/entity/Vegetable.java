package coockingsalad.entity;

public class Vegetable extends SaladItem {
	private String countryOfManufacture;
	private int timeForCoocking;
	
	public Vegetable() {
	}

	public Vegetable(String name, String countryOfManufacture, int timeForCoocking, double foodEnergy, int weight) {
		super(name, foodEnergy, weight);
		this.countryOfManufacture = countryOfManufacture;
		this.timeForCoocking = timeForCoocking;
	}
	

	public String getCountryOfManufacture() {
		return countryOfManufacture;
	}

	public void setCountryOfManufacture(String countryOfManufacture) {
		this.countryOfManufacture = countryOfManufacture;
	}

	public int getTimeForCoocking() {
		return timeForCoocking;
	}

	public void setTimeForCoocking(int timeForCoocking) {
		this.timeForCoocking = timeForCoocking;
	}
	
	
	@Override
	public String toString() {
		return "Vegetable [countryOfManufacture=" + countryOfManufacture
				+ ", timeForCoocking=" + timeForCoocking + " " + super.toString() + "]";
	}

	
}
