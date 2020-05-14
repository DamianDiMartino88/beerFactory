package com.company;

import java.util.ArrayList;
import java.util.List;

public class Factory {
    private int id;
    private String name;
    private String adress;
    private List<Beer> beersList;

    public Factory(){
        this.id=0;
        this.name="";
        this.adress="";
        this.beersList=new ArrayList<>();
    }

    public Factory(int id, String name, String adress){
        this.id=id;
        this.name=name;
        this.adress=adress;
        this.beersList=new ArrayList<>();
    }

    public void addBeer(Beer newBeer){
        int flag=0;
        for (Beer beer: beersList) {
            if(beer.getBeerName().equals(newBeer.getBeerName()))
            {
                flag=1;
            }
        }
        if(flag==0){
            beersList.add(newBeer);
        }else {
            System.out.println("This Beer Already Exist ( "+newBeer.getBeerName()+" )");
        }
    }

    public void removeBeer(int idBeer){
        int index=-1;
        for (Beer beer: beersList) {
            if(beer.getIdBeer()==idBeer)
            {
                index=beersList.indexOf(beer);
            }
        }
        beersList.remove(index);
    }

    public void beerList(){
        for (Beer beer: beersList) {

            System.out.println(beer.getBeerName());
        }
    }

    @Override
    public String toString() {
        return "Factory{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}
