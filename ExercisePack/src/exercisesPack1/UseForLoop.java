package exercisesPack1;

import java.util.Scanner;

public class UseForLoop {

    public static int getNumbers() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static void useForLoopInstead(int lowerbound, int upperbound) {
        int number = lowerbound;
        int sum = 0;
        for (number = upperbound; number < sum; number++) {
            sum += number;
            ++number;
        }
        System.out.println("Modification Done");
    }

}
