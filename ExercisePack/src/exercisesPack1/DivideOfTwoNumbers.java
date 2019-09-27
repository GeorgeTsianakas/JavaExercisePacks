package exercisesPack1;

import java.util.Scanner;

public class DivideOfTwoNumbers {

    public static void printDivideOfTwoIntegerNumbers() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int a = input.nextInt();
        System.out.print("Input the second number: ");
        int b = input.nextInt();
        int div = (a / b);
        System.out.println();
        System.out.println("The division of first number and second number is:" + div);
    }

    public static void printDivideOfTwoFloatNumbers() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the first number: ");
        float a = input.nextFloat();
        System.out.print("Input the second number: ");
        float b = input.nextFloat();
        float div = (a / b);
        System.out.println();
        System.out.println("The division of first number and second number is:" + div);
    }

}
