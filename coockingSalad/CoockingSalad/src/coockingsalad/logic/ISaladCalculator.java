package coockingsalad.logic;

import java.util.List;

import coockingsalad.entity.SaladItem;

public interface ISaladCalculator {
	
	public double calculateCalorificValue(List<SaladItem> salad);

}
