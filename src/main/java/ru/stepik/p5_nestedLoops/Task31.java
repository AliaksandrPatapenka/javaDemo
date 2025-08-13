/*
Вывести на экран таблицу умножения от 1 до k.
Значение k (0<k<10) вводит пользователь.
Элементы таблицы отделять знаком табуляции (знак табуляции должен быть также и в конце каждой строки).
*/

package ru.stepik.p5_nestedLoops;

import java.util.Scanner;

public class Task31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        if ( k <= 0 || k >= 10) {
            System.out.println("ERROR");
            return;
        }
        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <= k; j++) {
              int product = i * j;
              //System.out.print(product);
              System.out.printf("%d\t", product);
            }
            System.out.println();

        }


    }
}
