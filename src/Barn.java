public class Barn { //container for animals

    private Animal[] animals; //array of type Animal named animals

    Barn(){ //no argument constructor - fill array with hardcoded data, only for testing
       animals = new Animal[5]; //declaration of array size
       animals[0] = new Animal(60); //counter starts to count the animals
       animals[1] = new Cow(700, 20);
       animals[2] = new Horse(400,88);
       animals[3] = new Chicken(1, 1);
       animals[4] = new Duck(6, "brown");
    }

    public void feedingTime(){
        for(Animal animalToFeed : animals){ //loop: temporary variable animalToFeed of type Animal, checks/is iterating all elements in the array
            animalToFeed.feed(); //feed method can be run from object of diff types which inherit Animal base class

            if(animalToFeed instanceof Horse){ //instanceof - condition, if temporary variable is showing element of array of type Horse
                animalToFeed.feed(); //then the feed method will be run 2nd time
            }
        }
    }

    public static void cropTime(){ //cropTime static method calling method harvestingTime from class Harvesting
        Harvesting.harvestingTime();
    }
}
