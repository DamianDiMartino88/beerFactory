package com.company;

public class Blond extends BeerType{

    public Blond(){
        super();
    }

    public Blond(int id, String beername, float beerprice, float beerabv, String beerdescription, Recipe beertyperecipe, float beertypecomplexitypercentage){
        super(id,beername,beerprice,beerabv,beerdescription,beertyperecipe,beertypecomplexitypercentage);
    }

    public double CalculateManufacturingCost(Recipe beerRecipe, boolean beertypegluten){
        double cost = super.CalculateManufacturingCost(beerRecipe,beertypegluten);
        return (cost*(1+(this.getBeerTypeComplexityPercentage()/100)));
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
