package anwithaworld.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        double kilometersPerHour = 100;
        double milesPerHour = toMilesPerHour(kilometersPerHour);
        System.out.println(milesPerHour);
    }

    public static double toMilesPerHour (double kmsPerHour) {

        if (kmsPerHour < 0) {
            return -1;
        }
        return kmsPerHour / 1.608;

    }
}
