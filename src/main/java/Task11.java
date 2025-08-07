/*
Программа должна определить зарплату служащего компании.
Пользователь вводит количество отработанных часов (целое) и почасовой тариф (вещественное).
Тариф - это стоимость одного часа работы служащего. Компания платит за первые 20 часов (включительно) по обычному тарифу.
За время, отработанное от 20 (не включая) до 40 часов (включительно) - тариф за каждый час умножается на полтора.
А если служащий работает свыше 40 часов, то он получает двойной тариф эти часы переработки.
Например, если служащий отработал 42 часа, а почасовой тариф 10.5 рублей, то он получит
20*10.5=210 рублей за первые 20 часов;
20*10.5*1.5=315 рублей за вторые 20 часов;
2*10.5*2=42 рубля за последние 2 часа.
Итого 210+315+42=567 рублей.
Вывести зарплату служащего, округлив ее до двух знаков после десятичной точки.
Если введено отрицательное значение количества часов или отрицательный тариф, вывести ERROR.
 */


import java.util.Scanner;
import java.util.Locale;

class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        int hour = scanner.nextInt();
        double rate = scanner.nextDouble();
        if (hour < 0 || rate < 0) {
            System.out.println("ERROR");
            return;
        }
        int bonus1 = 1;
        double bonus2 = 1.5;
        int bonus3 = 2;
        double totalSum = 0;
        if (hour < 21) totalSum = hour * rate * bonus1;
        if ( hour > 20 && hour < 41) totalSum = (20 * rate * bonus1) + ((hour - 20) * rate * bonus2);
        if (hour > 40) totalSum = (20 * rate * bonus1) + (20 * rate * bonus2) + ((hour - 40) * rate * bonus3);
        System.out.printf( "%.2f", totalSum);
}
}