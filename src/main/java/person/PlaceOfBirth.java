package person;

public class PlaceOfBirth extends Param {

    private final String place;

    public PlaceOfBirth(final String place) {
        this.place = place;
    }

    public String getPlace() {
        return place;
    }

    @Override
    public final String toString() {
        return place;
    }
}
