/*
Пользователь вводит границы диапазона положительных целых чисел.
Границы диапазона в тестах корректны (не нужно проверять, что первая граница меньше или равна второй).
Нужно найти сумму наименьших делителей всех чисел в этом диапазоне (рассматриваются делители, начиная с 2).
Например, для диапазона 8 ...11:
наименьший делитель 8 равен 2
наименьший делитель 9 равен 3
наименьший делитель 10 равен 2
наименьший делитель 11 равен 11
Сумма  2+3+2+11=18
 */
package ru.stepik.p06_breakСontinue;

import java.util.Scanner;

public class Task37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = 0;
        for ( int i = a; i <= b; i++) {
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    sum += j;
                    break;
                }
            }
        }
        System.out.println(sum);


    }
}
