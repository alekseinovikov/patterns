package me.freedom4live.patterns.java.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class SingletonTest {

    @Test
    void getInstances_hasInstances_theSame() {
        //arrange
        Singleton previous = Singleton.getInstance();

        for (int i = 0; i < 1000; i++) {
            //act
            Singleton current = Singleton.getInstance();

            //assert
            assertNotNull(current);
            assertEquals(previous, current);
            assertEquals(previous.getName(), current.getName());

            previous = current;
        }
    }

}
