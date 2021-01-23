package com.example.src.momento;

import java.util.Random;

public class Gamer {
    private Hero hero;

    private int money;

    private Random random = new Random();

    public Gamer(Hero hero, int money) {
        super();
        this.hero = hero;
        this.money = money;
    }

    public Hero getHero() {
        return hero;
    }

    public void fight() {
        int enemyHp = random.nextInt(10) + 1;

        boolean result = true;

        while (result) {
            int enemyAttack = random.nextInt(10) + 1;

            hero.setHp(hero.getHp() - enemyAttack);

            System.out.println("敵から攻撃を受けました。");
            System.out.println(enemyAttack + "のダメージ");

            if (hero.getHp() < 1) {
                hero.setHp(0);
                System.out.println("敵にやられました");
                break;
            }

            System.out.println(hero);

            enemyHp = enemyHp - hero.getAttack();

            if (enemyHp < 1) {
                System.out.println("敵を倒しました。");

                int getMoney = random.nextInt(10) + 11;

                System.out.println("敵が" + getMoney + "Gを落としました。");
                money = money + getMoney;
                System.out.println(this);

                break;
            }
        }
    }

    public Momento createMomento() {
        Hero saveHero = new Hero(this.hero.getMaxHp(), this.hero.getHp(), this.hero.getAttack());
        Momento momento = new Momento(this.money, saveHero);

        return momento;
    }

    public void restoreMomento(Momento momento) {
        this.money = momento.money;
        this.hero = momento.hero;
    }

    @Override
    public String toString() {
        return "現在の状態 [" + hero + ", 所持金=" + money + "G]";
    }
}
