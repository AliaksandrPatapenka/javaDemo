/*
Пользователь вводит два целых числа (границы отрезка числовой оси).
Границы могут быть введены некорректно (первое число больше второго).
В этом случае нужно границы переставить местами.
Т.е. перебор должен быть всегда от меньшего к большему.
Найти в данном отрезке первое число с максимальной суммой цифр.
Для отрицательного числа при расчете суммы цифр знак не учитывается.
Например, сумма цифр -324 равна 9.
 */
package ru.stepik.p05_nestedLoops;

import java.util.Scanner;

public class Task32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int aSumMax = 0;
        int min, max;
        int sumMAX = Integer.MIN_VALUE;
        int sum = 0;
        if (a < b) {
            min = a;
            max = b;
        } else {
            min = b;
            max = a;
        }
        for (int i = min; i <=max; i++) {
            for (int k = i; k != 0;) {
                if (k < 0) k = -k;
                int j = k % 10;
                sum += j;
                k = k / 10;
            }
            if (sumMAX < sum) {
                sumMAX = sum;
                aSumMax = i;
            }
            sum = 0;
        }
        System.out.println(aSumMax);

    }
}
