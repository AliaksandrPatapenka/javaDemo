/*
Пользователь вводит с клавиатуры целое шестизначное число.
Нужно определить, является ли число счастливым, и вывести YES, если это так,  и NO в противном случае.
Счастливым считается шестизначное число, у которого сумма первых трех цифр равна сумме последних трех цифр.
Если число не шестизначное, то нужно вывести ERROR.
 */

import java.util.Scanner;

class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if ( x < 1) x = - x;
        if (x < 100000 || x > 999999) {
            System.out.println("ERROR");
            return;
        }
        int digit1 = x / 100000;
        int digit2 = (x / 10000) % 10;
        int digit3 = (x / 1000 ) % 10;
        int digit4 = (x / 100) % 10;
        int digit5 = (x / 10) % 10;
        int digit6 = x % 10;
        //System.out.println(digit1);
        //System.out.println(digit6);
        int sum123 = digit1 + digit2 + digit3;
        int sum456 = digit4 + digit5 + digit6;
        if (sum123 == sum456) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }


    }
}