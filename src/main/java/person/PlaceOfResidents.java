package person;

public class PlaceOfResidents extends Param {
    private final String address;

    public PlaceOfResidents(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public String[] getAddressByWord() {
        String[] dictionary = address.split("\\s");
        return dictionary;
    }

    @Override
    public final String toString() {
        return address;
    }
}
