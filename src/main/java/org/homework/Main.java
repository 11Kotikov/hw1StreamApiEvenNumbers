package org.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = generateRandomNumbers(10, 1, 100);

        System.out.println("Список случайных чисел:");
        numbers.forEach(System.out::println);

        double average = numbers.stream()
                .filter(num -> num % 2 == 0)
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);

        System.out.println("Среднее значение всех четных чисел: " + average);
    }

    private static List<Integer> generateRandomNumbers(int size, int minRange, int maxRange) {
        List<Integer> randomNumbers = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < size; i++) {
            int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            randomNumbers.add(randomNumber);
        }

        return randomNumbers;

    }
}