package me.freedom4live.patterns.java.factory.impl;

import me.freedom4live.patterns.java.factory.Cat;
import me.freedom4live.patterns.java.factory.CatFactory;

import java.util.UUID;

public class CatFactoryImpl implements CatFactory {
    @Override
    public Cat createRandomCat() {
        return new Cat() {

            private String name = UUID.randomUUID().toString();

            @Override
            public String meow() {
                return name;
            }
        };
    }

    @Override
    public Cat createNamedCat(String name) {
        return () -> name;
    }
}
