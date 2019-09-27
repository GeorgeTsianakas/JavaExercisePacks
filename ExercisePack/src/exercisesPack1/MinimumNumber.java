package exercisesPack1;

import java.util.Scanner;

public class MinimumNumber {

    public static void minimumOfThreeNumbers() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int x = input.nextInt();
        System.out.print("Input the Second number: ");
        int y = input.nextInt();
        System.out.print("Input the third number: ");
        int z = input.nextInt();
        int minimum = Math.min(Math.min(x, y), z);
        System.out.print("The smallest value is " + minimum);
    }

}
