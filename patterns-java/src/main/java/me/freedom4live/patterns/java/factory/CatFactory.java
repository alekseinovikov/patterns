package me.freedom4live.patterns.java.factory;

public interface CatFactory {
    Cat createRandomCat();
    Cat createNamedCat(String name);
}
