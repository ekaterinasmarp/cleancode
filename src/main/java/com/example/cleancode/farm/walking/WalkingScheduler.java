package com.example.cleancode.farm.walking;

import com.example.cleancode.farm.animal.Animal;

import java.util.logging.Logger;

public class WalkingScheduler {

    Logger logger = Logger.getLogger("WalkingScheduler");

    private FenceController fenceController;

    public WalkingScheduler(FenceController fenceController) {

        this.fenceController = fenceController;
    }

    public void initializeWalking(Animal animal) {
        System.out.println("Initialised walking for the animal " + animal.toString());
    }
}
