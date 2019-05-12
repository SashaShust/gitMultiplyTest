package coockingsalad.logic;

import java.util.List;

import coockingsalad.entity.SaladItem;
import coockingsalad.main.SaladException;

public interface IVegetableSearch {
	
	public List<SaladItem> findVegetByFoodEnergy(List<SaladItem> salad, double fromFoodEnergy, double toFoodEnergy) throws SaladException;

}
