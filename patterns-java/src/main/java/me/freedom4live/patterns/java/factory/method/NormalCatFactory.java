package me.freedom4live.patterns.java.factory.method;

import java.util.UUID;

public class NormalCatFactory extends AbstractCatFactory {
    @Override
    protected Cat createCatInternal() {
        return new NormalCat(UUID.randomUUID().toString());
    }
}
