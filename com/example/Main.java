package com.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        SearchApi sequencialApi = new SearchApi(new SequencialStrategy());

        SearchApi binaryApi = new SearchApi(new BinaryStrategy());

        int random = new Random().nextInt(10000) + 1;
        System.out.println("乱数：" + random);

        Employee employee1 = sequencialApi.searchEmployee(random);
        System.out.println(employee1);

        System.out.println();

        Employee employee2 = binaryApi.searchEmployee(random);
        System.out.println(employee2);
    }
}
