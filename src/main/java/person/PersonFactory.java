package person;

import generator.FioGenerator;
import generator.PhysicalGenerator;
import generator.PlaceOfBirthGenerator;
import generator.PlaceOfResidentsGenerator;

import java.util.Random;

public class PersonFactory {

    static Random randomizer = new Random();

    public static Person getPerson(final int length) {
        int result = randomizer.nextInt(length) + 1;

        return new Person.Builder().
                withFio(new FioGenerator().generate(result)).
                withPhysical(new PhysicalGenerator().generate(result)).
                withPlace(new PlaceOfBirthGenerator().generate(result)).
                withPlaceOfResident(new PlaceOfResidentsGenerator().generate(result)).
                build();
    }
}
