package com.pandurang.patterns.factory;

public class PersonFactory {

    public static Person createPerson(String type) {
        Person person = null;
        if(type == "Male") {
            person = new Male();
        } else if (type == "Female") {
            person = new Female();
        }
        return person;
    }

}
