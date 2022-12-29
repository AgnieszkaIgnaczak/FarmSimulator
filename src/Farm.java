public class Farm extends RealEstate {

    //class fields (internal data)
    public Person owner;
    private int area = 0; //0 does not have to be provided

    public Barn barn;

    //constructor with 4 arguments
    Farm(String ow, String ad, int ar, int lr) { //alle collected arguments from base class + new
        super(ad, lr); //call constructor of RealEstate class
        //class fields
        this.owner = new Person(ow); //value from argument ow is saved in class field owner
        //composition = class Farm uses class Person = object of type Farm will have 1 field of type Person
        this.setArea(ar); //using setter to check if passed argument is correct
        this.barn = new Barn(); //new object of type Barn, for testing
    }

    public int getArea() {
        return area;
    }

    public void setArea(int ar) { //setter, saves new value in field area
        if(ar > 0) {
            this.area = ar;
        } else {
            System.out.println("Area cannot be zero or negative!");
        }
    }

    public void verifyLandRegistrationNr() {
        super.landRegistrationNr = super.getRandomLandRegistrationNr(1,100);
    }
}
