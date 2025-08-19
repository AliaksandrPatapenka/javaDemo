/*
Напишите три статических метода  для работы с одномерным массивом целых чисел:
1) init()  - заполнение массива случайными числами от -3 до 5 (включительно);
2) print() - вывод массива на консоль в строку, отделяя элементы пробелами;
3) findMax() - поиск индекса первого максимального элемента в одномерном массиве.
Пользователь вводит количество элементов одномерного массива и начальное значение генератора случайных чисел.
Выводится на консоль сформированный массив, и затем с новой строки - найденный индекс первого максимального элемента  в массиве.
Код метода main() менять нельзя!
*/


package ru.stepik.p11_arraysAndMethods;

import java.util.Random;
import java.util.Scanner;

public class Task55 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] ar = new int[scan.nextInt()];
        long seed = scan.nextLong();
        init(ar,seed);
        print(ar);
        int ind = findMax(ar);
        System.out.println(ind);
    }

    public static void init(int[] ar, long seed) {
        Random random = new Random(seed);
        for (int i = 0; i < ar.length; i++) {
            ar[i] = random.nextInt(-3, 6);
        }
    }

    public static void print(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println();
    }

    public static int findMax(int[] ar) {
        int ind = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > max) {
                max = ar[i];
                ind = i;
            }
        }
        return ind;
    }
}
