package org.example;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        Point first = new Point(6, 5);
//
//        Point second = new Point(3, 1);
//
//        System.out.println("distance(0,0)= " + first.distance());
//
//        System.out.println("distance(second)= " + first.distance(second));
//
//        System.out.println("distance(2,2)= " + first.distance(2, 2));
//
//        Point point = new Point(0,0);
//
//        System.out.println("distance()= " + point.distance());

        Player player1 = new Player("Arthur", 120, Weapon.SWORD);
        System.out.println(player1.healthRemaining()); // 100 olmalı, çünkü başlangıçta 120 verildi ama 100 ile sınırlı

        Player player2 = new Player("Lancelot", -10, Weapon.AXE);
        System.out.println(player2.healthRemaining()); // 0 olmalı, çünkü başlangıçta -10 verildi ama minimum 0

        // Sağlık kaybı ve mesaj testi
        player1.loseHealth(20);
        System.out.println(player1.healthRemaining()); // 80 olmalı

        player1.loseHealth(80);
        System.out.println(player1.healthRemaining()); // 0 olmalı ve "Arthur player has been knocked out of game" yazmalı

        // Sağlık artırma testi
        player2.restoreHealth(50);
        System.out.println(player2.healthRemaining()); // 50 olmalı

        player2.restoreHealth(60);
        System.out.println(player2.healthRemaining()); // 100 olmalı, çünkü sağlık 100 ile sınırlı


    }
}