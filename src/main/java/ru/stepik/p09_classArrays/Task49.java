/*
Пользователь вводит размер массива и начальное значение генератора случайных чисел.
Затем он вводит контрольный элемент (целое число).
Создать массив заданного размера и заполнить его случайными числами от 2 до 15 (включительно).
Отсортировать массив по возрастанию.
Распечатать отсортированный массив, используя метод toString() - в квадратных скобках, элементы через запятую.
Найти в отсортированном массиве индекс контрольного элемента и удалить все элементы после него (создать новый массив нужного размера).
Если контрольный элемент отсутствовал в массиве, то вывести "ERROR".
В противном случае распечатать полученный массив методом toString().
*/



package ru.stepik.p09_classArrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int numberControl = scanner.nextInt();
        Random random = new Random(x);
        int[] mas = new int[n];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(2, 16);
        }
        Arrays.sort(mas);
        String str = Arrays.toString(mas);
        System.out.println(str);
        int ind = Arrays.binarySearch(mas, numberControl);
        if (ind < 0) {
            System.out.println("ERROR");
        } else {
            int[] masCopy = Arrays.copyOfRange(mas,0, ind +1);
            String str2 = Arrays.toString(masCopy);
            System.out.println(str2);
        }
    }
}
