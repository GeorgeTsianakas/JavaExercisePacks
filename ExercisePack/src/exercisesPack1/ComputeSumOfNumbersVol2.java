package exercisesPack1;

public class ComputeSumOfNumbersVol2 {

    public static void printSumWithN50000() {
        double i, s = 0.0;
        for (i = 1; i <= 50000; i++) {
            s = s + 1 / i;
        }
        System.out.println(s);
    }
}
