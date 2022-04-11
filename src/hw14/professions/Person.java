package hw14.professions;

import java.time.LocalDate;
import java.time.Period;


public class Person {
    private String name;
    private String surname;
    private double age;

    LocalDate dateOfBirth = LocalDate.of(1992, 6, 2);
    LocalDate date = LocalDate.now();

    Period period = Period.between(dateOfBirth, date);

    public Person(){}

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(double age) {
        this.age = age;
    }


    public Person(String name, String surname, double age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", surname='" + surname + '\'' +
                        ", age=" + period.getYears()
                ;
    }
}

