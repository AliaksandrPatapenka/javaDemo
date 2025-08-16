/*
Массив из целых чисел заполнить случайными значениями от -5 до 15 (включая обе границы)
Пользователь вводит размер массива, а затем начальное значение генератора случайных чисел.
Вывести исходный массив на консоль в одной строке, разделяя элементы пробелами.
Пробел должен быть в том числе и после последнего элемента массива.
Поменять местами первый максимальный и последний отрицательный элементы.
Если отрицательных элементов нет в массиве, то он должен остаться без изменения.
C новой строки вывести измененный массив, отделяя элементы пробелами.
 */


package ru.stepik.p08_arrays;

import java.util.Random;
import java.util.Scanner;

public class Task48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        Random random = new Random(x);
        int[] mas = new int[n];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(-5, 16);
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        int max = Integer.MIN_VALUE;
        int min = 0;
        int numberMaxMas = 0;
        int numberMinMas = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > max) {
                max = mas[i];
                numberMaxMas = i;
            }
            if (mas[i] < 0) {
                min = mas[i];
                numberMinMas = i;
            }
        }
        if (min < 0) {
            int tmp = mas[numberMaxMas];
            mas[numberMaxMas] = mas[numberMinMas];
            mas[numberMinMas] = tmp;
        }
        for (int el:mas){
            System.out.print(el + " ");
        }


    }
}
