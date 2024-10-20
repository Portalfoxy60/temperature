package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите температуру в градусах Цельсия: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Температура в градусах Фаренгейта: " + fahrenheit);
        System.out.print("Введите трехзначное число: ");
        int number = scanner.nextInt();
        int units = number % 10;
        int tens = (number / 10) % 10;
        int hundreds = number / 100;
        int sum = hundreds + tens + units;
        System.out.println("Число сотен: " + hundreds);
        System.out.println("Число десятков: " + tens);
        System.out.println("Число единиц: " + units);
        System.out.println("Сумма цифр: " + sum);
    }
}
