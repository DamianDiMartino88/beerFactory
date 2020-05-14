package com.company;

public abstract class BeerType extends Beer{
    private boolean beerTypeGluten=true;
    private Recipe beerTypeRecipe;
    private float beerTypeComplexityPercentage;

    public BeerType(){
        super();
        this.beerTypeRecipe=null;
        this.beerTypeComplexityPercentage=0;
    }

    public BeerType(int id, String beername, float beerprice, float beerabv, String beerdescription, Recipe beertyperecipe, float beertypecomplexitypercentage){
        super(id, beername,beerprice,beerabv,beerdescription);
        this.beerTypeRecipe=beertyperecipe;
        this.beerTypeComplexityPercentage=beertypecomplexitypercentage;
    }


    public double manufactureWithWithoutGluten(Recipe beerRecipe, boolean beertypegluten){
        double cost=0;
        this.beerTypeGluten=(beertypegluten)?true:beertypegluten;
        for (Ingredient ingredient: beerRecipe.getIngredientsList()) {
            cost=cost+(ingredient.getIngredientUnitPrice()*ingredient.getIngredientQuantity());
        }
        return (this.beerTypeGluten)?cost:(cost*1.02);
    }

    public double CalculateManufacturingCost(Recipe beerRecipe, boolean beertypegluten){
        double cost=manufactureWithWithoutGluten(beerRecipe,beertypegluten);

        return cost;
    }

    @Override
    public String toString() {
        return "BeerType{" +
                "beerTypeGluten=" + beerTypeGluten +
                ", beerTypeRecipe=" + beerTypeRecipe +
                ", beerTypeComplexityPercentage=" + beerTypeComplexityPercentage +
                '}';
    }

    public boolean isBeerTypeGluten() {
        return beerTypeGluten;
    }

    public Recipe getBeerTypeRecipe() {
        return beerTypeRecipe;
    }

    public void setBeerTypeRecipe(Recipe beerTypeRecipe) {
        this.beerTypeRecipe = beerTypeRecipe;
    }

    public float getBeerTypeComplexityPercentage() {
        return beerTypeComplexityPercentage;
    }

    public void setBeerTypeComplexityPercentage(float beerTypeComplexityPercentage) {
        this.beerTypeComplexityPercentage = beerTypeComplexityPercentage;
    }
}
