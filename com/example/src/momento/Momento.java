package com.example.src.momento;

public class Momento {
    int money;

    Hero hero;

    Momento(int money, Hero hero) {
        super();
        this.money = money;
        this.hero = hero;
    }

    int getMoney() {
        return money;
    }

    Hero getHero() {
        return hero;
    }

    @Override
    public String toString() {
        return "セーブデータ [" + hero + ", 所持金=" + money + "G]";
    }
}
