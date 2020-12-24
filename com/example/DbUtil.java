package com.example;

import java.util.ArrayList;
import java.util.List;

public class DbUtil {
    public static boolean connect() {
        boolean result = false;

        double random = Math.random();

        if (random >= 0.5) {
            result = true;
            System.out.println("DB接続成功");
        } else {
            System.out.println("DB接続失敗");
        }

        return result;
    }

    public static List<String> getEmployeeList() {
        List<String> list = new ArrayList<>();

        list.add("山田,30歳");
        list.add("田中,25歳");
        list.add("田村,33歳");

        return list;
    }
}
