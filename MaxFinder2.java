import java.util.*;

public class MaxFinder2 {

    public static <T extends Comparable<T>> T max(T... elements) {
        Arrays.sort(elements);
        return elements[elements.length - 1];
    }

    public static void main(String[] args) {
        Integer max1 = max(1, 2, 3, 4, 5);
        System.out.println("Max1: " + max1);

        Double max2 = max(1.2, 2.3, 3.4, 4.5, 5.6);
        System.out.println("Max2: " + max2);

        String max3 = max("apple", "banana", "orange", "pear");
        System.out.println("Max3: " + max3);
    }

}
