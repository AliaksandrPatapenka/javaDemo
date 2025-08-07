/*
Пользователь вводит координаты двух точек на плоскости.
в первой строке через пробел - координата X и координата Y первой точки
затем во второй строке также через пробел координаты второй точки.
Нужно определить, какая из точек ближе к началу координат.
Выводится одно из сообщений: "Первая точка ближе", "Вторая точка ближе", "Точки на равных расстояниях".
 */


import java.util.Scanner;


class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(java.util.Locale.US);
        double X = scanner.nextDouble();
        double Y = scanner.nextDouble();
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double result1 = Math.sqrt(Math.pow(X, 2) + Math.pow(Y, 2));
        double result2 = Math.sqrt(Math.pow(A, 2) + Math.pow(B, 2));
        if (result1 == result2) {
            System.out.println("Точки на равных расстояниях");
        }
        else {
            if (result1 < result2) {
                System.out.println("Первая точка ближе");
            }
            else {
                System.out.println("Вторая точка ближе");
            }
        }

    }
}

