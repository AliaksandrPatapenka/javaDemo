/*
Ввести строку из слов, разделенных пробелами.
Между словами может быть любое количество пробелов.
Также пробелы могут быть перед первым и после последнего слова.
Найти и распечатать первое слово максимальной длины.
*/


package ru.stepik.p12_classString;

import java.util.Scanner;

public class Task64 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        str = str.trim();
        String[] mas = str.split(" +");
        int max = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i].length() > mas[max].length()) max = i;
        }
        System.out.println(mas[max]);
    }
}
