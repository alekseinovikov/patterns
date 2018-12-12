package me.freedom4live.patterns.java.builder.impl;

import me.freedom4live.patterns.java.builder.Person;
import me.freedom4live.patterns.java.builder.PersonBuilder;

public class PersonBuilderImpl implements PersonBuilder {
    private final Person temp;

    public PersonBuilderImpl() {
        this.temp = new Person();
    }

    @Override
    public PersonBuilder setFirstName(String firstName) {
        temp.setFirstName(firstName);
        return this;
    }

    @Override
    public PersonBuilder setLastName(String lastName) {
        temp.setLastName(lastName);
        return this;
    }

    @Override
    public PersonBuilder setMiddleName(String middleName) {
        temp.setMiddleName(middleName);
        return this;
    }

    @Override
    public PersonBuilder setAge(Integer age) {
        temp.setAge(age);
        return this;
    }

    @Override
    public Person build() {
        return new Person(temp.getFirstName(), temp.getLastName(), temp.getMiddleName(), temp.getAge());
    }

}
