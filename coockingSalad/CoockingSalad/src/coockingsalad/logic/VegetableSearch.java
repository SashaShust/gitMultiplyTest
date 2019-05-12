package coockingsalad.logic;

import java.util.ArrayList;
import java.util.List;

import coockingsalad.entity.SaladItem;
import coockingsalad.entity.Vegetable;
import coockingsalad.main.SaladException;

public class VegetableSearch implements IVegetableSearch {
	
	public List<SaladItem> findVegetByFoodEnergy(List<SaladItem> salad, double fromFoodEnergy, double toFoodEnergy) throws SaladException{ 
		
		if (fromFoodEnergy > toFoodEnergy || fromFoodEnergy < 0 || toFoodEnergy < 0){
			SaladException e = new SaladException("Error! Incorrect params");
			throw e;
			//throw new SaladException("Error! Incorrect params");
		}
		
		List<SaladItem> listResult = new ArrayList<SaladItem>();
		
		for (SaladItem vegetable : salad){
			if ((vegetable instanceof Vegetable) && (vegetable.getFoodEnergy() >= fromFoodEnergy && vegetable.getFoodEnergy() < toFoodEnergy)) {
				listResult.add(vegetable);
			}	
		}
		return listResult ;
		
	}

}
