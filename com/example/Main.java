package com.example;

import com.example.factory.OsDisplaySystem;
import com.example.factory.OsFactory;
import com.example.factory.OsFileSystem;

public class Main {
    public static void main(String[] args) {
        // String className = "com.example.factory.windows.WindowsFactory";
        String className = "com.example.factory.linux.LinuxFactory";

        OsFactory factory = OsFactory.getFactory(className);

        OsDisplaySystem displaySystem = factory.createDisplaySystem();
        displaySystem.displayOsName();
        displaySystem.displayStr("サンプル");

        OsFileSystem fileSystem = factory.createFileSystem();
        fileSystem.saveFile("sample.txt");
    }
}
