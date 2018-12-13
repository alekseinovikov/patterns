package me.freedom4live.patterns.java.factory.method;

public class CrazyCatFactory extends AbstractCatFactory {
    @Override
    protected Cat createCatInternal() {
        return new CrazyCat();
    }
}
