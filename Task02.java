import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        System.out.println("Student grade calculator...");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the no of subjects you attended.");
        int n = scanner.nextInt();

        double sum = 0;
        // Total marks and percentage calculation
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter the marks obtained out 100 for subject " + i);
            double marks = scanner.nextDouble();
            sum = sum + marks;
        }

        double Avg = (double) sum / n;

        // Grade calculations

        String grade;
        if (Avg >= 97.0) {
            grade = "A+";
        } else if (Avg >= 93.0) {
            grade = "A";
        } else if (Avg >= 90.0) {
            grade = "A-";
        } else if (Avg >= 87.0) {
            grade = "B+";
        } else if (Avg >= 83.0) {
            grade = "B";
        } else if (Avg >= 80.0) {
            grade = "B-";
        } else if (Avg >= 77.0) {
            grade = "C+";
        } else if (Avg >= 73.0) {
            grade = "C";
        } else if (Avg >= 70.0) {
            grade = "C-";
        } else if (Avg >= 67.0) {
            grade = "D+";
        } else if (Avg >= 63.0) {
            grade = "D";
        } else if (Avg >= 60.0) {
            grade = "D-";
        } else {
            grade = "C+";
        }

        System.out.println("Total marks          : " + sum);
        System.out.println("Average              : " + Avg);
        System.out.println("The grade            : " + grade);
    }
}