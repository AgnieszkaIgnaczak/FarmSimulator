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

    }
}
