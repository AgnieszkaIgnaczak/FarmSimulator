public class Harvesting {

    //static method
    public static void harvestingTime() {
        System.out.println("Harvest the crop.");
    }

    //method with local class
    public void harvesting() {

        //field of method, which includes local class

        final String harvesterOwner = "Agnieszka Ignaczak";

        //local class
        class Harvester {

            //fields of local class
            private boolean isAutomatic;
            private String wheelType;

            //constructor of local class in the block
            Harvester(boolean isAutomatic, String wheelType) {
                this.isAutomatic = isAutomatic;
                this.wheelType = wheelType;
            }

            //method which includes condition, in the block of local class

            public void startHarvesting() {
                if(isAutomatic) {
                    System.out.println("Harvester has been programmed.");
                } else {
                    System.out.println("Driver " + harvesterOwner + " is needed."); //goes to value from outer class flied
                }
            }
        }

        //new objects of local class instantiated in local class
        Harvester combine1 = new Harvester(true,"caterpillar");
        Harvester combine2 = new Harvester(false,"wheels");
        combine1.startHarvesting();
        combine2.startHarvesting();
    }
}
