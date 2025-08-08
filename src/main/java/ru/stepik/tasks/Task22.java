/*
Пользователь вводит целое число (контрольное число).
А затем вводится произвольное количество положительных целых чисел.
Признаком конца ввода является любое отрицательное число.
Подсчитать во вводимой последовательности количество положительных делителей контрольного числа.
 */
package ru.stepik.tasks;

import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b;
        int kol = 0;
        do {
            b = scanner.nextInt();
            if (b > 0 && a % b == 0) {
                kol ++;
            }
        } while (b > 0);
        System.out.println(kol);

    }
}
