public class Farm extends RealEstate {

    //class fields (internal data)
    public Person owner;
    private int area = 0; //0 does not have not be provided

    //constructor with 3 arguments
    Farm(String ow, String ad, int ar) {
        super(ad); //call constructor of RealEstate class
        //class fields
        this.owner = new Person(ow); //value from argument ow is saved in class field owner
        //composition = class Farm uses class Person = object of type Farm will have 1 field of type Person
        this.setArea(ar); //using setter to check if passed argument is correct
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
}
