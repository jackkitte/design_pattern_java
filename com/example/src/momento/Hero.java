package com.example.src.momento;

public class Hero {
    private int maxHp;

    private int hp;

    private int attack;

    public Hero(int maxHp, int hp, int attack) {
        super();
        this.maxHp = maxHp;
        this.hp = hp;
        this.attack = attack;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    @Override
    public String toString() {
        return "最大HP=" + maxHp + ", 現在のHP=" + hp + ", 攻撃力=" + attack;
    }
}
