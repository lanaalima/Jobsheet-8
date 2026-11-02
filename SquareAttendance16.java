import java.util.Scanner;
public class SquareAttendance16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       System.out.print("Enter the value of N = ");
        int N = scanner.nextInt();
        for (int iOuter = 1; iOuter <= N; iOuter++) {
            for (int iInner = 1; iInner <= N; iInner++) {
                System.out.print("*");
            }
          System.out.println();
        }
    }
}

