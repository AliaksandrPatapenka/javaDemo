/*
Напишите метод primer(), который принимает два целых числа и возвращает строку, представляющую собой пример на сложение (см. тест).
Используйте для формирования результата StringBuilder!
Исходный код метода main() менять нельзя!
*/


package ru.stepik.p13_StringBufferAndStringBuilder;

import java.util.Scanner;

public class Task69 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        String str = primer(a, b);
        System.out.println(str);
    }

     static  String primer( int a, int b) {
        int sum = a + b;
        StringBuilder str = new StringBuilder();
        str.append(a).append(" + ").append(b).append(" = ").append(sum);
        String result = str.toString();
        return result;
    }
}
