package com.example.cleancode.farm;

import com.example.cleancode.farm.animal.Chick;
import com.example.cleancode.farm.animal.Cow;
import com.example.cleancode.farm.animal.Pig;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FarmApplication {

    public static void main(String[] args) {
        new OldMacdonaldJob().liveNormalDayAtFarm(generateCows(), generatePigs(), generateChicks());
    }

    private static List<Cow> generateCows() {
        return IntStream.range(0, 5)
                .mapToObj(i -> new Cow(""+i))
                .collect(Collectors.toList());
    }

    private static List<Pig> generatePigs() {
        return IntStream.range(0, 3)
                .mapToObj(i -> new Pig(""+i))
                .collect(Collectors.toList());
    }

    private static List<Chick> generateChicks() {
        return IntStream.range(0, 7)
                .mapToObj(i -> new Chick(""+i))
                .collect(Collectors.toList());
    }

}
