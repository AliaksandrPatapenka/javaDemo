/*Две команды студентов участвовали в олимпиаде по программированию.
В первой команде было два человека, а во второй - четыре.
Баллы, которые набрал каждый студент, вводятся с консоли (сначала две оценки первой команды, а потом - четыре оценки второй).
В командном зачете сравниваются средние баллы каждой команды.
Если средний балл первой команды больше, то нужно вывести слово "First", если больше средний балл второй команды, то слово "Second", а если эти средние баллы равны - то слово "Draw".
 */

import java.util.Scanner;

class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        int b1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int b2 = scanner.nextInt();
        int c2 = scanner.nextInt();
        int d2 = scanner.nextInt();
        double avg1 = (a1 + b1) / 2.;
        double avg2 = (a2 + b2 + c2 + d2) / 4.;
        //int max = avg1;
        if (avg1 == avg2) {
            System.out.println("Draw");
        } else {
            if (avg1 > avg2) {
                System.out.println("First");
            } else {
                System.out.println("Second");
            }
        }
        }
    }


