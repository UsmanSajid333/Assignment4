package Task3.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int subjects = sc.nextInt();
        int students = sc.nextInt();

        int[] sums = new int[students];
        boolean[] hasLow = new boolean[students];
        int total = 0;
        int best = 0;

        // read grades
        for (int i = 0; i < students; i++) {
            for (int j = 0; j < subjects; j++) {
                int grade = sc.nextInt();
                sums[i] = sums[i] + grade;
                if (grade < 5) {
                    hasLow[i] = true;
                }
            }
            total = total + sums[i];
            if (sums[i] > best) {
                best = sums[i];
            }
        }

        System.out.println("Student averages:");
        for (int i = 0; i < students; i++) {
            System.out.println(average(sums[i], subjects));
        }

        System.out.println();
        System.out.println("Group average:");
        System.out.println(average(total, subjects * students));

        System.out.println();
        System.out.println("Highest-performing student:");
        for (int i = 0; i < students; i++) {
            if (sums[i] == best) {
                System.out.println(i + 1);
            }
        }

        System.out.println();
        System.out.println("Students with at least one grade below 5:");
        boolean found = false;
        for (int i = 0; i < students; i++) {
            if (hasLow[i]) {
                System.out.println(i + 1);
                found = true;
            }
        }
        if (!found) {
            System.out.println("None");
        }
    }

    static String average(int sum, int count) {
        if (sum % count == 0) {
            return String.valueOf(sum / count);
        }
        return String.format(Locale.US, "%.2f", (double) sum / count);
    }
}
