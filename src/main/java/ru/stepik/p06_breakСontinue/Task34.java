/*
Выведите все простые числа в заданном диапазоне (включая его границы).
Границы диапазона вводит пользователь через пробел (положительные целые числа).
Границы диапазона в тестах корректны (не нужно проверять, что первая граница меньше или равна второй).
Если в заданном диапазоне нет простых чисел, то не должно быть выведено ничего (пустой результат)
 */


package ru.stepik.p06_breakСontinue;

import java.util.Scanner;

public class Task34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for (int i = a; i <= b; i++) {
            if ( i == 1) continue;
            boolean flag = true;
            for (int j = 2; j <= i; j++) {
                if (i % j == 0 && i != j) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) System.out.print(i + " ");
            continue;
        }
    }

}
