package com.pandurang.patterns.abstractfactory;

public class Test {
    public static void main(String[] args) {
        DaoAbstarctFactory daf = DaoFactoryProducer.produce("db");
        Dao dao = daf.createDao("dept");
        dao.save();

    }
}
