import java.util.*;

public class even {
    static int even(int num2, int num1) {
        if (num1 > num2)
            return 0;
        System.out.print(num2 + " ");
        return even(num2 - 2, num1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 2, num2;
        System.out.print("Enter upper Limit:");
        num2 = sc.nextInt();
        System.out.print("elements : ");
        even(num2, num1);
        sc.close();
    }
}
