package Homework1;

import java.util.Arrays;

public class Task2 {
    /*
    * Вывести все простые числа от 1 до 1000
    * */
    public static void main(String[] args) {
        int number = 1000;
        PrintPrime(number);

    }
    public static boolean isPrimes(int n) {
        boolean flag = false;
        if (n == 2) flag = true;
        for (int i = 2; i < n; i++) {
            if (i == (n - 1)) flag = true;
            if ((n % i) == 0) break;
        }
        return flag;
    }
    public static void PrintPrime(int number) {
        for (int j = 2; j <= number ; j++)
            if (isPrimes(j)) System.out.printf("Простое число: %d\n", j);
    }

}
