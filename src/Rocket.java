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
        int row, sym, x, dot, i = 6;

        // Plus and equal symbols
        for(row = 0; row < 1; row++) {
            for(sym = 0; sym >= 0; sym--) {
                System.out.print("+=*");
            }
            for(sym = 4; sym >= 0; sym--) {
                System.out.print("=*");
            }
            System.out.print("+");
            System.out.println();
        }

        // Middle part
        for(row = 6; row >= 1; row--) {
            for(x = 6; x >= 6; x--) {
                System.out.print("|"); // Side lines
            }

            for(dot = 5; dot <= row; dot++) {
                System.out.print(".");
            }

            for(sym = 6; sym >= row; sym--) {
                System.out.print("/\\");
            }
            System.out.println();
        }



        // Plus and equal symbols
        for(row = 0; row < 1; row++) {
            for(sym = 0; sym >= 0; sym--) {
                System.out.print("+=*");
            }
            for(sym = 4; sym >= 0; sym--) {
                System.out.print("=*");
            }
            System.out.print("+");
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
