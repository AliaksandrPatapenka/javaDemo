/*
Напишите программу с использованием цикла (любого):
Нужно вывести на экран горизонтальную или вертикальную линию из символов.
Пользователь вводит через пробел: тип линии, количество символов и сам символ.
Если тип линии 1, то следует вывести вертикальную линию, а если тип 2 - то горизонтальную.
При неправильных исходных данных (тип линии, отличный от 1 или 2, либо отрицательном количестве символов) нужно вывести слово ERROR.
P.S. Чтобы ввести символ, введите строку и возьмите ее нулевой символ: scan.next().charAt(0);
 */
package ru.stepik.tasks;

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int type = scanner.nextInt();
        int kol = scanner.nextInt();
        char symbol = scanner.next().charAt(0);
        if (type != 1 && type != 2 ) {
            System.out.println("ERROR");
            return;
        } else if (kol < 0) {
            System.out.println("ERROR");
            return;
        }
        if (type == 1) {
            for (int i = 0; i < kol; i++) {
                System.out.println(symbol);
            }
        } else  {
            for (int i = 0; i < kol; i++) {
                System.out.print(symbol);
            }

        }
    }
}
