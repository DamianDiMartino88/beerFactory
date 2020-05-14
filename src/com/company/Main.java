package com.company;

public class Main {

    public static void main(String[] args) {
    Factory antares = new Factory(1,"Antares","Cordoba 3025");

	Ingredient malt = new Ingredient(1,"Malt","This is Malt",2,3);
	Ingredient hop = new Ingredient(2,"Hop","This is Hop", 4,2);
	Ingredient barley = new Ingredient(3,"Barley","This is Barley", 5,3);
	Ingredient water = new Ingredient(4,"Water","This is Water",10,1);
	Ingredient yeast= new Ingredient(5,"Yeast","This is Yeast",1,2);

	Recipe stoutRecipe =  new Recipe(1,"Stout Recipe","England");
	Recipe ipaRecipe =  new Recipe(1,"IPA Recipe","England");
	Recipe barleyWineRecipe =  new Recipe(1,"Barley Wine Recipe","England");

	Black stout = new Black(1,"Stout", 120, 4,"Stout Beer",stoutRecipe,20);
	Blond ipa = new Blond(2,"IPA", 130, 5,"IPA Beer",ipaRecipe,10);
	Red barleyWine = new Red(3,"Barley Wine", 140, 10,"Barley Wine Beer",barleyWineRecipe,15);

	stoutRecipe.addIngredient(malt);
	stoutRecipe.addIngredient(hop);
	stoutRecipe.addIngredient(yeast);
	stoutRecipe.addIngredient(water);

	ipaRecipe.addIngredient(hop);
	ipaRecipe.addIngredient(barley);
	ipaRecipe.addIngredient(yeast);
	ipaRecipe.addIngredient(water);

	barleyWineRecipe.addIngredient(barley);
	barleyWineRecipe.addIngredient(hop);
	barleyWineRecipe.addIngredient(malt);
	barleyWineRecipe.addIngredient(yeast);
	barleyWineRecipe.addIngredient(water);

		System.out.println("Stout With Gluten Manufacturing Price: $"+stout.CalculateManufacturingCost(stoutRecipe,true));
		System.out.println("Stout Without Gluten Manufacturing Price: $"+stout.CalculateManufacturingCost(stoutRecipe,false));
		System.out.println("IPA Manufacturing Price: $"+ipa.CalculateManufacturingCost(ipaRecipe,true));
		System.out.println("Barley Wine Manufacturing Price: $"+barleyWine.CalculateManufacturingCost(barleyWineRecipe,true));

	antares.addBeer(stout);
	antares.addBeer(ipa);
	antares.addBeer(barleyWine);
	antares.addBeer(stout);

	antares.beerList();
	antares.removeBeer(2);

	antares.beerList();
    }
}
