package me.freedom4live.patterns.java.prototype;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class IdealPersonTest {

    @Test
    void clone_random_theSameObject() throws CloneNotSupportedException {
        for (int i = 0; i < 1000; i++) {
            //arrange
            IdealPerson person = new IdealPerson(UUID.randomUUID().toString());

            //act
            IdealPerson clonedPerson = person.clone();

            //assert
            assertNotNull(clonedPerson);
            assertEquals(person.getName(), clonedPerson.getName());
            assertNotSame(person, clonedPerson);
        }
    }

}
