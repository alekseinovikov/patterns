package me.freedom4live.patterns.java.bridge;

class Car {

    private final Engine engine;

    Car(Engine engine) {
        this.engine = engine;
    }

    int drive() {
        return engine.rotate();
    }

}
