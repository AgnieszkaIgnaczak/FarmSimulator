public class Chicken extends Animal{

    private int howManyEggs;

    //2 types of polymorphism, 1) two constructors with different arguments and 2) overridden function from base class

    Chicken(int animalMass) {
        super(animalMass);
        howManyEggs = 0;
    }

    Chicken(int animalMass, int howManyEggs){
        super(animalMass);
        this.howManyEggs = howManyEggs;
    }

    @Override
    public void feed(){
        System.out.println("Kokokokoko!");
    }
}
