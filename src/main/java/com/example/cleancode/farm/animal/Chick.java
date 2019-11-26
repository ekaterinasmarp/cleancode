package com.example.cleancode.farm.animal;

public class Chick implements Bird {
    private String name;

    public Chick(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Chick " + name;
    }
}
