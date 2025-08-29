/*
Напишите метод, который проверяет, что строка является адресом почты gmail.com (т.е. в конце строки "@gmail.com", знак @ только один, и имя пользователя перед @ не пусто)).
Метод main()  менять нельзя!
 */


package ru.stepik.p12_classString;

import java.util.Scanner;

public class Task62 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        if (isGMailAddress(str)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    static boolean isGMailAddress(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '@')  {
                count ++;
            }
        }
        if (count == 0 || count > 1) return false;
        int findFirst = str.indexOf('@');
        if (findFirst == 0 || str.length() - 1 == findFirst) return  false;
        String sub = str.substring(findFirst);
        if (!sub.equals("@gmail.com")) return false;
        return true;
    }
}
