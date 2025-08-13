/*
Пользователь вводит целое неотрицательное число.
Нужно вывести "YES", если это число простое и "NO", если оно простым не является.
Простым называется число, которое делится нацело только на единицу и на себя.
Единица не является простым числом.
 */


package ru.stepik.p06_breakСontinue;

import java.util.Scanner;

public class Task33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        boolean flag = true;
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                flag = false;
                break;
            }
        }
        if (a == 1 || flag == false) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
