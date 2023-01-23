package com.pandurang.patterns.abstractfactory;

public class XMLDaoFactory extends DaoAbstarctFactory {

    @Override
    public Dao createDao(String type) {
        Dao dao = null;
        if(type.equals("emp")) {
            dao = new XMLEmpDao();
        } else if (type.equals("dept")) {
            dao = new XMLDeptDao();
        }
        return dao;
    }
}
