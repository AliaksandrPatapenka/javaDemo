/*
Пользователь вводит размер массива и начальное значение генератора случайных чисел.
Создать массив  целых чисел заданного размера и заполнить его случайными числами от 10 до 20 (включительно).
Распечатать исходный массив, используя метод toString() - в квадратных скобках, элементы через запятую.
Затем вводятся два индекса (индексы в тестах корректные).
Отсортировать по возрастанию часть массива между двумя этими индексами (включая оба).
С новой строки вывести преобразованный массив на консоль методом toString().
 */


package ru.stepik.p09_classArrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        Random random = new Random(x);
        int[] mas = new int[n];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(10, 21);
        }
        String str = Arrays.toString(mas);
        System.out.println(str);
        int index1 = scanner.nextInt();
        int index2 = scanner.nextInt();
        Arrays.sort(mas, index1, index2 + 1);
        System.out.println(Arrays.toString(mas));
    }
}
