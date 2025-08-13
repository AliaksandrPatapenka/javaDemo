package ru.stepik.p2_ifElse;/*
Найти минимальное из пяти целых чисел, введенных пользователем.
*/


import java.util.Scanner;

class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();;
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        int min = a;
        if (b < min)  min = b;
        if (c < min) min = c;
        if (d < min) min = d;
        if (e < min) min = e;
        System.out.println(min);
    }
}