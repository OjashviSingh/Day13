public class MaxFinder {

    public static <T extends Comparable<T>> T findMax(T a, T b, T c) {
        T max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {
        int intMax1 = findMax(10, 5, 7);
        System.out.println("Max Integer (10, 5, 7): " + intMax1);

        String strMax1 = findMax("Apple", "Peach", "Banana");
        System.out.println("Max String (Apple, Peach, Banana): " + strMax1);

        float floatMax1 = findMax(2.5f, 5.0f, 1.5f);
        System.out.println("Max Float (2.5f, 5.0f, 1.5f): " + floatMax1);
    }
}
