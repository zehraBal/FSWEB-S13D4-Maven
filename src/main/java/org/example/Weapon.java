package org.example;

public enum Weapon {
    SWORD(8,5.1),
    BOW(5,8.2),
    AXE(10,3.3),
    SPEAR(7,6.4);

    private final int damage;
    private final double attackSpeed;

    Weapon(int damage,double attackSpeed){
        this.damage=damage;
        this.attackSpeed=attackSpeed;
    }
    public int getDamage(){
        return damage;
    }

    public double getAttackSpeed(){
        return attackSpeed;
    }
}
