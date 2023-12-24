package org.example;

public class Main {
    public static void main(String[] args) {
        for (int r : new Randoms(50, 100)) {
            System.out.println("Случайное число: " + r);
            if (r == 20) {
                System.out.println("Дошли до числа " + r + " давайте на этом закончим. Случайно сгенериваранное число > " + r);
                break;
            }
        }
    }
}