package exercisesPack1;

public class CalculateSquares {

    public static void printCalculatedSquares() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += (i * i);
        }
        System.out.println(sum);
    }

}
