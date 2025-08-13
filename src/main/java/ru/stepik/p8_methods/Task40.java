package ru.stepik.p8_methods;

import java.util.Scanner;

public class Task40 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        printDivider(number);
    }

    static int printDivider(int number) {
        int a = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                a = i;
                System.out.print(i + " ");
            }
        }
        return a;
    }
}