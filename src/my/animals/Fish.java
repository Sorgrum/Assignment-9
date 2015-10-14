package my.animals;

/**
 * Created by mgheiler on 10/14/15.
 */
public class Fish extends Animal {

    protected String species;
    protected int age;
    protected int numberOfFins;

    public Fish(String species, int age, int numberOfFins) {
        super(species, age);

        this.species = species;
        this.age = age;
        this.numberOfFins = numberOfFins;
    }

    public void setNumberOfFins(int numberOfFins) {
        this.numberOfFins = numberOfFins;
    }

    public int getNumberOfFins() {
        return numberOfFins;
    }

    public String toString() {
        return super.toString() + "[" + getNumberOfFins() + " fins]";
    }
}
