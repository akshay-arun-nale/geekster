import java.util.*;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int arr[][] = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("wave matrix");
        for (int i = 0; i < b; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < a; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                for (int j = a - 1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
        System.out.println("vertical wave");
        for (int i = 0; i < a; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < a; j++) {
                    System.out.print(arr[j][i] + " ");
                }
            } else {
                for (int j = a - 1; j >= 0; j--) {
                    System.out.print(arr[j][i] + " ");
                }
            }
        }
    }
}
