package com.company;

public abstract class Beer {
    private int idBeer;
    private String beerName;
    private float beerPrice;
    private float beerABV;
    private String beerDescription;

    public Beer(){
        this.idBeer=0;
        this.beerName="";
        this.beerPrice=0;
        this.beerABV=0;
        this.beerDescription="";
    }

    public Beer(int id, String beername, float beerprice, float beerabv, String beerdescription){
        this.idBeer=id;
        this.beerName=beername;
        this.beerPrice=beerprice;
        this.beerABV=beerabv;
        this.beerDescription=beerdescription;
    }

    public abstract double CalculateManufacturingCost(Recipe beerRecipe, boolean beertypegluten);

    @Override
    public String toString() {
        return "Beer{" +
                "idBeer=" + idBeer +
                ", beerName='" + beerName + '\'' +
                ", beerPrice=" + beerPrice +
                ", beerABV=" + beerABV +
                ", beerDescription='" + beerDescription + '\'' +
                '}';
    }

    public int getIdBeer() {
        return idBeer;
    }


    public String getBeerName() {
        return beerName;
    }

    public void setBeerName(String beerName) {
        this.beerName = beerName;
    }

    public float getBeerPrice() {
        return beerPrice;
    }

    public void setBeerPrice(float beerPrice) {
        this.beerPrice = beerPrice;
    }

    public float getBeerABV() {
        return beerABV;
    }

    public void setBeerABV(float beerABV) {
        this.beerABV = beerABV;
    }

    public String getBeerDescription() {
        return beerDescription;
    }

    public void setBeerDescription(String beerDescription) {
        this.beerDescription = beerDescription;
    }
}
