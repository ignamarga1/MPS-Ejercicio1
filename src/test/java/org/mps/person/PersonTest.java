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

    }
}