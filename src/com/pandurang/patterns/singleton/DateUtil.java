package com.pandurang.patterns.singleton;

import java.io.Serial;
import java.io.Serializable;

public class DateUtil implements Serializable, Cloneable {

    private static final long serialVersionUID = 2141985451774204610L;
    private static DateUtil instance;

    private DateUtil() {

    }

    public static DateUtil getInstance() {
        if(instance == null) {
            instance = new DateUtil();
        }
        return instance;
    }

    protected Object readResolve() {
        return instance;
    }

    @Override
    protected DateUtil clone() throws CloneNotSupportedException {
            throw new CloneNotSupportedException();
    }
}
