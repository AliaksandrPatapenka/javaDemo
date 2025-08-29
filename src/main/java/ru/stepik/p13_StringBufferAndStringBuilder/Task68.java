/*
Пользователь вводит строку из слов, разделенных одним пробелом.
Переставить слова местами так, чтобы каждое следующее слово начиналось с буквы, которой заканчивается предыдущее слово (существование такого слова в тестах гарантируется).
 */


package ru.stepik.p13_StringBufferAndStringBuilder;

import java.util.Scanner;

public class Task68 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] mas = str.split(" +");
        StringBuilder sb = new StringBuilder(mas[0]);
        for (int i = 0; i < mas.length - 1; i++) {
            for (StringBuilder j = sb; ;) {
                char sym = j.charAt(j.length() - 1);
                for (int k = 1; k < mas.length; k++) {
                    char sym1 = mas[k].charAt(0);
                    if (sym == sym1){
                        sb.append(" ").append(mas[k]);
                        break;
                    }
                }
                break;
            }
        }
        System.out.println(sb);
    }
}
