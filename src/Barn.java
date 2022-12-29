public class Barn { //container for animals

    private Animal[] animals; //array of type Animal named animals

    Barn(){ //no argument constructor - fill array with hardcoded data, only for testing
       animals = new Animal[5];
       animals[0] = new Animal(60);
       animals[1] = new Cow(700, 20);
       animals[2] = new Horse(400,88);
       animals[3] = new Chicken(1, 1);
       animals[4] = new Duck(6, "brown");
    }

    public void feedingTime(){
        for(Animal animalToFeed : animals){
            animalToFeed.feed();
        }
    }
}
