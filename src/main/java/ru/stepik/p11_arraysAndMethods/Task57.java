/*
Напишите четыре статических метода  для работы с одномерным массивом целых чисел:
1) init()  - заполнение массива случайными числами от -3 до 5 (включительно);
2) print() - вывод массива на консоль в строку, отделяя элементы пробелами;
3) findMax() - поиск индекса первого максимального элемента в одномерном массиве.
4) reduceAfterMax() - создает новый массив, удаляя все элементы после первого максимума.
Первые три метода уже были созданы на шаге 2.
В main() пользователь вводит количество элементов одномерного массива и начальное значение генератора случайных чисел.
Выводится на консоль сформированный массив, и затем с новой строки  - сформированный массив с удаленной частью.
 */


package ru.stepik.p11_arraysAndMethods;

import java.util.Random;
import java.util.Scanner;

public class Task57 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] ar = new int[scan.nextInt()];
        long seed = scan.nextLong();
        init(ar, seed);
        print(ar);
        int[] b = reduceAfterMax(ar);
        print(b);
    }

    public  static void init(int[] ar, long seed) {
        Random random = new Random(seed);
        for (int i = 0; i < ar.length; i++) {
            ar[i] = random.nextInt(-3, 6);
        }
    }

    public  static void print(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println();
    }

    public static int[] reduceAfterMax(int[] ar) {
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < ar.length; i++) {
            if(ar[i] >max) {
                max = ar[i];
                index = i;
            }
        }
        int[] b = new int[index + 1];
        for (int i = 0; i < index + 1; i++) {
            b[i] = ar[i];
        }
        return b;
    }
}
