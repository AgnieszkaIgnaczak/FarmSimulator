public class Horse extends Animal{

    private int howFast;

    //2 types of polymorphism, 1) two constructors with different arguments and 2) overridden function from base class

    Horse(int animalMass){
        super(animalMass);
        howFast = 0; //default constructor, milk value is unknown
    }

    Horse(int animalMass, int howFast){
        super(animalMass);
        this.howFast = howFast;
    }

    @Override
    public void feed(){
        System.out.println("Iiiiihahahaaaaaa!");
    }
}
