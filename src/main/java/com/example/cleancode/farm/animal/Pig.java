package com.example.cleancode.farm.animal;

import com.example.cleancode.farm.animal.Cattle;

public class Pig implements Cattle {

    private String name;
    @Override
    public String toString() {
        return "Pig " + name;
    }

    public Pig(String name) {
        this.name = name;
    }
}
