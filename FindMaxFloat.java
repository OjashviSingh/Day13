import java.util.Scanner;

public class FindMaxFloat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        float num1 = sc.nextFloat();

        System.out.print("Enter the second number: ");
        float num2 = sc.nextFloat();

        System.out.print("Enter the third number: ");
        float num3 = sc.nextFloat();

        float max = Math.max(num1, Math.max(num2, num3));

        System.out.println("The maximum number is " + max);
    }
}
