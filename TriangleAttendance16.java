import java.util.Scanner;
public class TriangleAttendance16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n = ");
        int n = scanner.nextInt();
        int i = 1;  
        while (i <= n) {
                int j = 0;  
                while (j < i) {
                    System.out.print("*");
                    j++;
                }
                System.out.println();
                i++;
        }
    }
}
