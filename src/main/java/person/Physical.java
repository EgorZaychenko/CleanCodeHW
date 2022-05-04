package person;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Physical extends Param {

    private final int age;
    private final String gender;
    private final LocalDate birthDate;


    public Physical(final int age, final String gender, final LocalDate birthDate) {
        this.age = age;
        this.gender = gender;
        this.birthDate = birthDate;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getBirthDateAsString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String formattedString = birthDate.format(formatter);
        return  formattedString;
    }

    @Override
    public final String toString() {
        return age + " " + gender + " " + birthDate;
    }

}
