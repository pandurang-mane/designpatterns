package com.pandurang.patterns.abstractfactory;

public class DaoFactoryProducer {

    public static DaoAbstarctFactory produce(String factoryType) {
        DaoAbstarctFactory daf = null;
        if(factoryType.equals("xml")) {
            daf = new XMLDaoFactory();
        } else if (factoryType.equals("db")) {
            daf = new DBDaoFactory();
        }
        return daf;
    }
}
