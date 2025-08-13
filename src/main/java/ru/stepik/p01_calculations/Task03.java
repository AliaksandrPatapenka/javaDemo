package ru.stepik.p01_calculations;
/*
На вход программы подается размер интервала времени в секундах.
Переведите это в часы, минуты и секунды и выведите согласно примеру теста.
 */


import java.util.Scanner;

class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int time = scanner.nextInt();
        int h = time / 3600;
        int m = (time - (h * 3600))/60;
        int s = time - ((h * 3600) + (m * 60));
        System.out.println(h + " часов " + m + (" минут ") + s + (" секунд"));
    }
}

