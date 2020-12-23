package com.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class RealText implements Text {
    private String filePath;

    private Path path;

    public RealText() {
        super();
    }

    public RealText(String filePath) {
        super();
        this.filePath = filePath;
        this.path = Paths.get(filePath);
    }

    @Override
    public String getFilePath() {
        return filePath;
    }

    @Override
    public void setFilePath(String filePath) {
        this.filePath = filePath;
        this.path = Paths.get(filePath);
    }

    @Override
    public void printAll() {
        try {
            List<String> lineList = Files.readAllLines(this.path);

            for (String line : lineList) {
                System.out.println(line);
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
