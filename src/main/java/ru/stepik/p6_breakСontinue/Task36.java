/*
Пользователь вводит целое неотрицательное число.
Найти сумму его четных делителей (не включая его самого).
 */

package ru.stepik.p6_breakСontinue;

import java.util.Scanner;

public class Task36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int sum = 0;
        for (int i = 2; i < a; i = i + 2) {
            if (a % i == 0) sum += i;
        }
        System.out.println(sum);
    }
}
