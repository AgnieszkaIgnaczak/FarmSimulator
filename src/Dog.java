public class Dog extends Animal{

    private String breed;

    Dog(int animalMass, String breed){
        super(animalMass);
        this.breed = breed;
    }

    @Override
    public void canAnAnimalSwim() {
        System.out.println("Dog can swim quite well.");
    }
}
