/*
Напишите статический метод printTriangle(), который выводит на консоль треугольник, показанный в примерах тестов.
Параметрами метода являются ширина основания и символ, которым рисуется треугольник.
В конце каждой строки нет невидимых пробелов, курсор переводится сразу после последнего символа.
Также напишите метод main(), в котором вводятся с консоли ширина треугольника и символ, а затем вызывается метод printTriangle().
  #
  ###
 #####
#######
 */




package ru.stepik.p07_methods;

import java.util.Scanner;

public class Task42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = scanner.nextInt();
        String str = scanner.next(); //вводим строку
        char sim = str.charAt(0); // берем из строки первый символ
        printTriangle(width, sim);
    }

    static void printTriangle(int width, char sim) {
        int kolStr;
        if (width % 2 == 0) { //находим высоту треугольника
            kolStr = width / 2;
        } else {
            kolStr = (width / 2) + 1;
        }
        for (int i = 1; i <= kolStr; i++) {
            int spase = kolStr - i;
            for (int j = 1; j <= spase; j++) {
                System.out.print(" ");
            }
            if (width % 2 == 0) {
                for (int k = 2 * i; k > 0; k--) {
                    System.out.print(sim);
                }
            } else {
                for (int l = 2 * i - 1 ; l > 0; l--) {
                    System.out.print(sim);
                }
            }
            System.out.println();
        }
    }
}
