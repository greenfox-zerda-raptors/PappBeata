package com.garden;
import java.util.ArrayList;

public class Garden extends ArrayList<Plant> {

    final String formatForWater = "Watering with %d\n";

    public void water(int amount) {

        System.out.printf(formatForWater, amount);

        int nrToBeWatered = 0;

        for (Plant currPlant : this) {
            if (currPlant.waterLevel < currPlant.minWater) {
                nrToBeWatered++;
                currPlant.toBeWatered = true;
            }
        }
        for (Plant currPlant : this) {
            if (currPlant.toBeWatered) {
                currPlant.waterLevel += currPlant.waterAbsorption * amount / nrToBeWatered / 100;
                currPlant.toBeWatered = currPlant.waterLevel < currPlant.minWater;
                        currPlant.waterStatus();
            } else {
                currPlant.waterStatus();
            }
        }
    }
    public void showGarden() {
        for (Plant currPlant : this) {
            currPlant.waterStatus();
        }
    }
}