package exercisesPack1;

public class OddNumbersFromZeroTo99 {

    public static void printOddNumbersFrom0To99() {
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

}
