/*
Выполните задачу с использованием цикла while.
Пользователь вводит 10 оценок ученика (в 10-балльной системе).
Нужно подсчитать, сколько среди них неудовлетворительных оценок (менее 4 баллов)
 */



import java.util.Scanner;

class Task18 {
    static final  int N = 10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kol = 0; // kol - счетчик введенных оценок
        int mark; // оценка
        int total =0;
        while ( kol < N) {
            mark = scanner.nextInt();
            if (mark < 4) total += 1;
            kol++;
        }
        System.out.println(total);


    }
}