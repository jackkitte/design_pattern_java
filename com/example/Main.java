package com.example;

import com.example.Item;
import com.example.Manager;
import com.example.Potion;
import com.example.Sword;
public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();

        Potion redPotion = new Potion("赤のポーション");
        manager.register("redPotion", redPotion);

        Potion orangePotion = new Potion("オレンジのポーション");
        manager.register("orangePotion", orangePotion);

        Sword copperSword = new Sword("銅の剣");
        manager.register("copperSword", copperSword);

        Item sword1 = manager.create("copperSword");
        sword1.get();
        sword1.use();

        Item potion1 = manager.create("redPotion");
        potion1.get();
        potion1.use();

        Item potion2 = manager.create("orangePotion");
        potion2.get();
        potion2.use();
    }
}
