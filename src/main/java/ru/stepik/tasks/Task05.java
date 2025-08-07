/*
 Пользователь вводит целое число.
 Определить, является ли оно четным.
 Если число четное, нужно вывести YES, а если нечетное NO
 */


import java.util.Scanner;

class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a % 2 == 0) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}

