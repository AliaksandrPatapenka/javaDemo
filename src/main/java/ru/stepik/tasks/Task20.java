/*
Выполните задачу с использованием цикла for.
Найти минимальное число в последовательности целых чисел.
Пользователь вводит количество целых чисел, а затем сами числа через пробел.
 */


package ru.stepik.tasks;

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kol = scanner.nextInt();
        int min = Integer.MAX_VALUE;
        for ( int i = 0; i < kol; i++) {
            int a = scanner.nextInt();
            if (a < min) min = a;
        }
        System.out.print(min);
    }
}
