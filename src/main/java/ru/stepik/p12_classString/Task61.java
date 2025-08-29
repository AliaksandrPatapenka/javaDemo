/*
Пользователь вводит три строки, которые содержат части кодового слова.
Каждая вводимая строка может содержать пробелы и заканчивается символом перехода на новую строку ('\n').
Части кодового слова выделены внутри строки знаками ';'.
Нужно соединить эти части в одну строку и вывести эту строку на консоль.
Замечание: поскольку предполагается, что кодовое слово будет как-то использовано в дальнейшем, недостаточно его просто вывести на консоль по частям.
Нужно именно сформировать его в виде одной строки, а затем уже выводить!
 */


package ru.stepik.p12_classString;

import java.util.Scanner;

public class Task61 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        String s3 = scanner.nextLine();
        int findFirst1 = s1.indexOf(";");
        int findLast1 = s1.lastIndexOf(";");
        String result1 = s1.substring(findFirst1 + 1, findLast1);
        //result1 = result1.trim();
        int findFirst2 = s2.indexOf(";");
        int findLast2 = s2.lastIndexOf(";");
        String result2 = s2.substring(findFirst2 + 1, findLast2);
        //result2 = result2.trim();
        int findFirst3 = s3.indexOf(";");
        int findLast3 = s3.lastIndexOf(";");
        String result3 = s3.substring(findFirst3 + 1, findLast3);
        //result3 = result3.trim();
        System.out.println(result1 + result2 + result3);

    }
}
