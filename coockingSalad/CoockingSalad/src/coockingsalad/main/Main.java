package coockingsalad.main;

import java.util.ArrayList;
import java.util.List;

import coockingsalad.entity.Berry;
import coockingsalad.entity.Fruit;
import coockingsalad.entity.SaladItem;
import coockingsalad.entity.Vegetable;
import coockingsalad.logic.ISaladCalculator;
import coockingsalad.logic.ISaladSort;
import coockingsalad.logic.IVegetableSearch;
import coockingsalad.logic.SaladCalculator;
import coockingsalad.logic.SaladSort;
import coockingsalad.logic.VegetableSearch;

public class Main {

	public static List<SaladItem> createTestData() {

		SaladItem fruit1 = new Fruit("orange", true, true, 40, 200);
		SaladItem fruit2 = new Fruit("lemon", true, false, 29, 50);
		SaladItem fruit3 = new Fruit("apple", false, true, 52, 150);
		SaladItem fruit4 = new Fruit("pear", false, true, 57, 130);
		
		SaladItem vegetable1 = new Vegetable("tomato", "Spain", 15, 20, 250);
		SaladItem vegetable2 = new Vegetable("cabbage", "Belarus", 30, 25, 150);
		SaladItem vegetable3 = new Vegetable("carrot", "Ukraine", 43, 32, 120);
		SaladItem vegetable4 = new Vegetable("salad", "Belarus", 10, 17, 100);
		
		SaladItem berry1 = new Berry("bogBlueberry", false, false, 57, 60);
		SaladItem berry2 = new Berry("blackBerry", true, false, 43, 75);
		SaladItem berry3 = new Berry("strawberry", false, true, 33, 120);
		SaladItem berry4 = new Berry("cherry", false, true, 50, 115);
		
		List<SaladItem> salad = new ArrayList<SaladItem>();
		salad.add(fruit1);
		salad.add(fruit2);
		salad.add(fruit3);
		salad.add(fruit4);
		
		salad.add(vegetable1);
		salad.add(vegetable2);
		salad.add(vegetable3);
		salad.add(vegetable4);
		
		salad.add(berry1);
		salad.add(berry2);
		salad.add(berry3);
		salad.add(berry4);
		
		return salad;
	}
	
	public static void main(String[] args) {
		
		List<SaladItem> salad = createTestData();
		
		ISaladCalculator calculator = new SaladCalculator();
		double result = calculator.calculateCalorificValue(salad);
		System.out.println("Calorific value " + result);
		
		try{
			System.out.println();
			IVegetableSearch vegetable = new VegetableSearch();
			List<SaladItem> resultVegetable = vegetable.findVegetByFoodEnergy(salad, 20, 35);
			System.out.println("Vegetable ranged by food energy:");
			for(SaladItem veget : resultVegetable) {
				System.out.println(veget);
			}
		}catch(SaladException e){
			System.out.println(e.getMessage());
		}
		
		System.out.println();
		System.out.println("Sorted salad by food energy:");
		ISaladSort sort = new SaladSort();
		sort.sortSaladItemsByFoodEnergy(salad);
		print(salad);
		
		System.out.println();
		System.out.println("Sorted salad by weight:");
		sort.sortSaladItemsByWeight(salad);
		print(salad);
		
	}
	
	public static void print(List<SaladItem> saladList) {
		for (SaladItem salad : saladList) {
			System.out.println(salad);
		}
	}
}
