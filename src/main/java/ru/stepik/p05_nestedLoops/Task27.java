/*
Пользователь вводит ширину треугольника (от 1 до 9).
Изобразить треугольник числами, как показано в примере теста.
55555
4444
333
22
1

*/


package ru.stepik.p05_nestedLoops;

import java.util.Scanner;

public class Task27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int height2 = height;
        for (int i = 1; i <= height; i++) {
            for (int j = height2; j > 0; j--) {
                System.out.print(height2);
            }
            System.out.println();
            height2--;

        }
    }
}
