package generator;

import person.PlaceOfResidents;

import java.util.Random;

import static utils.FileReader.getLinesFromFile;

public class PlaceOfResidentsGenerator implements GeneratorInterface {

    Random randomizer = new Random();
    @Override
    public PlaceOfResidents generate(final int code) {
        return new PlaceOfResidents(getLinesFromFile("Address").get(randomizer.nextInt(getLinesFromFile("Address").size())));
    }
}
