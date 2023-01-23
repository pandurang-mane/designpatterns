package com.pandurang.patterns.singleton;

public class Logger implements Cloneable{

    private static Logger logger = null;

    private Logger() {

    }

    public static Logger getInstance() {
        if(logger == null) {
            synchronized (Logger.class) {
                if(logger == null) {
                    logger = new Logger();
                }
            }
        }
        return logger;
    }

    public void log(String message) {
        System.out.println(message);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
