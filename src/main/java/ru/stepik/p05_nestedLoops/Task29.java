/*
Пользователь вводит высоту треугольника.
Нарисовать треугольник из звездочек, как показано в примере теста.
Если вводятся некорректные данные (высота  <= 0), то вывести "ERROR".

*****
 ****
  ***
   **
    *

 */


package ru.stepik.p05_nestedLoops;

import java.util.Scanner;

public class Task29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int height2 = height;
        if (height <= 0) {
            System.out.println("ERROR");
        }
        for ( int i = 1; i <= height; i++) {
            for (int k = height2; k > 0; k--) {
                System.out.print("*");
            }
            height2--;
            System.out.println();
            for (int m = height2; m < height && m > 0; m++) {
                System.out.print(" ");
            }
        }
    }

}
