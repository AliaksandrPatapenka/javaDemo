/*
Напишите статический метод isPrime(), который возвращает true, если аргумент является простым числом, и false - в противном случае.

Простым называется целое положительное число, которое не имеет других делителей, кроме единицы и себя самого.
Отрицательные числа не могут быть простыми (поэтому функция должна возвращать false).
Простыми также не являются числа 0 и 1.
В методе main продемонстрировано использование метода isPrime(). Этот код менять нельзя!
 */

package ru.stepik.p8_methods;

import java.util.Scanner;

public class Task38 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            int number = scan.nextInt();
            System.out.print(isPrime(number) + " ");
        }
    }

    static boolean isPrime( int number) {
        boolean flag = true;
        if (number == 0 || number == 1 || number < 0){
            return false;
        }
        for (int i = 2 ; i < number; i++ ) {
            if (number % i == 0) {
                return false;
            }
        }
        return flag;
    }

}

