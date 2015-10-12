package com.mgheiler.assignment9;

/**
 * Created by mgheiler on 10/12/15.
 */
public class Fish {

    private String species;
    private double weight;

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSpecies() {
        return species;
    }

    public double getWeight() {
        return weight;
    }

    public Fish(String species, double weight) {
        this.species = species;
        this.weight = weight;
    }

    public String toString() {
        return "Fish[" + getSpecies() + ", " + getWeight() + " lbs]";
    }
}
