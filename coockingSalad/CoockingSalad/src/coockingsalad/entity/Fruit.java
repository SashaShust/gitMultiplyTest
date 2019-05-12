package coockingsalad.entity;

public class Fruit extends SaladItem {
	private boolean citrus;
	private boolean ripe;
	
	public Fruit() {
	}
	
	public Fruit(String name,boolean citrus, boolean ripe, double foodEnergy, int weight) {
		super(name, foodEnergy, weight);
		this.citrus = citrus;
		this.ripe = ripe;
	}

	public boolean isCitrus() {
		return citrus;
	}

	public void setCitrus(boolean citrus) {
		this.citrus = citrus;
	}

	public boolean isRipe() {
		return ripe;
	}

	public void setRipe(boolean ripe) {
		this.ripe = ripe;
	}
	
	@Override
	public String toString() {
		return "Fruit [citrus=" + citrus + ", ripe=" + ripe + " " + super.toString() + "]";
	}

	

}
