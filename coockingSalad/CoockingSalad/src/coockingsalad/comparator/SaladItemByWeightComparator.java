package coockingsalad.comparator;

import java.util.Comparator;

import coockingsalad.entity.SaladItem;

public class SaladItemByWeightComparator implements Comparator<SaladItem> {

	@Override
	public int compare(SaladItem o1, SaladItem o2) {
		return o1.getWeight() - o2.getWeight();
	}
}
