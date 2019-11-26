package com.example.cleancode.farm.feeding;

import com.example.cleancode.farm.GrassProvider;
import com.example.cleancode.farm.animal.Cattle;
import com.example.cleancode.farm.feeding.FeedingStation;

import java.util.logging.Logger;

public class CattleFeedingStation implements FeedingStation {

    private Logger logger = Logger.getLogger("CattleFeedingStation");

    public CattleFeedingStation(GrassProvider grassProvider) {

    }

    public void feed(Cattle cattle) {
        System.out.println("Just fed the " + cattle.toString());
    }

}
