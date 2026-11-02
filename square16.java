import java.util.Scanner;

public class square16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        // Keep asking until n is at least 3
        do {
            System.out.print("Enter the value of n (minimum 3) = ");
            n = sc.nextInt();
            if (n < 3) {
                System.out.println("n must be at least 3.");
            }
        } while (n < 3);

        // Outer loop: rows
        for (int i = 1; i <= n; i++) {
            // Inner loop: columns
            for (int j = 1; j <= n; j++) {
                // Border: first/last row or first/last column
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print(n + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}