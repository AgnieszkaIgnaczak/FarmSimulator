public class Duck extends Animal{

    private String featherColor;

    //2 types of polymorphism, 1) two constructors with different arguments and 2) overridden function from base class

    Duck(int animalMass) {
        super(animalMass);
        featherColor = "";
    }

    Duck(int animalMass, String featherColor){
        super(animalMass);
        this.featherColor = featherColor;
    }

    @Override
    public void feed(){
        System.out.println("Kwakwakwa!");
    }

    @Override
    public void canAnAnimalSwim() {
        System.out.println("Duck can swim very good.");
    }
}
