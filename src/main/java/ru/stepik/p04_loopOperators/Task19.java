/*
Выполните задачу с использованием цикла while.
Нужно найти произведение всех целых чисел в диапазоне, указанном пользователем.
Пользователь вводит границы диапазона через пробел.
При этом не всегда первое вводимое число меньше второго.
Произведение чисел быстро растет, поэтому для него используйте переменную типа double.
Форматирование при выводе не используйте!
 */




package ru.stepik.p04_loopOperators;
import java.util.Scanner;


public class Task19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int start = a;
        int finish = b;
        if (a > b) {
            start = b;
            finish = a;
        }
        double total = start;
        while (start < finish) {
            total = total * (start + 1);
            start++;
        }
        System.out.println(total);


    }
}
