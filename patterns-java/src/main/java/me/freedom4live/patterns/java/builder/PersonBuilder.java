package me.freedom4live.patterns.java.builder;

public interface PersonBuilder {
    PersonBuilder setFirstName(String firstName);

    PersonBuilder setLastName(String lastName);

    PersonBuilder setMiddleName(String middleName);

    PersonBuilder setAge(Integer age);

    Person build();
}
