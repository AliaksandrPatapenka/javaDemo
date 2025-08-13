package ru.stepik.p2_ifElse;/*
Грузовой самолет должен пролететь с грузом из пункта А в пункт С через пункт В.
Емкость бака для топлива у самолета – 300 литров.
В точке А бак заправляют полностью.
Потребление топлива на 1 км в зависимости от веса груза у самолета следующее:

          - до 500 кг  (включительно) :    1 литров / км

          - до 1000 кг (включительно):   4 литров / км

          - до 1500 кг (включительно):   7 литров / км

          - до 2000 кг (включительно):   9 литров / км.

          - более 2000 кг – самолет не поднимает.

Пользователь вводит расстояние между пунктами А и В,  расстояние между пунктами В и С, а также вес груза.
Программа должна рассчитать какое минимальное количество топлива необходимо для дозаправки самолету в пункте В, чтобы долететь из пункта А в пункт С.
В случае невозможности преодолеть любое из расстояний – программа должна вывести ERROR.
Числовой результат работы программы округляется до двух знаков после десятичной точки.
 */



import java.util.Locale;
import java.util.Scanner;

class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        int distanceAB = scanner.nextInt();
        int distanceBC = scanner.nextInt();
        int mass = scanner.nextInt();
        int volume = 300;
        int index = 0;
        if (mass < 501) index = 1;
        if (mass > 500 && mass < 1001) index = 4;
        if (mass > 1000 && mass < 1501) index = 7;
        if (mass > 1500 && mass < 2001) index = 9;
        if (mass > 2000) {
            System.out.println("ERROR");
            return;
        }
        //System.out.println(index);
        double volumeAB = (volume - (distanceAB * index));
        //System.out.println(volumeAB);
        if (volumeAB < 0) {
            System.out.println("ERROR");
            return;
        }
        double volumeBC = (distanceBC * index);
        //System.out.println(volumeBC);
        if (volumeBC > 300) {
            System.out.println("ERROR");
            return;
        }
        double volumeBonus = volumeBC - volumeAB;
        if (volumeBonus < 0) volumeBonus = 0;
        System.out.printf( "%.2f", volumeBonus);


    }
}