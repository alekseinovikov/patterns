package me.freedom4live.patterns.kotlin.builder

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.util.*
import kotlin.random.Random

internal class PersonTest {

    @Test
    fun instance_noFields_allAreNull() {
        //act
        val person = Person()

        //assert
        assertNotNull(person)
        assertNull(person.firstName)
        assertNull(person.lastName)
        assertNull(person.middleName)
        assertNull(person.age)
    }

    @Test
    fun instance_onlyFirstName_onlyFirstName() {
        //act
        val person = Person(firstName = "TEST_FIRST_NAME")

        //assert
        assertNotNull(person)
        assertEquals("TEST_FIRST_NAME", person.firstName)
        assertNull(person.lastName)
        assertNull(person.middleName)
        assertNull(person.age)
    }

    @Test
    fun instance_onlyLastName_onlyLastName() {
        //act
        val person = Person(lastName = "TEST_LAST_NAME")

        //assert
        assertNotNull(person)
        assertEquals("TEST_LAST_NAME", person.lastName)
        assertNull(person.firstName)
        assertNull(person.middleName)
        assertNull(person.age)
    }

    @Test
    fun instance_onlyMiddleName_onlyMiddleName() {
        //act
        val person = Person(middleName = "TEST_MIDDLE_NAME")

        //assert
        assertNotNull(person)
        assertEquals("TEST_MIDDLE_NAME", person.middleName)
        assertNull(person.firstName)
        assertNull(person.lastName)
        assertNull(person.age)
    }

    @Test
    fun instance_onlyAge_onlyAge() {
        //arrange
        val randomAge = Random.nextInt()

        //act
        val person = Person(age = randomAge)

        //assert
        assertNotNull(person)
        assertEquals(randomAge, person.age)
        assertNull(person.firstName)
        assertNull(person.lastName)
        assertNull(person.middleName)
    }

    @Test
    fun instance_allRandom_allEquals() {
        repeat(1000) {
            //arrange
            val randomAge = Random.nextInt()
            val firstName = UUID.randomUUID().toString()
            val lastName = UUID.randomUUID().toString()
            val middleName = UUID.randomUUID().toString()

            //act
            val person = Person(age = randomAge, firstName = firstName, lastName = lastName, middleName = middleName)

            //assert
            assertNotNull(person)
            assertEquals(randomAge, person.age)
            assertEquals(firstName, person.firstName)
            assertEquals(lastName, person.lastName)
            assertEquals(middleName, person.middleName)
        }
    }

}
