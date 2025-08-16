/*
Напишите две перегрузки статического  метода square() для вычисления площади прямоугольника.
В одном случае в метод передаются две стороны прямоугольника, а в другом - одна сторона квадрата (все - вещественные числа).
В методе main() вводится сначала целое число:
1 означает, что нужно вычислить площадь квадрата.
И затем следует ввод одного вещественного числа (стороны квадрата)
2 означает, что нужно вычислить площадь прямоугольника.
Затем следует ввод двух сторон прямоугольника.
Выводимую площадь нужно представить с двумя знаками после десятичной точки.
 */


package ru.stepik.p07_methods;

import java.util.Locale;
import java.util.Scanner;

public class Task43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        double index = scanner.nextDouble();
        if (index == 1) {
            double a = scanner.nextDouble();
            square(a);
        } else if (index == 2) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            square(a, b);
        }
    }

    static void square(double a) {
        double square = a * a;
        System.out.printf("%.2f", square);

    }

    static void square(double a, double b) {
        double square = a * b;
        System.out.printf("%.2f", square);
    }
}
