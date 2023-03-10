package org.mps.person;

import java.text.DecimalFormat;
import java.util.List;

/**
 * Class representing a person with a name, age and gender.
 *
 * @author Ignacio Martínez Gallardo
 */

public class Person {
    private final String name;
    private final int age;
    private final String gender; // Male, Female

    /**
     * Constructs a person with a name, age and gender.
     *
     * @param name the name of the person
     * @param age the age of the person
     * @param gender the gender of the person
     */

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String name() {
        return name;
    }

    public int age() {
        return age;
    }

    public String gender() {
        return gender;
    }

    /**
     * Computes the average age of male and female persons in a list and returns the result in
     * an array of two elements (the first element is the male mean age and the second one is the
     * female mean age)
     *
     * @param persons
     * @return
     */
    public double[] averageAgePerGender(List<Person> persons) {
        double[] res = new double[2];
        res[0] = 0;
        res[1] = 0;

        int contMale = 0;       // Number of male persons in the list
        int contFemale = 0;     // Number of female persons in the list

        for(Person p : persons) {
            if(p.gender().equals("Male")) {
                res[0] += p.age();
                contMale++;
            } else if(p.gender().equals("Female")) {
                res[1] += p.age();
                contFemale++;
            }
        }

        res[0] /= contMale;         // Computes the male mean age
        res[1] /= contFemale;       // Computes the female mean age

        return res;
    }
}
