package com.pandurang.patterns.factory;

public class PersonTest {
    public static void main(String[] args) {
        Person person = PersonFactory.createPerson("Female");
        person.wish("!!!");
    }
}
