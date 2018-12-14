package me.freedom4live.patterns.java.bridge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarTest {

    private Engine dieselEngine;
    private Engine reactiveEngine;


    @BeforeEach
    void setUp() {
        dieselEngine = new DieselEngine();
        reactiveEngine = new ReactiveEngine();
    }

    @Test
    void drive_dieselEngine_500power() {
        //arrange
        Car dieselCar = new Car(dieselEngine);

        //act
        int resultPower = dieselCar.drive();

        //assert
        assertEquals(500, resultPower);
    }

    @Test
    void drive_reactiveEngine_1000Power() {
        //arrange
        Car reactiveCar = new Car(reactiveEngine);

        //act
        int resultPower = reactiveCar.drive();

        //assert
        assertEquals(1000, resultPower);
    }

}
