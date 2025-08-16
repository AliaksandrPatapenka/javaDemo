/*
Массив из вещественных чисел типа double заполнить случайными значениями от 0 до 5 (не включая).
Пользователь вводит размер массива, а затем начальное значение генератора случайных чисел.
Вывести исходный массив на консоль в одной строке, разделяя элементы пробелами.
Пробел должен быть в том числе и после последнего элемента массива.
Найти среднее арифметическое элементов массива и вывести его с новой строки.
Заменить все элементы  больше среднего его значением.
C новой строки вывести преобразованный массив.
Элементы отделяются пробелами.
Все вещественные числа при выводе округляются до двух знаков после десятичной точки.
После вывода среднего не должно быть пробелов, сразу перевод курсора!
*/


package ru.stepik.p08_arrays;

import java.util.Random;
import java.util.Scanner;

public class Task46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int beg = scanner.nextInt();
        Random random = new Random(beg);
        double[] mas = new double[n];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextDouble(0, 5);
            System.out.printf("%.2f ", mas[i]);
        }
        System.out.println();
        double average = 0.0;
        double sum = 0.0;
        for ( double el:mas) {
            sum +=el;
        }
        average = sum / mas.length;
        System.out.printf("%.2f", average);
        System.out.println();
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > average) mas[i] = average;
            System.out.printf("%.2f ", mas[i]);
        }
    }
}
