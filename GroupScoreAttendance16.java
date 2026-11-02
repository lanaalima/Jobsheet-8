import java.util.Scanner;

public class GroupScoreAttendance16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1;
        int score;
        int totalScore;
        double avgScore;

        while (i <= 6) {
            System.out.println("Group " + i);

            totalScore = 0;
            for (int j = 1; j <= 5; j++) {
                System.out.print("  Score from Rater Group " + j + ": ");
                score = sc.nextInt();
                totalScore += score;
            }

            avgScore = totalScore / 5.0;
            System.out.println("Group " + i + ": average score = " + avgScore);

            i++;
        }

        sc.close();
    }
}

