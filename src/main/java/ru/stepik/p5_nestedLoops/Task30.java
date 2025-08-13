/*
Пользователь вводит ширину треугольника.
Нарисовать треугольник из звездочек, как показано в примерах теста.
Если вводятся некорректные данные (ширина  <= 0), то вывести "ERROR".
Р.S. В конце каждой строки невидимых пробелов нет! (Перевод курсора сразу после звездочек).

*******
 *****
  ***
   *

 */

package ru.stepik.p5_nestedLoops;

import java.util.Scanner;

public class Task30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();
         if ( quantity <=0) {
             System.out.println("ERROR");
             return;
         }
         int height;
         if ( (quantity % 2) != 0) {
             height = (quantity / 2) + 1;
         } else {
             height = quantity / 2;
         }
         int quantity2 = quantity;
         int quantity3 = quantity2;
         for (int i = 1; i <= height; i++) {
             for (int j = 1; j <= quantity3; j++) {
                 System.out.print("*");
             }
             System.out.println();
             quantity2--;
             for (int k = quantity2; k > 0 && k < quantity; k++) {
                 System.out.print(" ");
             }
             quantity3 = quantity3 - 2;
         }

        System.out.println();
         }

    }

