package me.freedom4live.patterns.java.factory.impl;

import me.freedom4live.patterns.java.factory.Cat;
import me.freedom4live.patterns.java.factory.CatFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CatFactoryImplTest {

    private CatFactory catFactory;


    @BeforeEach
    void setUp() {
        catFactory = new CatFactoryImpl();
    }

    @Test
    void createRandomCat_normal_createdAnInstance() {
        //act
        Cat cat = catFactory.createRandomCat();

        //assert
        Assertions.assertNotNull(cat);
    }

    @Test
    void createNamedCat_giveAName_createdAnInstance() {
        //arrange
        String name = "TEST_NAME";

        //act
        Cat cat = catFactory.createNamedCat(name);

        //assert
        Assertions.assertNotNull(cat);
    }

    @Test
    void createRandomCat_normal_meowRandomly() {
        //act
        Cat cat = catFactory.createRandomCat();

        //assert
        Assertions.assertNotNull(cat);
        Assertions.assertNotNull(cat.meow());
    }

    @Test
    void createNamedCat_giveAName_meowGivenName() {
        //arrange
        String name = "TEST_NAME";

        //act
        Cat cat = catFactory.createNamedCat(name);

        //assert
        Assertions.assertNotNull(cat);
        Assertions.assertEquals(name, cat.meow());
    }

}
