package com.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileUtil {
    public static boolean existCheck(Path path) {
        boolean result = false;

        result = Files.exists(path);

        return result;
    }

    public static void deleteFile(Path path) throws IOException {
        try {
            Files.delete(path);
            System.out.println("ファイル削除 : " + path);
        } catch (IOException e) {
            System.out.println("ファイル削除に失敗しました");
            e.printStackTrace();
            throw e;
        }
    }

    public static void createFile(Path path) throws IOException {
        try {
            Files.createFile(path);
            System.out.println("ファイル作成 : " + path);
        } catch (IOException e) {
            System.out.println("ファイル作成に失敗しました");
            e.printStackTrace();
            throw e;
        }
    }

    public static void  write(Path path, List<String> list) throws IOException {
        StringBuilder sb = new StringBuilder();

        for (String str : list) {
            sb.append(str + "\n");
        }

        try {
            byte[] bytes = sb.toString().getBytes();

            Files.write(path, bytes);
        } catch (IOException e) {
            System.out.println("ファイル書き込みに失敗しました");
            e.printStackTrace();
            throw e;
        }

        System.out.println("ファイル書込 : " + path);
    }
}
