package Homework1;

import java.util.Scanner;

public class Task1 {
    /*
    * Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
    * */
    public static void main(String[] args) {
        System.out.print("Задайте число n: ");
        Scanner scanner = new Scanner(System.in);
        int numberIn = scanner.nextInt();
        System.out.printf("Треугольное число = %d\n", getTriangularNumber(numberIn));
        System.out.printf("Факториал = %.1f", getFactorial(numberIn));
        scanner.close();


    }
public static int getTriangularNumber(int num){
    return (num * (num + 1)) / 2;
}
public static double getFactorial(int num){
        if (num==1) return 1;
        return num*getFactorial(num - 1);

}

}
