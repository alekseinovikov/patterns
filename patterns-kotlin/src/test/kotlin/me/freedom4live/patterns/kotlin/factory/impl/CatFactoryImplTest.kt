package me.freedom4live.patterns.kotlin.factory.impl

import me.freedom4live.patterns.kotlin.factory.CatFactory
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class CatFactoryImplTest {

    private lateinit var catFactory: CatFactory


    @BeforeEach
    fun setUp() {
        catFactory = CatFactoryImpl()
    }

    @Test
    fun randomCat_normal_instanceIsNotNull() {
        //act
        val cat = catFactory.randomCat()

        //assert
        Assertions.assertNotNull(cat)
    }

    @Test
    fun namedCat_name_isNotNull() {
        //arrange
        val name = "TEST_NAME"

        //act
        val cat = catFactory.namedCat(name)

        //assert
        Assertions.assertNotNull(cat)
    }

    @Test
    fun randomCat_normal_randomMeow() {
        //act
        val cat = catFactory.randomCat()

        //assert
        Assertions.assertNotNull(cat)
        Assertions.assertNotNull(cat.meow())
    }

    @Test
    fun namedCat_name_meowItsName() {
        //arrange
        val name = "TEST_NAME"

        //act
        val cat = catFactory.namedCat(name)

        //assert
        Assertions.assertNotNull(cat)
        Assertions.assertEquals(name, cat.meow())
    }

}
