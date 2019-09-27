package exercisesPack1;

import java.util.Scanner;

public class FibonacciNumbers {

    public static int getNumber() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static int computeTheFibonacciNumbers(int n) {
        int fib[] = new int[n + 2]; // 1 extra to handle case, n = 0
        int i;
        //0th and 1st number of the series are 0 and 1
        fib[0] = 0;
        fib[1] = 1;
        for (i = 2; i <= n; i++) {
            //Add the previous 2 numbers in the series and store it
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[n];
    }

}
