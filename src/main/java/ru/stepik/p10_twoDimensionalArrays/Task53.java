/*
Пользователь вводит количество строк и столбцов двумерного массива, а затем начальное значение генератора случайных чисел.
Создать массив целых чисел указанной размерности и инициализировать его случайными числами от -10 до 10 (включительно).
Массив вывести на консоль в виде таблицы, элементы которой отделяются знаками табуляции. Знак табуляции должен быть и  в конце каждой строки.
Вывести пустую строку после двумерного массива.
Для каждого столбца найти сумму положительных элементов и вывести на консоль, отделяя пробелами.
 */

package ru.stepik.p10_twoDimensionalArrays;

import java.util.Random;
import java.util.Scanner;

public class Task53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] mas = new int[scanner.nextInt()][scanner.nextInt()];
        Random random = new Random(scanner.nextLong());
        int sum = 0;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = random.nextInt(-10, 11);
                System.out.print(mas[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < mas[0].length; i++) {
            for (int j = 0; j < mas.length; j++) {
                if (mas[j][i] > 0) {
                    sum += mas[j][i];
                }
            }
            System.out.print(sum + " ");
            sum = 0;
        }
    }
}
