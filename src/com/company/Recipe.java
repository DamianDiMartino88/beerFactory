package com.company;

import java.util.ArrayList;
import java.util.List;

public class Recipe {
    private int idRecipe;
    private String recipeName;
    private String recipeCountry;
    private List<Ingredient> ingredientsList;

    public Recipe(){
        this.idRecipe=0;
        this.recipeName="";
        this.recipeCountry="";
        this.ingredientsList=new ArrayList<>();
    }

    public Recipe(int idrecipe, String recipename, String recipecountry){
        this.idRecipe=0;
        this.recipeName="";
        this.recipeCountry="";
        this.ingredientsList=new ArrayList<>();
    }

    public void addIngredient(Ingredient newIngredient){
        int flag=0;
        for (Ingredient ingredient: ingredientsList) {
            if(ingredient.getIngredientName().equals(newIngredient.getIngredientName()))
            {
                flag=1;
            }
        }
        if(flag==0){
            ingredientsList.add(newIngredient);
        }else {
            System.out.println("This Ingredient Already Exist ( "+newIngredient.getIngredientName()+" )");
        }
    }

    public void removeIngredient(int idIngredient){
        int index=-1;
        for (Ingredient ingredient: ingredientsList) {
            if(ingredient.getIdIngredient()==idIngredient)
            {
                index=ingredientsList.indexOf(ingredient);
            }
        }
        ingredientsList.remove(index);
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "idRecipe=" + idRecipe +
                ", recipeName='" + recipeName + '\'' +
                ", recipeCountry='" + recipeCountry + '\'' +
                ", ingredientsList=" + ingredientsList +
                '}';
    }

    public int getIdRecipe() {
        return idRecipe;
    }


    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public String getRecipeCountry() {
        return recipeCountry;
    }

    public void setRecipeCountry(String recipeCountry) {
        this.recipeCountry = recipeCountry;
    }

    public List<Ingredient> getIngredientsList() {
        return ingredientsList;
    }

    public void setIngredientsList(List<Ingredient> ingredientsList) {
        this.ingredientsList = ingredientsList;
    }
}
