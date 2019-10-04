/**
 * Created by akmatov_az on 10/4/2019.
 */

public class Rocket {
    public static void main(String[] args) {

        int row, sym, space, topstar;

        // Left part of the rocket's top
        for(row = 5; row >=1; row--) {
            for(space = 0; space <= row; space++) {
                System.out.print(" "); // Space before every string
            }

            for(sym = 5; sym >= row; sym--) {
                System.out.print("/"); // Print the symbols
            }
            System.out.println();
        }

        // Middle part of the rocket's top
        for (row = 5; row >= 1; row--) {
            for (topstar = 2; topstar >= 1; topstar--) {
                System.out.print("*");
            }
            System.out.println();
        }


        // The end of the main method
    }
}
