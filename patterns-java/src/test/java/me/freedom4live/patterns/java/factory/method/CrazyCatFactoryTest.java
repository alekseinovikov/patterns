package me.freedom4live.patterns.java.factory.method;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CrazyCatFactoryTest {

    private AbstractCatFactory catFactory;


    @BeforeEach
    void setUp() {
        catFactory = new CrazyCatFactory();
    }

    @Test
    void createCat_crazyCat_hasDifferentMeows() {
        //arrange
        Cat cat = catFactory.createCat();
        String previous = cat.meow();

        for (int i = 0; i < 1000; i++) {
            //act
            String current = cat.meow();

            //assert
            Assertions.assertNotEquals(previous, current);
            previous = current;
        }
    }
}
