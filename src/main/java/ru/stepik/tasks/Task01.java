/*
Пользователь вводит с клавиатуры денежную сумму в рублях и копейках (рубли и копейки вводятся в разные переменные).
Программа должна откорректировать введенную сумму в правильную форму.
Например, если пользователь ввел 22 и 978 , то программа должна вывести 31 р. 78 к.
 */


import java.util.Scanner;

class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = b % 100;
        b /= 100;
        a = a + b;

        System.out.println(a + " р. " + c + " к.");
    }
}


