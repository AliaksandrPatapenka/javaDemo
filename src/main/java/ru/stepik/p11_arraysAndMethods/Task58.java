/*
Напишите три статических метода для работы с двумерным массивом целых чисел:
1) initArray() - инициализирует двумерный массив случайными числами от 0 до 10 (включительно);
2) printArray() - выводит двумерный массив на консоль в виде таблицы (элементы строках отделяются знаками табуляции, и знак табуляции должен быть в конце каждой строки)
3)  deleteRow() - создает новый двумерный массив из исходного (первый параметр метода), удаляя строку, индекс которой передается в качестве второго параметра.
Если индекс неверный (отрицательный или больше последнего индекса строк), то возвращает исходный массив без изменений.
В методе main() вводятся четыре целых числа: количество строк и количество столбцов массива, начальное значение генератора случайных чисел и индекс строки для удаления.
Двумерный массив создается и выводится в виде таблицы.
Затем выводится новый массив. Код метода main() менять нельзя!
 */


package ru.stepik.p11_arraysAndMethods;

import java.util.Random;
import java.util.Scanner;

public class Task58 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] mas = new int[scan.nextInt()][scan.nextInt()];
        long seed = scan.nextLong();
        int ind = scan.nextInt();
        initArray(mas, seed);
        printArray(mas);
        System.out.println();
        mas = deleteRow(mas, ind);
        printArray(mas);
    }

    public static void initArray(int[][] mas, long seed) {
        Random random = new Random(seed);
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = random.nextInt(11);
            }
        }
    }

    public static void printArray(int[][] mas) {
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.print(mas[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] deleteRow(int[][] mas, int ind) {
        if (ind < 0 || ind >= mas.length) {
            return mas;
        }
        int[][] b = new int[mas.length - 1][mas[0].length];
        for (int i = 0; i < ind; i++) {
            for (int j = 0; j < mas[0].length; j++) {
                b[i][j] = mas[i][j];
            }
        }
        for (int i = ind + 1; i < mas.length; i++) {
            for (int j = 0; j < mas[0].length; j++) {
                b[i-1][j] = mas[i][j];
            }
        }
        return b;
    }
}
