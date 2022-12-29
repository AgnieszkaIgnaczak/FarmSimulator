public class RealEstate {

    private final String address; //encapsulation = hiding of data under private access modificator
    protected int landRegistrationNr;

    public RealEstate(String address, int landRegistrationNr) {
        this.address = address;
        this.landRegistrationNr = landRegistrationNr;
    }

    public String getAddress() { //getter, returns value hidden under private final field
        return address;
    } //getter, returns value hidden under private final field
    public int getLandRegistrationNr() {
        return landRegistrationNr;
    }

    protected int getRandomLandRegistrationNr(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
