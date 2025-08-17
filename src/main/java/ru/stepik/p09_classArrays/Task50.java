/*
Пользователь вводит размер массива и начальное значение генератора случайных чисел.
Создать массив  чисел типа double заданного размера и заполнить его случайными числами от 0 до 2 (не включая).
Распечатать исходный массив, используя метод toString() - в квадратных скобках, элементы через запятую.
С новой строки вывести на консоль сумму максимального и минимального элементов массива.
 */


package ru.stepik.p09_classArrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        Random random = new Random(x);
        double[] mas = new double[n];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextDouble(0, 2);
        }
        String str = Arrays.toString(mas);
        System.out.println(str);
        Arrays.sort(mas);
        double min = mas[0];
        double max = mas[n-1];
        double sum = min + max;
        System.out.println(sum);
    }
}
