/*
Пользователь вводит строку, в которой среди других символов содержатся символы цифр.
Сформируйте строку, которая "представляет" сумму этих цифр.
Выведите полученную строку на консоль.
Если в исходной строке цифр нет, то должно быть выведено ERROR.
Р.S.  Преобразовать символ в число можно вычитанием кода символа '0'
 */


package ru.stepik.p13_StringBufferAndStringBuilder;

import java.util.Scanner;

public class Task70 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] mas = str.split(" +");
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length(); j++) {
                char sym = mas[i].charAt(j);
                if (sym >= '0' && sym <= '9') {
                    int number = sym - '0';
                    sum += number;
                    sb.append("+").append(number);
                }
            }
        }
        if (sb.length() == 0) {
            System.out.println("ERROR");
        } else {
            sb.deleteCharAt(0);
            sb.append("=").append(sum);
            System.out.println(sb);
        }
    }
}
