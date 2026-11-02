import java.util.Scanner;
public class StarAttendance16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n = ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i += 2) {
            System.out.print("*");
        }
    }
}