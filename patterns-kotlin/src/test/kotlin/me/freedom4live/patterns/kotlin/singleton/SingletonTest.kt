package me.freedom4live.patterns.kotlin.singleton

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertSame
import org.junit.jupiter.api.Test

internal class SingletonTest {

    @Test
    fun getInstance_noCreation_theSame() {
        //arrange
        var previous = Singleton

        repeat(1000) {
            //act
            val current = Singleton


            //assert
            assertEquals(previous, current)
            assertEquals(previous.name, current.name)
            assertSame(previous, current)

            previous = current
        }
    }

}
