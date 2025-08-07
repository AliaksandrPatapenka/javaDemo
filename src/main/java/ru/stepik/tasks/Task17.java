/*
Пользователь вводит целое число - номер месяца в году.
Нужно вывести  название поры года на английском языке с большой буквы.
При неправильном номере месяца  выводится "ERROR".
Используйте оператор switch с лямбда - синтаксисом.
 */


import java.util.Scanner;

class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        switch (month) {
            case 1, 2, 12 -> System.out.println("Winter");
            case 3, 4, 5 -> System.out.println("Spring");
            case 6, 7, 8 -> System.out.println("Summer");
            case 9, 10, 11 -> System.out.println("Autumn");
            default -> System.out.println("ERROR");

        }
    }
}