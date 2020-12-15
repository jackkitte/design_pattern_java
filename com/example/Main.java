package com.example;

public class Main {
    public static void main(String[] args) {
        IceCream corn = new Corn();

        IceCream vanilla = new Vanilla(corn);
        System.out.println(vanilla.getName() + ":" + vanilla.getPrice());

        IceCream chocolate = new Chocolate(corn);
        System.out.println(chocolate.getName() + ":" + chocolate.getPrice());

        IceCream mix = new Chocolate(new Vanilla(corn));
        System.out.println(mix.getName() + ":" + mix.getPrice());
    }
}
