package com.example;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FileCheckCommand implements Command{
    private Path path;

    public FileCheckCommand(String path) {
        super();
        this.path = Paths.get(path);
    }

    @Override
    public void execute() throws Exception {
        System.out.println("ファイルチェック開始");

        boolean existResult = FileUtil.existCheck(path);

        if (existResult == true) {
            FileUtil.deleteFile(path);
        }

        System.out.println("ファイルチェック終了");
    }
}
