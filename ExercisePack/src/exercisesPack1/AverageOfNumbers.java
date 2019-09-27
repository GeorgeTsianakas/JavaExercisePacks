package exercisesPack1;

import java.util.Scanner;

public class AverageOfNumbers {

    public static void printAverageOfNumbers() {
        double num = 0;
        double x = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Input how many numbers you want to calculate the average: ");
        int n = input.nextInt();
        while (x <= n) {
            System.out.println("Input number " + "(" + (int) x + ")" + ":");
            num += input.nextInt();
            x += 1;
        }
        double average = (num / n);
        System.out.println("Average:" + average);
    }

}
