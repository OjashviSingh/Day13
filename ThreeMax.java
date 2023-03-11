public class ThreeMax<T extends Comparable<T>> {
    private T var1;
    private T var2;
    private T var3;

    public ThreeMax(T var1, T var2, T var3) {
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
    }

    public T testMaximum() {
        return ThreeMax.testMaximum(var1, var2, var3);
    }

    public static <T extends Comparable<T>> T testMaximum(T var1, T var2, T var3) {
        T max = var1;
        if (var2.compareTo(max) > 0) {
            max = var2;
        }
        if (var3.compareTo(max) > 0) {
            max = var3;
        }
        return max;
    }

    public static void main(String[] args) {
        ThreeMax<Integer> intMax = new ThreeMax<>(1, 2, 3);
        System.out.println(intMax.testMaximum());

        ThreeMax<String> stringMax = new ThreeMax<>("Apple", "Peach", "Banana");
        System.out.println(stringMax.testMaximum());

        ThreeMax<Float> floatMax = new ThreeMax<>(1.5f, 2.5f, 3.5f);
        System.out.println(floatMax.testMaximum());
    }
}
