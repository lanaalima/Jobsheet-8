import java.util.Scanner;

public class KopiSenjaAttendance16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalCustomers = 0;
        int totalItems = 0;

        System.out.print("Number of cafe branches: ");
        int branches = sc.nextInt();

        System.out.println();
        System.out.println("=== Sales Input Per Branch ===");
        System.out.println();

       
        for (int b = 1; b <= branches; b++) {
            System.out.println("--- Branch " + b + " ---");
            System.out.print("Number of customers: ");
            int customers = sc.nextInt();

        
            int branchItems = 0;

            
            for (int c = 1; c <= customers; c++) {
                System.out.print("- How many items did customer " + c + " order? ");
                int items = sc.nextInt();
                branchItems += items;
            }

        
            System.out.println("Branch " + b + ":");
            System.out.println("- Customers: " + customers);
            System.out.println("- Items sold: " + branchItems);
            System.out.println();

            // Add to grand total
            totalCustomers += customers;
            totalItems += branchItems;
        }

        
        System.out.println("Total across all branches:");
        System.out.println("Customers: " + totalCustomers);
        System.out.println("Items sold: " + totalItems);

        sc.close();
    }
}