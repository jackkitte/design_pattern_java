package com.example.factory;

import javax.swing.text.AbstractDocument.AbstractElement;

public abstract class OsFactory {
    public static OsFactory getFactory(String className) {
        OsFactory factory = null;

        try {
            factory = (OsFactory)Class.forName(className).getDeclaredConstructor().newInstance();
        } catch (ClassNotFoundException e) {
            System.out.println(className + "が見つかりません");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return factory;
    }

    public abstract OsFileSystem createFileSystem();
    public abstract OsDisplaySystem createDisplaySystem();
}
