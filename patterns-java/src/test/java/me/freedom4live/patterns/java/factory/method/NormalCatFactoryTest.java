package me.freedom4live.patterns.java.factory.method;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NormalCatFactoryTest {

    private AbstractCatFactory catFactory;


    @BeforeEach
    void setUp() {
        catFactory = new NormalCatFactory();
    }

    @Test
    void createCat_normalCat_hasTheSameMeowForever() {
        //arrange
        Cat cat = catFactory.createCat();

        //act
        String meowResult = cat.meow();

        //assert
        for (int i = 0; i < 1000; i++) {
            assertEquals(meowResult, cat.meow());
        }
    }

}
