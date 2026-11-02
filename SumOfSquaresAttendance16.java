import java.util.Scanner;

public class SumOfSquaresAttendance16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the maximum value of n = ");
        int max = sc.nextInt();


        for (int n = 1; n <= max; n++) {
            int sum = 0;
            System.out.print("n = " + n + " \u2192 sum of squares = ");

            // Inner loop: square of each number from 1 to n
            for (int k = 1; k <= n; k++) {
                int square = k * k;
                sum += square;

                if (k > 1) {
                    System.out.print(" + ");
                }
                System.out.print(square);
            }

            
            if (n > 1) {
                System.out.print(" = " + sum);
            }
            System.out.println();
        }

        sc.close();
    }
}