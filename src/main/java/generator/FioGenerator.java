package generator;

import person.Fio;

import java.util.Random;

import static utils.FileReader.getLinesFromFile;

public class FioGenerator implements GeneratorInterface {
    Random randomizer = new Random();
    @Override
    public Fio generate(final int code) {
        final String gender = (code % 2 == 0) ? "f" : "m";
        return new Fio(getLinesFromFile("names_" + gender).get(randomizer.nextInt(getLinesFromFile("names_" + gender).size())),
                getLinesFromFile("lastNames_" + gender).get(randomizer.nextInt(getLinesFromFile("lastNames_" + gender).size())),
                getLinesFromFile("middleNames_" + gender).get(randomizer.nextInt(getLinesFromFile("middleNames_" + gender).size())));
    }
}
