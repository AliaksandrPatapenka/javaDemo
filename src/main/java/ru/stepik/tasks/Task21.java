/*
Выполните задачу с использованием цикла for.
Найти сумму делителей целого положительного числа.
Например, вводится число 12. Сумма его делителей: 1+2+3+4+6+12=28.
 */



package ru.stepik.tasks;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a < 0) a = -a;
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) sum += i;
        }
        System.out.println(sum);
    }

}
