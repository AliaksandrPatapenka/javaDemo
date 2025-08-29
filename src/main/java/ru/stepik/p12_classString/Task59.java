/*
Введите три строки (могут содержать пробелы).
Выведите их в порядке возрастания.
 */


package ru.stepik.p12_classString;

import javax.sound.sampled.Line;
import java.util.Arrays;
import java.util.Scanner;

public class Task59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();
        String min = (str1.compareTo(str2) < 0 && str1.compareTo(str3) < 0) ? str1 :
                (str2.compareTo(str1) < 0 && str2.compareTo(str3) < 0) ? str2 : str3;
        String max = (str1.compareTo(str2) > 0 && str1.compareTo(str3) > 0) ? str1 :
                (str2.compareTo(str1) > 0 && str2.compareTo(str3) > 0) ? str2 : str3;
        String mid = (str1.compareTo(min) != 0 && str1.compareTo(max) !=0) ? str1 :
                (str2.compareTo(min) != 0 && str2.compareTo(max) != 0) ? str2 : str3;
        System.out.println(min);
        System.out.println(mid);
        System.out.println(max);
    }
}
