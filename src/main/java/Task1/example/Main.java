package Task1.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int circlesCount = scanner.nextInt();
        int maxRadius = scanner.nextInt();
        int maxTimes = 1;

        for (int i = 1; i < circlesCount; i++) {
            int radius = scanner.nextInt();
            if (radius > maxRadius) {
                maxRadius = radius;
                maxTimes = 1;
            } else if (radius == maxRadius) {
                maxTimes++;
            }
        }

        System.out.println(maxRadius + " - " + maxTimes);
    }
}
