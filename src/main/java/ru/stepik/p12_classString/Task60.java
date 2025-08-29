/*
Введите строку (в ней возможны пробелы).
Замените в ней каждый символ «;»   на пару символов «.,»
 */


package ru.stepik.p12_classString;

import java.util.Scanner;

public class Task60 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        System.out.println(s1.replace(";", ".,"));
    }
}
