package me.freedom4live.patterns.java.singleton;

import java.util.UUID;

public class Singleton {

    private String name;

    private static Singleton INSTANCE;

    private Singleton(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    static synchronized Singleton getInstance() {
        if (null == INSTANCE) {
            INSTANCE = new Singleton(UUID.randomUUID().toString());
        }

        return INSTANCE;
    }

}
