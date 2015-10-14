package my.animals;

/**
 * Created by mgheiler on 10/14/15.
 */
public class Runner {
    public static void main(String[] args) {
        Animal zebra = new Animal("Zebra", 9);
        Fish guppy = new Fish("Trout", 3, 4);
        System.out.println(zebra);
        System.out.println(guppy);
    }
}
