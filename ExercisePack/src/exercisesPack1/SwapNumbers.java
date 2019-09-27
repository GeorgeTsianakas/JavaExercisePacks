package exercisesPack1;

import java.util.Scanner;

public class SwapNumbers {

    public static void swapTwoNumbers() {
        int x, y, z;
        Scanner input = new Scanner(System.in);
        System.out.println("Input the first number: ");
        x = input.nextInt();
        System.out.println("Input the second number: ");
        y = input.nextInt();
        z = x;
        x = y;
        y = z;
        System.out.println(" New first and second number values are :" + x + " and " + y);
    }

}
