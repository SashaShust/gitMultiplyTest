package coockingsalad.logic;

import java.util.List;

import coockingsalad.entity.SaladItem;

public class SaladCalculator implements ISaladCalculator {
	public double calculateCalorificValue(List<SaladItem> salad) {
		double result = 0;
		for (SaladItem i: salad) {
			result += (i.getFoodEnergy() * (double)i.getWeight())/100;
		}
		return result;
	}
}
