public class CatMother {

    private String color;
    private static String breed = "European";

    static class Kittens {

        private int numberOfKittens;

        Kittens(int numberOfKittens) {
            this.numberOfKittens = numberOfKittens;
        }

        public void lickKittens() {
            System.out.println(breed + " mother of the kittens licks " + numberOfKittens + " of them.");
        }
    }

    class FeedingBowl {

        private int bowlVolume;

        FeedingBowl(int bowlVolume) {
            this.bowlVolume = bowlVolume;
        }

        public void fillTheBowl(int catFood) {
            if(catFood > bowlVolume) {
                System.out.println("Too much food!");
            } else {
                System.out.println("Cats will come.");
                callCats();
            }
        }

        public void colorOfTheCat() {
            System.out.println("This bowl belongs to " + color + " cat mother.");
        }
    }

    CatMother(String color) {
        this.color = color;
    }

    public void callCats() {
        System.out.println("Kitty, kitty! " + color);
    }
}
