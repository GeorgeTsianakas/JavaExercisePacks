package exercisesPack1;

public class ComputeAverageOddNumbers {

    public static void printComputeAverageOddNumbers() {
        int count = 0;
        int sum = 0;
        for (int number = 1; number <= 100; ++number) {
            if (number % 2 != 0) {
                sum += number;
                count++;
            }
        }
        System.out.println(sum / (double) count);
    }

}
