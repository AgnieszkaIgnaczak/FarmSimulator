public class Aquaculture extends Pond{

    @Override
    public void swimInAPond(Animal animal) { //przyjmuje obiekt typu animal i z tego obiektu wywołuje metodę canAnAnimalSwim()
        animal.canAnAnimalSwim();
    }

}
