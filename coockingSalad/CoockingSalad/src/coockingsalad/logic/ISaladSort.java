package coockingsalad.logic;

import java.util.List;

import coockingsalad.entity.SaladItem;

public interface ISaladSort {
	
	public void sortSaladItemsByFoodEnergy(List<SaladItem> saladList);
	
	public void sortSaladItemsByWeight(List<SaladItem> saladList);

}
