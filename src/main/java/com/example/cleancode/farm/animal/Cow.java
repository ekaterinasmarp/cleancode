package com.example.cleancode.farm.animal;

public class Cow implements Cattle {
    private final String name;

    @Override
    public String toString() {
        return "Cow " + name;
    }

    public Cow(String name) {
        this.name = name;
    }

}
