package coockingsalad.logic;

import java.util.Collections;
import java.util.List;

import coockingsalad.comparator.SaladItemByFoodEnergyComparator;
import coockingsalad.comparator.SaladItemByWeightComparator;
import coockingsalad.entity.SaladItem;

public class SaladSort implements ISaladSort {
	
	public void sortSaladItemsByFoodEnergy(List<SaladItem> saladList) {
		Collections.sort(saladList, new SaladItemByFoodEnergyComparator());
	}
	
	public void  sortSaladItemsByWeight(List<SaladItem> saladList) {
		Collections.sort(saladList, new SaladItemByWeightComparator());
	}
}
