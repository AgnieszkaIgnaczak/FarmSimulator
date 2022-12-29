public class Cow extends Animal{

    private int howMuchMilk;

    //2 types of polymorphism, 1) two constructors with different arguments and 2) overridden function from base class

    Cow(int animalMass){
        super(animalMass);
        howMuchMilk = 0; //default constructor, milk value is unknown
    }

    Cow(int animalMass, int howMuchMilk){
        super(animalMass);
        this.howMuchMilk = howMuchMilk;
    }

    @Override
    public void feed(){
        System.out.println("Muuuuuuu!");
    }
}
