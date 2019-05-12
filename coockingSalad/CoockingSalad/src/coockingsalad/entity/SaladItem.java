package coockingsalad.entity;

public class SaladItem {
	private double foodEnergy;
	private int weight;
    private String name;
    
    public SaladItem() {
		super();
	}

	public SaladItem( String name, double foodEnergy, int weight) {
		super();
		this.name = name;
		this.foodEnergy = foodEnergy;
		this.weight = weight;	
	}
	

	public double getFoodEnergy() {
		return foodEnergy;
	}
	public void setFoodEnergy(double foodEnergy) {
		this.foodEnergy = foodEnergy;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "SaladItem [foodEnergy=" + foodEnergy + ", weight=" + weight
				+ ", name=" + name + "]";
	}
	
}
