package exercisesPack1;

import java.util.Scanner;

public class DoWhileLoopModify {

    public static int getNumbers() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static void mofifyDoWhile(int lowerbound, int upperbound) {
        int number = lowerbound;
        int sum = 0;
        do {
            sum += number;
            ++number;
        } while (number <= upperbound);
        System.out.println("Modification Done");
    }

}
