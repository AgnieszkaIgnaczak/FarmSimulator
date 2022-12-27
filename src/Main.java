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

        Farm farm = new Farm(ownerOfTheFarm, addressOfTheFarm, areaOfTheFarm); //new object of type class Farm, values provided by user saved under fields in class Farm

        System.out.println("Owner of the farm is: " + farm.owner);
        System.out.println("Address of the farm is: " + farm.getAddress());
        System.out.println("Area of the farm is: " + farm.getArea());

        farm.setArea(50);
        System.out.println("New area of the farm is: " + farm.getArea());
    }
}
