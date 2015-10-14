package my.animals;

public class Animal {

    protected String species;
    protected int age;

    public Animal(String species, int age) {
        this.species = species;
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return getClass().getSimpleName() + "[" + getSpecies() + ", " + getAge() + " years]";
    }
}
