package person;

public class Person {
    private Fio fio;
    private Physical phys;
    private PlaceOfBirth place;
    private PlaceOfResidents placeOfResidentes;

    @Override
    public final String toString() {
        return fio + " " + phys + " " + place + " " + placeOfResidentes;
    }

    public Fio getFio() {
        return fio;
    }

    public Physical getPhys() {
        return phys;
    }

    public PlaceOfBirth getPlace() {
        return place;
    }

    public PlaceOfResidents getPlaceOfResidentes() {
        return placeOfResidentes;
    }

    public static final class Builder {
        private Fio fio;
        private Physical phys;
        private PlaceOfBirth place;
        private PlaceOfResidents placeOfResidentes;


        public Builder() {

        }

        public Builder withFio(final Fio newFio) {
            fio = newFio;
            return this;
        }

        public Builder withPhysical(final Physical newPhys) {
            phys = newPhys;
            return this;
        }

        public Builder withPlace(final PlaceOfBirth newPlace) {
            place = newPlace;
            return this;
        }

        public Builder withPlaceOfResident(final PlaceOfResidents newPlaceOfResidentes) {
            placeOfResidentes = newPlaceOfResidentes;
            return this;
        }


        public Person build() {
            final Person person = new Person();
            person.fio = this.fio;
            person.phys = this.phys;
            person.place = this.place;
            person.placeOfResidentes = this.placeOfResidentes;
            return person;
        }
    }
}