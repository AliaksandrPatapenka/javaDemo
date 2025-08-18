/*
Пользователь вводит количество строк и столбцов двумерного массива, а затем начальное значение генератора случайных чисел.
Создать массив целых чисел указанной размерности и инициализировать его случайными числами от -10 до 10 (включительно).
Массив вывести на консоль в виде таблицы, элементы которой отделяются знаками табуляции. Знак табуляции должен быть и  в конце каждой строки.
В каждой строке найти первый отрицательный элемент и вывести индекс соответствующего столбца или слово "NO", если он отсутствует.
 */


package ru.stepik.p10_twoDimensionalArrays;

import java.util.Random;
import java.util.Scanner;

public class Task54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[scanner.nextInt()][scanner.nextInt()];
        Random random = new Random(scanner.nextLong());
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(-10, 11);
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < array.length; i++) {
            boolean flag = true;
            for (int j = 0; j < array[i].length; j++) {
                if ( array[i][j] < 0) {
                    System.out.println(j);
                    flag = false;
                    break;
                }
            }
            if (flag) System.out.println("NO");
        }
    }
}
