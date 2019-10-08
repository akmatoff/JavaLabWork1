/**
 * Created by akmatov_az on 10/4/2019.
 */

public class Rocket {
    // Top of the rocket
    static void top(int size) {

        int row, sym, space;

        for(row = 5; row >=1; row--) {
            for(space = 1; space <= row; space++) {
                System.out.print(" "); // Space before every string
            }

            for(sym = 5; sym >= row; sym--) {
                System.out.print("/"); // Print the symbols
            }
            System.out.print("**");
            for(sym = 5; sym >= row; sym--) {
                System.out.print("\\");
            }
            System.out.println();
        }
    }

    // Body of the rocket
    static void body(int size) {
        int row, sym, x;

        // Plus and equal symbols
        for(row = 0; row < 1; row++) {
            for(sym = 6; sym >= 0; sym--) {
                System.out.print("+=");
            }
            System.out.println();
        }

        // Middle part
        for(row = 1; row <= 3; row++) {
            for(x = 2; x >= row; x--) {
                System.out.print(".");
            }

            for(sym = 3; sym >= row; sym--) {
                System.out.print("/");
                System.out.print("\\");
            }

            System.out.println();
        }

        // Plus and equal symbols
        for(row = 0; row < 1; row++) {
            for(sym = 6; sym >= 0; sym--) {
                System.out.print("+=");
            }
            System.out.println();
        }

        // Plus and equal symbols
        for(row = 0; row < 1; row++) {
            for(sym = 6; sym >= 0; sym--) {
                System.out.print("+=");
            }
            System.out.println();
        }

    }

    // Bottom of the rocket
    static void bottom(int size) {
        int row, sym,space;

        for(row = 5; row >= 1; row--) {
            for(space = 1; space <= row; space++) {
                System.out.print(" ");
            }
            for(sym = 5; sym >= row; sym--) {
                System.out.print("/");
            }
            System.out.print("**");
            for(sym = 5; sym >= row; sym--) {
                System.out.print("\\");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        top(3);
        body(3);
        bottom(3);

        // The end of the main method
    }
}
