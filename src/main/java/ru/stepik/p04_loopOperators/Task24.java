/*
Пользователь вводит два целых числа, больших 1.
Нужно вывести все общие делители этих чисел ( числа, на которые оба числа делятся без остатка).
Выводимые числа должны быть отделены пробелами.
 */



package ru.stepik.p04_loopOperators;

import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int minAB;
        //int i;
        if (a < b){
            minAB = a;
        } else {
            minAB = b;
        }
        for (  int i = 1; i <= minAB; i++) {
            if (a % i == 0 && b % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
