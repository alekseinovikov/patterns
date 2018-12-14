package me.freedom4live.patterns.kotlin.bridge

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class CarTest {

    private lateinit var dieselEngine: Engine
    private lateinit var reactiveEngine: Engine


    @BeforeEach
    fun setUp() {
        dieselEngine = DieselEngine()
        reactiveEngine = ReactiveEngine()
    }

    @Test
    fun drive_dieselCar_500power() {
        //assert
        val dieselCar = Car(dieselEngine)

        //act
        val resultPower = dieselCar.drive()

        //assert
        Assertions.assertEquals(500, resultPower)
    }

    @Test
    fun drive_reactiveCar_1000power() {
        //assert
        val reactiveCar = Car(reactiveEngine)

        //act
        val resultPower = reactiveCar.drive()

        //assert
        Assertions.assertEquals(1000, resultPower)
    }

}
