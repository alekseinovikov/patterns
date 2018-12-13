package me.freedom4live.patterns.kotlin.factory.method

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class CrazyCatFactoryTest {

    private lateinit var catFactory: AbstractCatFactory


    @BeforeEach
    fun setUp() {
        catFactory = CrazyCatFactory()
    }

    @Test
    fun createCat_createsCat_hasDifferentMeows() {
        //arrange
        val cat = catFactory.createCat()

        //act
        var previous = cat.meow()

        repeat(1000) {
            val current = cat.meow()

            //assert
            Assertions.assertNotEquals(previous, current)

            previous = current
        }
    }
}
