import java.util.Scanner;

public class FindMaxString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();

        System.out.print("Enter the third string: ");
        String str3 = sc.nextLine();

        String max = str1;

        if (str2.compareTo(max) > 0) {
            max = str2;
        }

        if (str3.compareTo(max) > 0) {
            max = str3;
        }

        System.out.println("The maximum string is " + max);
    }
}
