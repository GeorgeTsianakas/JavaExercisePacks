package exercisesPack1;

import java.util.Scanner;

public class EvenNumber {

    public static void isNumberEven() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " is even");
            System.out.println("True");
        } else {
            System.out.println(num + " isn't even");
            System.out.println("False");
        }
    }

}
