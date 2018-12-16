package me.freedom4live.patterns.kotlin.adaptor

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class AdaptorSqrtTest {
    @Test
    fun sqrt_4_2() {
        //act
        val result = AdaptorSqrt.sqrt(4)

        //assert
        assertEquals(2, result)
    }

    @Test
    fun sqrt_5_2() {
        //act
        val result = AdaptorSqrt.sqrt(5)

        //assert
        assertEquals(2, result)
    }

    @Test
    fun sqrt_100_10() {
        //act
        val result = AdaptorSqrt.sqrt(100)

        //assert
        assertEquals(10, result)
    }

}
