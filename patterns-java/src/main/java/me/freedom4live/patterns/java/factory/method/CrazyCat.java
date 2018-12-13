package me.freedom4live.patterns.java.factory.method;

import java.util.UUID;

public class CrazyCat implements Cat {

    @Override
    public String meow() {
        return UUID.randomUUID().toString();
    }

}
