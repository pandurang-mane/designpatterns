package com.pandurang.patterns.singleton;

import java.io.*;

public class Test {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        DateUtil dateUtil1 = DateUtil.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("C:\\Users\\JM988KL\\OneDrive - EY\\Documents\\Singleton\\dateUtil.ser")));
        oos.writeObject(dateUtil1);
        DateUtil dateUtil2 = null;
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("C:\\Users\\JM988KL\\OneDrive - EY\\Documents\\Singleton\\dateUtil.ser")));
        dateUtil2 = (DateUtil)ois.readObject();
        System.out.println(dateUtil1 == dateUtil2);
        oos.close();
        ois.close();
    }
}
