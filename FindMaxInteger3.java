import java.util.Scanner;

public class FindMaxInteger3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        Integer num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        Integer num2 = sc.nextInt();

        System.out.print("Enter the third number: ");
        Integer num3 = sc.nextInt();

        Integer max = getMax(num1, num2, num3);

        System.out.println("The maximum number is " + max);
    }

    public static Integer getMax(Integer num1, Integer num2, Integer num3) {
        if (num3.compareTo(num1) >= 0 && num3.compareTo(num2) >= 0) {
            return num3;
        }

        Integer max = num1;

        if (num2.compareTo(max) > 0) {
            max = num2;
        }

        return max;
    }
}
