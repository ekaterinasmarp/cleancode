package com.example.cleancode.farm;

import com.example.cleancode.farm.animal.Chick;
import com.example.cleancode.farm.animal.Cow;
import com.example.cleancode.farm.animal.Pig;
import com.example.cleancode.farm.feeding.BirdFeedingStation;
import com.example.cleancode.farm.feeding.CattleFeedingStation;
import com.example.cleancode.farm.paddock.MaterialDeliveryCompany;
import com.example.cleancode.farm.paddock.MaterialType;
import com.example.cleancode.farm.paddock.Paddock;
import com.example.cleancode.farm.walking.FenceController;
import com.example.cleancode.farm.walking.WalkingScheduler;

import java.util.List;

public class OldMacdonaldJob {

    public void liveNormalDayAtFarm(List<Cow> cows, List<Pig> pigs, List<Chick> chicks) {
        MaterialDeliveryCompany materialDeliveryCompany = new MaterialDeliveryCompany();
        lodgeAnimals(cows, materialDeliveryCompany);
        feedAnimals(cows, pigs, chicks);
        organizeFreeWalkingConditions(chicks, materialDeliveryCompany);
    }

    private void organizeFreeWalkingConditions(List<Chick> chicks, MaterialDeliveryCompany materialDeliveryCompany) {
        // create walking schedule
        WalkingScheduler walkingScheduler = new WalkingScheduler(new FenceController(MaterialType.Wood, materialDeliveryCompany));
        for (Chick chick : chicks) {
            walkingScheduler.initializeWalking(chick);
        }
    }

    private void feedAnimals(List<Cow> cows, List<Pig> pigs, List<Chick> chicks) {
        // prepare food station for chicks
        BirdFeedingStation birdFeedingStation = new BirdFeedingStation(new GrainProvider(""));
        for (Chick chick : chicks) {
            birdFeedingStation.feed(chick);
        }
        // prepare feed station for cattle
        CattleFeedingStation cattleFeedingStation = new CattleFeedingStation(new GrassProvider("x600 - grass authority"));
        for (Cow cow : cows) {
            cattleFeedingStation.feed(cow);
        }
        for (Pig pig : pigs) {
            cattleFeedingStation.feed(pig);
        }
    }

    private void lodgeAnimals(List<Cow> cows, MaterialDeliveryCompany materialDeliveryCompany) {
        // build paddock
        Paddock paddock = new Paddock(1, 2, MaterialType.Wood, materialDeliveryCompany);
        for (Cow cow : cows) {
            paddock.lodgeAnimal(cow);
        }
    }

}
