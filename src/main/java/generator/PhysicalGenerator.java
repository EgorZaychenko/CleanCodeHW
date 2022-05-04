package generator;

import person.Physical;

import java.time.LocalDate;
import java.time.Period;
import java.util.concurrent.ThreadLocalRandom;

public class PhysicalGenerator implements GeneratorInterface {
    private static final LocalDate startDate = LocalDate.of(1990, 1, 1);

    @Override
    public Physical generate(final int code) {
        int age;
        String gender;
        LocalDate birthDate;

        gender = (code % 2 == 0) ? "Female" : "Male";

        long start = startDate.toEpochDay();
        LocalDate endDate = LocalDate.now();
        long end = endDate.toEpochDay();
        long randomEpochDay = ThreadLocalRandom.current().longs(start, end).findAny().getAsLong();
        birthDate = LocalDate.ofEpochDay(randomEpochDay);

        age = Period.between(birthDate, endDate).getYears();

        return new Physical(age, gender, birthDate);
    }
}
