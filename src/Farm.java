public class Farm {

    //class fields (internal data)
    public String owner = "";
    private final String address; //encapsulation = hiding of data under private access modificator
    private int area = 0;

    //constructor with 3 arguments
    Farm(String ow, String ad, int ar) {
        //class fields
        this.owner = ow; //value from argument ow is saved in class field owner
        this.address = ad;
        this.setArea(ar); //using setter to check if passed argument is correct
    }

    public String getAddress() { //getter, returns value hidden under private final field
        return address;
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
