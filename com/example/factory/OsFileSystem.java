package com.example.factory;

public abstract class OsFileSystem {
    public abstract String getFileSeparator();
    public abstract String getRootPath();
    public abstract void saveFile(String fileName);
}
