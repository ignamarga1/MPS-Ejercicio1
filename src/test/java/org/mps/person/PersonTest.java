package org.mps.person;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

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
    Person person;
    List<Person> persons;

    @BeforeEach
    void setup() {
        person = new Person("Ignacio", 21, "Male");

        persons = new ArrayList<>();
    }

    @AfterEach
    void shutdown() {
        for(Person p : persons) {
            p = null;
        }
    }
}