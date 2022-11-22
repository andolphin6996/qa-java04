package org.example;

public class Main {
    public static void main(String[] args) {
        //Целочисленные
        byte varByte = 1; //-128 .. 127
        short varShort = 1; //-32768 .. 32767
        int varInt = 1;
        long varLong = 1L;

        //Числа с плавающей точкой
        float varFloat = 0.0f;
        double varDouble = 0.0d;

        //Логический
        boolean varBoolean = false;

        //Символьный
        char varChar = 'a';

        String varString = "Hello world!";

        // Переполнение
        byte a = 127;
        System.out.println(++a);

        int b = 2147483647;
        System.out.println(++b);

        // Математические операции
        int c = 2050 + 6070;
        System.out.println(c);

        int d = 25 % 2;
        System.out.println(d);

        //Логические операторы и операторы сравнения
        int g = 6;
        int e = 4;
        if (g > e) {
            System.out.println("Первое число больше второго");
        }

        int f = -9;
        int j = 5;
        if (f > j) {
            System.out.println("Первое число больше второго");
        }
        else {
            System.out.println("Второе число больше первого");
        }

        int h = 999;
        int s = 777;
        if (h != s) {
            System.out.println("i");
        }

        //Вычисления комбинации разных типов данных (int и double)

        int x = 80;
        double y = 8.5;
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y - y);
        System.out.println(x / y);

    }
}