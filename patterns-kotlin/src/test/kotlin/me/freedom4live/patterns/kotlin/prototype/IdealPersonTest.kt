package me.freedom4live.patterns.kotlin.prototype

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.util.*

internal class IdealPersonTest {

    @Test
    fun randomObject_clone_notTheSame() {
        repeat(1000) {
            //arrange
            val person = IdealPerson(UUID.randomUUID().toString())

            //act
            val clone = person.clone()

            //assert
            assertNotNull(clone)
            assertEquals(person.name, clone.name)
            assertNotSame(person, clone)
        }
    }

}
