package coockingsalad.entity;


public class Berry extends SaladItem {
	private boolean wild;
	private boolean frozen;
	
	public Berry() {
	}

	public Berry(String name, boolean wild, boolean frozen, double foodEnergy, int weight) {
		super(name, foodEnergy, weight);
		this.wild = wild;
		this.frozen = frozen;
	}

	public boolean isWild() {
		return wild;
	}

	public void setWild(boolean wild) {
		this.wild = wild;
	}

	public boolean isFrozen() {
		return frozen;
	}

	public void setFrozen(boolean frozen) {
		this.frozen = frozen;
	}

	@Override
	public String toString() {
		return "Berry [wild=" + wild + ", frozen=" + frozen + " " + super.toString() + "]";
	}
	

}
