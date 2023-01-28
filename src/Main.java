import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Farm simulator!");

        System.out.println("Please enter owner of the Farm:");
        Scanner scanner1 = new Scanner(System.in);
        String ownerOfTheFarm = scanner1.nextLine();
        System.out.println("Please enter address of the Farm:");
        Scanner scanner2 = new Scanner(System.in);
        String addressOfTheFarm = scanner2.nextLine();
        System.out.println("Please enter area of the Farm:");
        Scanner scanner3 = new Scanner(System.in);
        int areaOfTheFarm = scanner3.nextInt();

        Farm farm = new Farm(ownerOfTheFarm, addressOfTheFarm, areaOfTheFarm,0); //new object of type class Farm, values provided by user saved under fields in class Farm

        System.out.println("Owner of the farm is: " + farm.owner);
        System.out.println("Address of the farm is: " + farm.getAddress());
        System.out.println("Area of the farm is: " + farm.getArea());

        farm.setArea(50);
        System.out.println("New area of the farm is: " + farm.getArea());

        farm.verifyLandRegistrationNr();
        System.out.println("Land Registration Nr of the farm is: " + farm.getLandRegistrationNr());

        farm.barn.feedingTime(); //get to method from object contained in another object

        Barn.cropTime(); //static method from class Barn

        Dog dog = new Dog(30, "shepherd"); //new object outside Barn

        Animal.getCount(); //return the number of animals in the farm
        System.out.println("This is the number of animals in the farm: " + Animal.getCount());

        CatMother catMother = new CatMother("grey");
        CatMother.Kittens kittens = new CatMother.Kittens(5);
        CatMother.FeedingBowl bowl = catMother.new FeedingBowl(6);
        bowl.fillTheBowl(6);
        kittens.lickKittens();
        bowl.colorOfTheCat();

        //new instance of class Harvesting created in order to run the harvesting method which includes the local class Harvester
        Harvesting harvestTime = new Harvesting(); //empty object, constructor automatically created and transparent for programmer
        harvestTime.harvesting();

        //method run on barn object which was instantiated in Farm constructor which was invoked in Main class
        farm.barn.isThereAFoxInTheBarn();

        //abstract method
        Aquaculture aquaculture = new Aquaculture();

        for (Animal a : farm.barn.getAnimals()) { //zmienna pomocnicza a typu Animal, która wskazuje na 1 z elementów tablicy animals
            aquaculture.swimInAPond(a);
        }

        //lub
        Animal[] table = farm.barn.getAnimals(); //zmienna pomocnicza table, która zapamiętuje listę zwierząt z Barn poprzez getter
        for (int i = 1; i <= 4; i++) {
            aquaculture.swimInAPond(table[i]); //każda iteracja bierze inne zwierzę z tablicy i przekazuje jako argument do funkcji swimInAPond
        }

        //static method invoked on abstract class Pond and child class Aquaculture
        Pond.drinkWater();
        Aquaculture.drinkWater();

        //value 6 only for 1st object aquaculture
        System.out.println("Plant value from Pond: " + aquaculture.plantValue);
        aquaculture.plantValue += 4;
        System.out.println("Plant value from Pond: " + aquaculture.plantValue);

        //original plantValue for 2nd object
        Aquaculture aquaculture2 = new Aquaculture();
        System.out.println("Plant value from Pond: " + aquaculture2.plantValue);
    }
}
