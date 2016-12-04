package com.garden;

public abstract class Plant {

    String name;
    String color;
    public int waterLevel;
    public int waterAbsorption;
    public int minWater;
    public boolean toBeWatered;

    public Plant (){
        name = getClass().getSimpleName();
    }

    public Plant (String coloring){
        name = getClass().getSimpleName();
        waterLevel = 0;
        color = coloring;
        toBeWatered = true;
    }

    public void waterStatus(){

        if (toBeWatered){
            System.out.println("The " + this.color + " " + this.name + " needs water.");
        } else {
            System.out.println("The " + this.color + " " + this.name + " doesn't need water.");
        }
    }
}
