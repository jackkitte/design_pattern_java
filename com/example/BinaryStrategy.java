package com.example;

import java.util.List;

public class BinaryStrategy implements Strategy {
    @Override
    public Employee search(List<Employee> employeeList, int id) {
        Employee result = null;

        int left = 1;
        int right = employeeList.size();
        int count = 0;

        long startTime = System.nanoTime();

        while (left < right) {
            count++;

            int median = left + (right - left) / 2;

            if (median == id) {
                result = employeeList.get(median);
                break;
            } else if (id < median) {
                right = median;
            } else if (median < id) {
                left = median + 1;
            }
        }

        long endTime = System.nanoTime();

        System.out.println("二分探索の処理時間：" + (endTime - startTime) + "ナノ秒");
        System.out.println("探索回数：" + count + "回");

        return result;
    }
}
