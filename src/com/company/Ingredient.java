package com.company;

public class Ingredient {
    private int idIngredient;
    private String ingredientName;
    private String ingredientDescription;
    private float ingredientQuantity;
    private float ingredientUnitPrice;

    public Ingredient(){
        this.idIngredient=0;
        this.ingredientName="";
        this.ingredientDescription="";
        this.ingredientQuantity=0;
        this.ingredientUnitPrice=0;
    }

    public Ingredient(int idingredient, String ingredientname, String ingredientdescription, float ingredientquantity, float ingredientunitprice){
        this.idIngredient=idingredient;
        this.ingredientName=ingredientname;
        this.ingredientDescription=ingredientdescription;
        this.ingredientQuantity=ingredientquantity;
        this.ingredientUnitPrice=ingredientunitprice;
    }

    public void indicateQuantity(float ingredientquantity){
        this.ingredientQuantity=ingredientquantity;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "idIngredient=" + idIngredient +
                ", ingredientName='" + ingredientName + '\'' +
                ", ingredientDescription='" + ingredientDescription + '\'' +
                ", ingredientQuantity=" + ingredientQuantity +
                ", ingredientUnitPrice=" + ingredientUnitPrice +
                '}';
    }

    public int getIdIngredient() {
        return idIngredient;
    }

    public void setIdIngredient(int idIngredient) {
        this.idIngredient = idIngredient;
    }

    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    public String getIngredientDescription() {
        return ingredientDescription;
    }

    public void setIngredientDescription(String ingredientDescription) {
        this.ingredientDescription = ingredientDescription;
    }

    public float getIngredientQuantity() {
        return ingredientQuantity;
    }


    public float getIngredientUnitPrice() {
        return ingredientUnitPrice;
    }

    public void setIngredientUnitPrice(float ingredientUnitPrice) {
        this.ingredientUnitPrice = ingredientUnitPrice;
    }
}
