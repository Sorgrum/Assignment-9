package com.mgheiler.assignment9;

public class Main {

    public static void main(String[] args) {

        // Part 1
        Fish fishA = new Fish("", 0.0);
        Fish fishB = new Fish("", 0.0);
        Fish fishC = new Fish("", 0.0);

        fishA.setSpecies("Trout");
        fishA.setWeight(4.0);

        fishB.setSpecies("Bass");
        fishB.setWeight(2.5);

        fishC.setSpecies("Mahi Mahi");
        fishC.setWeight(40);

        System.out.println(fishA);
        System.out.println(fishB);
        System.out.println(fishC);

        // Part 2
        House houseA = new House(0, 0, 0);
        House houseB = new House(0, 0, 0);

        houseA.setArea(2400);
        houseA.setNumberOfBedrooms(4);
        houseA.setNumberOfBathrooms(2.5);

        houseB.setArea(4800);
        houseB.setNumberOfBedrooms(8);
        houseB.setNumberOfBathrooms(5);

        System.out.println(houseA);
        System.out.println(houseB);

    }
}
