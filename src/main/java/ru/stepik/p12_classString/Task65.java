/*
Ввести текст из слов, разделенных пробелами.
Между словами может быть любое количество пробелов.
Также пробелы могут быть перед первым и после последнего слова.
Также ввести контрольное слово.
Удалить из текста все появления данного слова (но не как части другого слова!)
Также удалить все лишние пробелы между словами и в начале и в конце строки.
*/


package ru.stepik.p12_classString;

import java.util.Scanner;

public class Task65 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String control = scanner.nextLine();
        str = str.trim();
        String[] mas = str.split(" +");
        int countControl = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i].equals(control)) {
                countControl++;
            }
        }
        String[] masFinal = new String[mas.length - countControl];
        int newIndex = 0;
        for (int i = 0; i < mas.length; i++) {
            if (!mas[i].equals(control)) {
                masFinal[newIndex++] = mas[i];
            }
        }
        String result = String.join(" ", masFinal);
        System.out.println(result);
    }
}
