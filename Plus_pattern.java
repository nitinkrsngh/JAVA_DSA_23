import java.util.Scanner;

public class Plus_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, j;
        System.out.print("Enter any number: ");
        n = sc.nextInt();
        sc.close();
        for (i = 1; i <= 2 * n - 1; i++) {
            for (j = 1; j <= 2 * n - 1; j++) {
                if (j == n || i == n)
                    System.out.print("+");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
