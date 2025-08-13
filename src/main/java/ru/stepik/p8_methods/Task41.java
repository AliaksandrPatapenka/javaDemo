/*
Напишите статический метод maxNumberDivider(), который в заданном диапазоне находит первое число с наибольшим количеством делителей.
Метод main() менять нельзя!
Совет: сделайте отдельный  метод, который подсчитывает количество делителей числа, а затем вызывайте его в методе maxNumberDivider().
 */


package ru.stepik.p8_methods;

import java.util.Scanner;

public class Task41 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int max = maxNumberDivider(a, b);
        System.out.println(max);
    }
    static  int maxNumberDivider(int a, int b) {
        int max = a;
        int maxKol =  maxNumberDividerCount(a);
        for (int i = a; i <= b; i++) {
            int currentKol = maxNumberDividerCount(i);
            if (currentKol > maxKol) {
                maxKol = currentKol;
                max = i;
            }
        }
        return max;
    }

    static int maxNumberDividerCount( int i) {
        int kol = 0;
        for (int j = 1; j <= i; j++ ) {
            if (i % j == 0) kol+=1;
            }
        return kol;
        }
    }



