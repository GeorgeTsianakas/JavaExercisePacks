package exercisesPack1;

import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void printSumOffTwoIntegerNumbers() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int a = input.nextInt();
        System.out.print("Input the second number: ");
        int b = input.nextInt();
        int sum = a + b;
        System.out.println();
        System.out.println("Sum of the first number and the second number is: " + sum);
    }

    public static void printSumOffTwoFloatNumbers() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the first number: ");
        float a = input.nextFloat();
        System.out.print("Input the second number: ");
        float b = input.nextFloat();
        float sum = a + b;
        System.out.println();
        System.out.println("Sum of the first number and the second number is: " + sum);
    }

}
