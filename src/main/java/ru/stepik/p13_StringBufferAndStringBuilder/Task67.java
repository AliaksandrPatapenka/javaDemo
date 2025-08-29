/*
Пользователь вводит строку из слов, разделенных пробелами.
Заменить все слова, которые содержат букву z на слово "ERROR".
Также удалить все лишние пробелы в начале и в конце строки.
Между словами оставить ровно один пробел.
*/


package ru.stepik.p13_StringBufferAndStringBuilder;

import java.util.Scanner;

public class Task67 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] mas = str.split(" +");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < mas.length; i++) {
            if (mas[i].indexOf('z') != -1) {
                sb.append(" ERROR");
            } else {
                sb.append(" ").append(mas[i]);
            }
        }
        System.out.println(sb);
        }

    }
