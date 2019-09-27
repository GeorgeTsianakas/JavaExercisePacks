package exercisesPack1;

public class CountFrom111To8899 {

    public static void countNumbersFrom111To8899() {
        final int lowerbound = 111;
        final int upperbound = 8899;
        int sum = 0;
        int count = 0;
        for (int number = lowerbound; number <= upperbound; number++) {
            sum += number;
            count++;
        }
        System.out.println(sum);
    }

}
