package me.freedom4live.patterns.kotlin.factory.method

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class NormalCatFactoryTest {

    private lateinit var catFactory: AbstractCatFactory


    @BeforeEach
    fun setUp() {
        catFactory = NormalCatFactory()
    }

    @Test
    fun createCat_createsCat_hasTheSameMeow() {
        //arrange
        val cat = catFactory.createCat()

        //act
        var previous = cat.meow()
        repeat(1000) {
            val current = cat.meow()

            //assert
            Assertions.assertEquals(previous, current)

            previous = current
        }
    }
}
