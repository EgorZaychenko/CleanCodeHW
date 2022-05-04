package generator;

import person.PlaceOfBirth;

import java.util.Random;

import static utils.FileReader.getLinesFromFile;

public class PlaceOfBirthGenerator implements GeneratorInterface {

    Random randomizer = new Random();
    @Override
    public PlaceOfBirth generate(final int code) {
        return new PlaceOfBirth(getLinesFromFile("City").get(randomizer.nextInt(getLinesFromFile("City").size())));
    }
}
