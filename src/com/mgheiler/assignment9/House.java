package com.mgheiler.assignment9;

/**
 * Created by mgheiler on 10/12/15.
 */
public class House {

    private int area;
    private int numberOfBedrooms;
    private double numberOfBathrooms;

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public void setNumberOfBedrooms(int numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }

    public double getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public void setNumberOfBathrooms(double numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
    }

    public House(int area, int numberOfBedrooms, double numberOfBathrooms) {
        this.area = area;
        this.numberOfBedrooms = numberOfBedrooms;
        this.numberOfBathrooms = numberOfBathrooms;
    }

    public String toString() {
        return "House[" + getArea() + " sqft, " + getNumberOfBedrooms() + " bedrooms, " + getNumberOfBathrooms() + " baths]";
    }

}
