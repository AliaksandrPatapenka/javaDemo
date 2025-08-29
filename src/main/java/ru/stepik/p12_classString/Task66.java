/*
Введите строку, состоящую из слов, отделенных ровно одним пробелом.
Замените первую букву каждого слова на прописную.
Выведите полученную строку.
*/


package ru.stepik.p12_classString;

import java.util.Scanner;

public class Task66 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] mas = str.split(" +");
        for (int i = 0; i < mas.length; i++) {
            mas[i] = mas[i].substring(0, 1).toUpperCase() + mas[i].substring(1);
        }
        String result = String.join(" ", mas);
        System.out.println(result);
    }
}
