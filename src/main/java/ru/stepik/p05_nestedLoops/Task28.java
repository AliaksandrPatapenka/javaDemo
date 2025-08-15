/*
Пользователь вводит  высоту  и ширину рамки через пробел.
Нарисовать рамку из звездочек.
Если вводятся некорректные данные (высота или ширина <= 0), то вывести "ERROR".
P.S. Пустые места внутри рамки - это пробелы.
****
*  *
*  *
*  *
****
 */


package ru.stepik.p05_nestedLoops;

import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a <= 0 || b <= 0) {
            System.out.println("ERROR");
            return;
        }
        for (int i = 1; i <= a; i++) {
            if (i == 1 || i == a) {
                for (int j = 1; j <= b; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                for ( int k = 1; k <=b; k++) {
                    if (k == 1 || k == b) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }

                }
                System.out.println();
            }
        }
    }
}
