/*
Напишите статический метод simpleInRange(), который подсчитывает количество простых чисел в заданном диапазоне.
Если границы диапазона введены неверно (первое число больше второго), то в методе нужно их переставить местами.
В методе main() продемонстрировано использование  simpleInRange() (этот код менять нельзя!)
P. S. Используйте метод isPrime(), уже реализованный в предыдущем задании!
 */


package ru.stepik.p8_methods;

import java.util.Scanner;

public class Task39 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int kol = simpleInRange(a, b);
        System.out.println(kol);
    }

    static int simpleInRange(int a, int b) {
        if (a > b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        int kol = 0;

        for (int i = a; i <= b; i++) {
            boolean flag = isPrime(i);
            if (flag) {
                kol +=1;
            }
            isPrime(i);
        }
        return kol;
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
