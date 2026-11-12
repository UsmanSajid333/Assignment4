package Task2.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] residents = new int[n];

        for (int i = 0; i < n; i++) {
            residents[i] = sc.nextInt();
        }

        int leftSum = 0;
        int rightSum = 0;
        int leftHouses = 0;
        int rightHouses = 0;

        for (int i = 0; i < n; i++) {
            int houseNumber = i + 1;
            if (houseNumber % 2 == 1) {
                leftSum += residents[i];
                leftHouses++;
            } else {
                rightSum += residents[i];
                rightHouses++;
            }
        }

        System.out.println("Total residents: " + (leftSum + rightSum));
        System.out.println("Residents on the left: " + leftSum);
        System.out.println("Residents on the right: " + rightSum);
        System.out.println("Average per house on the left: " + average(leftSum, leftHouses));
        System.out.println("Average per house on the right: " + average(rightSum, rightHouses));
    }

    static String average(int sum, int houses) {
        if (houses == 0) {
            return "N/A";
        }
        if (sum % houses == 0) {
            return String.valueOf(sum / houses);
        }
        return String.format(Locale.US, "%.2f", (double) sum / houses);
    }
}
