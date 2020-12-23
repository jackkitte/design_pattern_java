package com.example;

public class TextProxy implements Text {
    private String filePath;

    private RealText real;

    public TextProxy() {
        super();
    }

    public TextProxy(String filePath) {
        super();
        this.filePath = filePath;
    }

    @Override
    public String getFilePath() {
        return filePath;
    }

    @Override
    public synchronized void setFilePath(String filePath) {
        this.filePath = filePath;

        if (real != null) {
            real.setFilePath(filePath);
        }
    }

    @Override
    public void printAll() {
        realize();
        real.printAll();
    }

    private synchronized void realize() {
        if (real == null) {
            System.out.println("本人のインスタンスを生成します");
            real = new RealText(this.filePath);
        }
    }
}
