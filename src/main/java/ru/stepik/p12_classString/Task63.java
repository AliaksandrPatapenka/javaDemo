/*
Напишите статический метод, который проверяет, есть ли в конце строки подстрока ".com".
Если да, то он возвращает часть строки без этого фрагмента.
Если нет, то он возвращает строку без изменения.
 */


package ru.stepik.p12_classString;

import java.util.Scanner;

public class Task63 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(delCom(str));
    }

    static String delCom( String str) {
        int findLast = str.lastIndexOf('.');
        if (findLast != str.length() -4) return str;
        String sub = str.substring(findLast);
        if (!sub.equals(".com")) return str;
        String sudFinal = str.substring(0, findLast);
        return sudFinal;
    }
}
