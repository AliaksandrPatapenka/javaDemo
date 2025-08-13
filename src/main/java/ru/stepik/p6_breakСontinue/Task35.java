/*
Выведите первое составное число в заданном диапазоне.
Составным называется число, у которого более двух делителей. (т.е. оно делится на единицу, на себя и еще на что-то).
Единица не является ни простым, ни составным числом!)
Пользователь вводит границы диапазона через пробел (положительные целые числа).
Границы диапазона могут быть некорректны (первое число больше второго).
В этом случае все равно происходит поиск, как для корректных границ.
Если в заданном диапазоне нет таких чисел, то нужно вывести "NO".
 */


package ru.stepik.p6_breakСontinue;

import java.util.Scanner;

public class Task35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a > b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        boolean flag = true;
        for ( int i = a; i <= b; i++) {

            if (i == 1) continue;
            for ( int j = 2; j <= i; j++) {
                if ( i % j == 0 && i != j) {
                    flag = false;
                    break;
                }
            }
            if (flag == false) {
                System.out.print(i);
                break;
            }

        }
        if (flag == true) System.out.print("NO");

    }

}
