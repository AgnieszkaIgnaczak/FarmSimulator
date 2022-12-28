public class RealEstate {

    private final String address; //encapsulation = hiding of data under private access modificator

    public RealEstate(String address) {
        this.address = address;
    }

    public String getAddress() { //getter, returns value hidden under private final field
        return address;
    }
}
