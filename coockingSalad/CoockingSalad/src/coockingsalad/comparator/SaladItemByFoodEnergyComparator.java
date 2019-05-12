package coockingsalad.comparator;

import java.util.Comparator;

import coockingsalad.entity.SaladItem;

public class SaladItemByFoodEnergyComparator implements Comparator<SaladItem> {

	@Override
	public int compare(SaladItem o1, SaladItem o2) {
		
		return new Double(o1.getFoodEnergy()).compareTo(new Double(o2.getFoodEnergy()));
	}
}
