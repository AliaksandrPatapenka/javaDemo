/*
Выполните задачу с использованием цикла do-while.
Пользователь вводит произвольное целое число (оно может быть отрицательным).
Найдите количество цифр в числе и сумму цифр.
Выведите через пробел сначала количество, а потом сумму цифр.
 */



package ru.stepik.p4_loopOperators;

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a < 0) a = -a;
        int kol = 0;
        int sum = 0;
        //int number;
        do {
            int number = a % 10;
            kol ++;
            sum += number;
            a = a / 10;
            } while (a != 0);
        System.out.println(kol + " " + sum);
        }
    }

