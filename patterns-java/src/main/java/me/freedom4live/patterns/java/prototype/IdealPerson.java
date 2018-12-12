package me.freedom4live.patterns.java.prototype;

public class IdealPerson implements Cloneable {

    private String name;

    public IdealPerson() {
    }

    IdealPerson(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "IdealPerson{" +
                "name='" + name + '\'' +
                '}';
    }

    public IdealPerson clone() throws CloneNotSupportedException {
        return (IdealPerson) super.clone();
    }

}
