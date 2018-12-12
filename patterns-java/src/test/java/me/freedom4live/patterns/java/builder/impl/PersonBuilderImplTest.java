package me.freedom4live.patterns.java.builder.impl;

import me.freedom4live.patterns.java.builder.Person;
import me.freedom4live.patterns.java.builder.PersonBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class PersonBuilderImplTest {

    private PersonBuilder personBuilder;


    @BeforeEach
    void setUp() {
        personBuilder = new PersonBuilderImpl();
    }

    @Test
    void build_noValues_noValuesPerson() {
        //act
        Person person = personBuilder.build();

        //assert
        assertNotNull(person);
        assertNull(person.getFirstName());
        assertNull(person.getLastName());
        assertNull(person.getMiddleName());
        assertNull(person.getAge());
    }

    @Test
    void build_firstNameOnly_firstNameOnly() {
        //arrange
        personBuilder.setFirstName("TEST_FIRST_NAME");

        //act
        Person person = personBuilder.build();

        //assert
        assertNotNull(person);
        assertEquals("TEST_FIRST_NAME", person.getFirstName());
        assertNull(person.getLastName());
        assertNull(person.getMiddleName());
        assertNull(person.getAge());
    }

    @Test
    void build_lastNameOnly_firstNameOnly() {
        //arrange
        personBuilder.setLastName("TEST_LAST_NAME");

        //act
        Person person = personBuilder.build();

        //assert
        assertNotNull(person);
        assertEquals("TEST_LAST_NAME", person.getLastName());
        assertNull(person.getFirstName());
        assertNull(person.getMiddleName());
        assertNull(person.getAge());
    }

    @Test
    void build_middleNameOnly_middleNameOnly() {
        //arrange
        personBuilder.setMiddleName("TEST_MIDDLE_NAME");

        //act
        Person person = personBuilder.build();

        //assert
        assertNotNull(person);
        assertEquals("TEST_MIDDLE_NAME", person.getMiddleName());
        assertNull(person.getFirstName());
        assertNull(person.getLastName());
        assertNull(person.getAge());
    }

    @Test
    void build_ageOnly_ageOnly() {
        //arrange
        Integer randomAge = new Random().nextInt();
        personBuilder.setAge(randomAge);

        //act
        Person person = personBuilder.build();

        //assert
        assertNotNull(person);
        assertEquals(randomAge, person.getAge());
        assertNull(person.getFirstName());
        assertNull(person.getLastName());
        assertNull(person.getMiddleName());
    }

    @Test
    void build_randomAllFields_randomAllFields() {
        for (int i = 0; i < 1000; i++) {
            //arrange
            Integer randomAge = new Random().nextInt();
            String randomFirstName = UUID.randomUUID().toString();
            String randomLastName = UUID.randomUUID().toString();
            String randomMiddleName = UUID.randomUUID().toString();

            personBuilder.setAge(randomAge)
                    .setFirstName(randomFirstName)
                    .setMiddleName(randomMiddleName)
                    .setLastName(randomLastName);

            //act
            Person person = personBuilder.build();

            //assert
            assertNotNull(person);
            assertEquals(randomAge, person.getAge());
            assertEquals(randomFirstName, person.getFirstName());
            assertEquals(randomLastName, person.getLastName());
            assertEquals(randomMiddleName, person.getMiddleName());
        }
    }

}
