package com.example.cleancode.farm.paddock;

import com.example.cleancode.farm.animal.Animal;

import java.util.logging.Logger;

public class Paddock {

    Logger logger = Logger.getLogger("Paddock");

    int width;
    int length;
    MaterialType material;

    public Paddock(int width, int length, MaterialType material, MaterialDeliveryCompany company) {
        this.width = width;
        this.length = length;
        this.material = material;
        company.materialDeal();
    }

    public void lodgeAnimal(Animal animal) {
        System.out.println("New " + animal.toString() + " lodged in "+ this.toString());
    }

    @Override
    public String toString() {
        return "Paddock{" +
                "material=" + material +
                '}';
    }
}
