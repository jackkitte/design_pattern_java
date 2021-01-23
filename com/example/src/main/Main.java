package com.example.src.main;

import java.util.Scanner;

import com.example.src.momento.Gamer;
import com.example.src.momento.Hero;
import com.example.src.momento.Momento;

public class Main {
    static boolean play = true;

    public static void main(String[] args) {
        System.out.println("ゲームを始めます");

        Hero hero = new Hero(30, 30, 10);
        Gamer gamer = new Gamer(hero, 100);
        System.out.println(gamer);

        Momento momento = gamer.createMomento();

        String message = "コマンドを入力してください。[f: 敵と戦う, s: セーブ, e: 終了";

        while (play) {
            if (gamer.getHero().getHp() > 0) {
                System.out.println(message);

                Scanner sc = new Scanner(System.in);

                String line = sc.nextLine();

                if ("f".equals(line)) {
                    System.out.println("敵と戦います");
                    gamer.fight();
                } else if ("s".equals(line)) {
                    System.out.println("セーブします");
                    momento = gamer.createMomento();
                    System.out.println(gamer);
                    System.out.println("セーブしました");
                } else if ("e".equals(line)) {
                    System.out.println("ゲームを終了します");
                    break;
                } else {
                    System.out.println("正しい入力を行ってください");
                }
            } else {
                System.out.println("復帰しますか？ [y: 復帰する, n: ゲームを終了する");

                Scanner sc = new Scanner(System.in);

                String line = sc.nextLine();

                if ("y".equals(line)) {
                    gamer.restoreMomento(momento);
                    System.out.println(gamer);
                } else if ("n".equals(line)) {
                    break;
                } else {
                    System.out.println("正しい入力を行ってください");
                }
            }
        }
    }
}
