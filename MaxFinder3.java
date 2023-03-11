import java.util.Arrays;

public class MaxFinder3<T extends Comparable<T>> {

    private T[] elements;

    public MaxFinder3(T... elements) {
        this.elements = elements;
    }

    public T max() {
        Arrays.sort(elements);
        T max = elements[elements.length - 1];
        return max;
    }

    public void printMax() {
        System.out.println("The maximum element is: " + max());
    }

    public static void main(String[] args) {
        MaxFinder3<Integer> mf1 = new MaxFinder3<>(1, 2, 3, 4, 5);
        mf1.printMax();

        MaxFinder3<Double> mf2 = new MaxFinder3<>(3.14, 2.71, 1.41, 1.73);
        mf2.printMax();

        MaxFinder3<String> mf3 = new MaxFinder3<>("apple", "banana", "orange", "pear");
        mf3.printMax();
    }
}
