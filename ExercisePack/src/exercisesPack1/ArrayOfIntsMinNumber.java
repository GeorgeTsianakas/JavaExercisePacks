package exercisesPack1;

import java.lang.reflect.Array;
import java.util.*;

public class ArrayOfIntsMinNumber {

    public static void printMinValueOfAnArray() {
        int intArray[];
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        intArray = new int[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = input.nextInt();
        }
        List<Integer> listOfIntegers = new ArrayList<>();
        Integer min = Integer.MIN_VALUE;
        for (Integer i : listOfIntegers) {
            if (min > i) {
                min = i;
            }
        }
        System.out.println(min);
    }

}
