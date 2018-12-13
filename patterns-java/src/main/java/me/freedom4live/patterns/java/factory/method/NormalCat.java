package me.freedom4live.patterns.java.factory.method;

public class NormalCat implements Cat {

    private String name;


    NormalCat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String meow() {
        return name;
    }

}
