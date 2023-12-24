package org.example;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    private Random random = new Random();
    private int number;

    public Randoms(int min, int max) {
        int number = random.nextInt(max - min + 1);
        System.out.println("Случайное сгенерированное число равно: " + number + "!!!" + " Начинаем итерироваться.");
        this.number = number;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            int randomNumber = number;
            int cursor = 0;

            @Override
            public boolean hasNext() {
                if (randomNumber > cursor) {
                    return true;
                } else {
                    return false;
                }
            }

            @Override
            public Integer next() {
                return cursor++;
            }
        };
    }

}
