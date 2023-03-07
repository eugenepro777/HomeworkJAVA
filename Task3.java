package Homework1;

import java.util.Scanner;

public class Task3 {
    /*
    *  Реализовать простой калькулятор
    * */
    public static void main(String[] args) {
        Scanner scanIn = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double numFirst = scanIn.nextDouble();
        System.out.print("Введите второе число: ");
        double numSecond = scanIn.nextDouble();
        double result;
        System.out.print("Задайте действие: ");
        String operation = scanIn.nextLine();
        operation = scanIn.nextLine();

        calculus(numFirst,
                numSecond,
                operation);

    }
    public static double pow(double value, double pow) {
        if (pow == 1) {
            return value;
        } else {
            return value * pow(value, pow - 1);
        }
    }

    public static void calculus(double number1, double number2, String str) {
        double result;
        switch (str){
            case "+":
                result = number1 + number2;
                System.out.printf("Результат = %.2f\n", result);
                break;
            case "-":
                result = number1 - number2;
                System.out.printf("Результат = %.2f\n", result);
                break;
            case "*":
                result = number1 * number2;
                System.out.printf("Результат = %.2f\n", result);
                break;
            case "**":
                result = pow(number1, number2);
                System.out.printf("Результат = %.2f\n", result);
                break;
            case "/":
                if (number2 == 0)
                    System.out.println("Деление на ноль!");
                else {
                    result = number1 / number2;
                    System.out.printf("Результат = %.2f\n", result);
                }
                break;
            default:
                System.out.println("Ошибка при вводе");
        }
    }

}
