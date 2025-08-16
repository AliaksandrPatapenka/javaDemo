/*
Массив целых неотрицательных чисел вводится с консоли.
Сначала пользователь вводит количество элементов массива, а потом сами элементы.
Найти последний минимальный элемент и заменить его  на -1.
Преобразованный массив вывести на консоль, отделяя элементы пробелами.
 */


package ru.stepik.p08_arrays;

import java.util.Scanner;

public class Task47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int mas[] = new int[n];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = scanner.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int numberMas = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] <= min) {
                min = mas[i];
                numberMas = i;
            }
        }
        mas[numberMas] = -1;
        for (int el:mas) {
            System.out.print(el + " ");
        }
    }
}
