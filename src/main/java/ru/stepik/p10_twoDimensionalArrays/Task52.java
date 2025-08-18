/*
Пользователь вводит количество строк и столбцов двумерного массива, а затем начальное значение генератора случайных чисел.
Создать целочисленный массив указанной размерности и инициализировать его случайными числами от -5 до 4 (включительно).
Массив вывести на консоль в виде таблицы, элементы которой отделяются знаками табуляции.
Знак табуляции должен быть и  в конце каждой строки.
Найти максимальный элемент и подсчитать, сколько раз он встречается в массиве.
Вывести максимальный элемент и найденное количество с  новой строки через пробел.

 */


package ru.stepik.p10_twoDimensionalArrays;

import java.util.Random;
import java.util.Scanner;

public class Task52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] mas = new int[scanner.nextInt()][scanner.nextInt()];
        Random random = new Random(scanner.nextLong());
        int max = Integer.MIN_VALUE;
        int kol = 0;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = random.nextInt(-5, 5);
                System.out.print(mas[i][j] + "\t");
                if (mas[i][j] > max) max = mas[i][j];
            }
            System.out.println();
        }
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (mas[i][j] == max) kol++;
            }
        }
        System.out.println(max + " " + kol);

    }
}
