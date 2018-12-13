package me.freedom4live.patterns.java.factory.method;

public abstract class AbstractCatFactory {

    protected abstract Cat createCatInternal();


    Cat createCat() {
        return createCatInternal();
    }

}
