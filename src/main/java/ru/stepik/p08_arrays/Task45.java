/*
Массив из целых чисел заполнить случайными значениями от -5 до 5 (включая обе границы)
Пользователь вводит размер массива, а затем начальное значение генератора случайных чисел.
Вывести исходный массив на консоль в одной строке, разделяя элементы пробелами.
Пробел должен быть в том числе и после последнего элемента массива.
Найти сумму положительных элементов массива и произведение отрицательных элементов.
Произведение быстро растет, поэтому оно должно иметь тип double.
C новой строки вывести результаты программы через пробел (сначала сумму, а потом произведение).
 */


package ru.stepik.p08_arrays;

import java.util.Random;
import java.util.Scanner;

public class Task45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int beg = scanner.nextInt();
        Random random = new Random(beg);
        int [] mas = new int[n];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(11) - 5;
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        int sum = 0;
        for (int el:mas) {
            if (el > 0) sum += el;
        }
        System.out.print(sum + " ");
        double product = 1;
        for (int i = 0; i < mas.length ; i++) {
            if (mas[i] < 0) product *= mas[i];
        }
        System.out.println(product);


    }

}
