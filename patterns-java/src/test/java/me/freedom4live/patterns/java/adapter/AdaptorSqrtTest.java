package me.freedom4live.patterns.java.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AdaptorSqrtTest {

    @Test
    void sqrt_4_2() {
        //act
        int result = AdaptorSqrt.sqrt(4);

        //assert
        assertEquals(2, result);
    }

    @Test
    void sqrt_5_2() {
        //act
        int result = AdaptorSqrt.sqrt(5);

        //assert
        assertEquals(2, result);
    }

    @Test
    void sqrt_100_10() {
        //act
        int result = AdaptorSqrt.sqrt(100);

        //assert
        assertEquals(10, result);
    }

}
