/*
В отделе работают 3 сотрудника, которые получают заработную плату в рублях.
Требуется определить, на сколько зарплата самого высокооплачиваемого из них отличается от самого низкооплачиваемого.
Пользователь вводит три целых числа (три зарплаты в рублях).
Программа выводит разность зарплат в рублях.
 */


import java.util.Scanner;

class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        int min = (a < b) ? ( a < c ? a : c) : (b < c ? b : c);

        System.out.println(max - min);
    }
}

