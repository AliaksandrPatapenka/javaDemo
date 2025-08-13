package ru.stepik.p3_operatorSwitch;/*
Пользователь вводит целое число - номер дня недели.
Нужно вывести  "Working day", если это рабочий день,  "Saturday" - если суббота, и "Sunday" - если воскресенье.
При неправильном номере дня недели  выводится "ERROR".
Используйте оператор switch. Нумерация дней недели  - с понедельника (номер 1).
*/


import java.util.Scanner;

class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Working day");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("ERROR");

        }
    }
}