package org.mps.person;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Class for testing Person.java
 *
 * @author Ignacio Martínez Gallardo
 */

/*
* Test cases
* */
class PersonTest {
    Person person, person1, person2, person3, person4, person5, person6;
    List<Person> persons;

    @BeforeEach
    void setup() {
        person = new Person("Ignacio", 21, "Male");
        person1 = new Person("Arturo", 34, "Male");
        person2 = new Person("Maite", 87, "Female");
        person3 = new Person("Paola", 56, "Female");
        person4 = new Person("Jaime", 12, "Male");
        person5 = new Person("Violeta", 47, "Female");
        person6 = new Person("Víctor", 46, "Male");

        persons = new ArrayList<>();
    }

    @AfterEach
    void shutdown() {
        for(Person p : persons) {
            p = null;
        }
    }

    @Test
    void averageAgeOf1MaleShouldReturnHisAge() {
        persons.add(person1);
        double[] obtainedValue = person.averageAgePerGender(persons);
        double expectedValue = 34;
        assertEquals(expectedValue,obtainedValue[0]);
    }

    @Test
    void averageAgeOf1FemaleShouldReturnHerAge() {
        persons.add(person2);
        double[] obtainedValue = person.averageAgePerGender(persons);
        double expectedValue = 87;
        assertEquals(expectedValue,obtainedValue[1]);
    }

    @Test
    void averageAgeOf1MaleAnd1FemaleShouldReturnTheirAge() {
        persons.add(person3);
        persons.add(person4);

        double[] obtainedValue = person.averageAgePerGender(persons);
        double[] expectedValue = new double[2];
        expectedValue[0] = 12;
        expectedValue[1] = 56;

        assertArrayEquals(expectedValue, obtainedValue);
    }

    @Test
    void averageAgeOfAllMalesShouldReturnTheMeanOfTheirAges() {
        persons.add(person1);
        persons.add(person4);
        persons.add(person6);

        double[] obtainedValue = person.averageAgePerGender(persons);
        double expectedValue = 30.666666666666668;

        assertEquals(expectedValue, obtainedValue[0]);
    }

    @Test
    void averageAgeOfAllFemalesShouldReturnTheMeanOfTheirAges() {
        persons.add(person2);
        persons.add(person3);
        persons.add(person5);

        double[] obtainedValue = person.averageAgePerGender(persons);
        double expectedValue = 63.333333333333336;

        assertEquals(expectedValue, obtainedValue[1]);
    }

    @Test
    void averageAgeOfAllPersonsShouldReturnTheMeanOfTheirAges() {
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);
        persons.add(person6);

        double[] obtainedValue = person.averageAgePerGender(persons);
        double[] expectedValue = new double[2];
        expectedValue[0] = 30.666666666666668;
        expectedValue[1] = 63.333333333333336;

        assertArrayEquals(expectedValue, obtainedValue);
    }

}