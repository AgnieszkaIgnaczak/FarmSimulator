public class Animal {

    private int animalMass;

    private static int count = 0; //class attribute, counts animals

    Animal(int animalMass) {
        this.count ++; //inner mechanism, does not have to initialized by constructor argument
        this.animalMass = animalMass;
    }

    public void feed() {
        System.out.println("Tasty!");
    }

    public static int getCount() {
        return count;
    }

    public void canAnAnimalSwim() {
        System.out.println("I do not know.");
    }
}
