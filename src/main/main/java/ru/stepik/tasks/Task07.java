/*
Пользователь вводит целое трехзначное число. Вывести сумму его нечетных цифр.


Если число не является трехзначным, вывести "ERROR".

Если нечетных цифр нет, то вывести "NO".

 */



import java.util.Scanner;

class Task7 {
    public static void main(String[] args) {
        Scanner scammer = new Scanner(System.in);
        int x = scammer.nextInt();
        if (x < 0) x = -x;
        if ( x < 100 || x > 999) {
            System.out.println("ERROR");
            return;
        }
        int digit1 = x / 100;
        int digit2 = (x / 10) % 10;
        int digit3 = x % 10;
        int sum = 0;

        if (digit1 % 2 != 0) sum += digit1;
        if (digit2 % 2 != 0) sum += digit2;
        if (digit3 % 2 != 0) sum += digit3;

        if (sum == 0) {
            System.out.println("NO");
        } else {
            System.out.println(sum);
        }
    }
}