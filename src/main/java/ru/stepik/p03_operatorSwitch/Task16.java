package ru.stepik.p03_operatorSwitch;/*
Вася работает программистом и получает 50 долл.
США за каждые 100 строк кода (за последние строки, которые не дотягивают до сотни, он не получает ничего).
Т.е. за 99 строк он получит 0, за 199  строк получит 50, и т.д.
За каждое третье опоздание Васю штрафуют на 20 долл. США.
Программа должна реализовать три варианта расчетов:
1) Пользователь вводит желаемый доход Васи и количество опозданий. Подсчитать, сколько строк кода (минимально) ему нужно написать, чтобы получить сумму не менее желаемого.
2) Пользователь вводит количество строк кода, написанное Васей, и желаемый объем зарплаты. Подсчитать сколько раз Вася может опоздать (максимально). Если даже без опозданий желаемую  зарплату он не получит, вывести "ERROR".
3) Пользователь вводит количество строк кода и количество опозданий.
Определить, сколько заплатят Васе.
Если не заплатят вообще, то вывести 0.
Сначала пользователь вводит номер варианта расчета, а потом два числа в соответствии с условием варианта (все числа целые).
Например: 1 1000 4   означает первый вариант расчета, 1000 - желаемый доход, 4 - количество опозданий.
Ответом должно быть минимальное количество строк кода, которое нужно написать.
Если первое число, которое вводит пользователь, не равно 1, 2 или 3 (вариант расчета), то вывести "ERROR".
 */


import java.util.Scanner;

class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum;
        int line;
        int lateness;
        switch (number) {
            case 1:
                sum = scanner.nextInt();
                lateness = scanner.nextInt();
                if (sum < 0) sum = -sum;
                if (lateness < 0) lateness = -lateness;
                int totalLateness = (lateness / 3) * 20;
                line = (int) Math.ceil((sum + totalLateness) / 50.0) * 100;
                System.out.println(line);
                break;
            case 2:
                 line = scanner.nextInt();
                 sum = scanner.nextInt();
                 totalLateness = ((50 * line) /100) - sum;
                if ( totalLateness < 0) {
                    System.out.println("ERROR");
                    break;
                }
                lateness = ( int) Math.round((totalLateness / 20.0) * 3);
                if (lateness % 3 == 0 ) lateness = lateness - 1;
                System.out.println(lateness);
                break;
            case 3:
                line = scanner.nextInt();
                lateness = scanner.nextInt();
                sum = (line / 100) * 50;
                totalLateness = (lateness / 3) * 20;
                int totalSum = sum - totalLateness;
                if (totalSum < 1) totalSum = 0;
                System.out.println(totalSum);
                break;
            default:
                System.out.println("ERROR");
        }
    }
}