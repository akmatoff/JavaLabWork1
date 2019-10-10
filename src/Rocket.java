/**
 * Created by akmatov_az on 10/4/2019.
 */

public class Rocket {
    public static final int SIZE = 2;
    // ================ TOP OF THE ROCKET ==================
    static void top() {

        int row, sym, space;

        for(row = 5; row >= -SIZE - SIZE / 2; row--) {
            for(space = 1; space <= row + SIZE + SIZE; space++) {
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

    // ============== BODY OF THE ROCKET ====================
    static void body() {
        int row, sym, x, dot, i = 3;

        // ======= PLUS & EQUAL SYMBOLS =======
        for (row = 0; row < 1; row++) {
            for (sym = 0; sym >= 0; sym--) {
                System.out.print("+=*");
            }
            for (sym = 4; sym >= -SIZE * 2; sym--) {
                System.out.print("=*");
            }
            System.out.print("+");
            System.out.println();
        }

        // ============== MIDDLE PART ======================
        for (row = 3; row >= 1 - SIZE * 2; row--) {
            for (x = 6; x >= 6; x--) {
                System.out.print("|"); // Side lines
            }

            for (dot = 2; dot <= row + SIZE; dot++) {
                System.out.print(".");
            }

            for (sym = 3; sym >= row - SIZE / 2 + 1; sym--) {
                System.out.print("/\\");
            }

            for (dot = 6; dot >= i - SIZE * 2; dot--) {
                System.out.print(".");
            }

            i = i + 2;

            for (sym = 3; sym >= row - SIZE / 2 + 1; sym--) {
                System.out.print("/\\");
            }

            for (dot = 2; dot <= row + SIZE; dot++) {
                System.out.print(".");
            }

            for (x = 6; x >= 6; x--) {
                System.out.print("|"); // Side lines
            }


            System.out.println();
        }

        // ============= LOWER PART ==================
        for (row = 1; row <= SIZE + 1; row++) {
            for (x = 6; x >= 6; x--) {
                System.out.print("|"); // Side lines
            }

            for (dot = 2; dot <= row + SIZE * 2 - 1; dot++) {
                System.out.print(".");
            }

            for (sym = 3; sym >= row + SIZE / 2; sym--) {
                System.out.print("\\/");
            }

            for (dot = 10; dot <= i - SIZE * 2 + 2; dot++) {
                System.out.print(".");
            }

            i = i + 2;

            for (sym = 3; sym >= row + SIZE / 2; sym--) {
                System.out.print("\\/");
            }

            for (dot = 2; dot <= row; dot++) {
                System.out.print(".");
            }

            for (x = 6; x >= 6; x--) {
                System.out.print("|"); // Side lines
            }

            System.out.println();
        }


        // =========== PLUS & EQUAL SYMBOLS ==============
        for (row = 0; row < 1; row++) {
            for (sym = 0; sym >= 0; sym--) {
                System.out.print("+=*");
            }
            for (sym = 4; sym >= -SIZE * 2; sym--) {
                System.out.print("=*");
            }
            System.out.print("+");
            System.out.println();
        }

        // ============== MIDDLE PART 2 ======================
        for(row = 1; row <= 3; row++) {
            for(x = 6; x >= 6; x--) {
                System.out.print("|"); // SIDE LINES
            }

            for (dot = 2; dot <= row; dot++) {
                System.out.print(".");
            }

            for (sym = 3; sym >= row; sym--) {
                System.out.print("\\/");
            }

            for (dot = 16; dot <= i; dot++) {
                System.out.print(".");
            }

            i = i + 2;

            for (sym = 3; sym >= row; sym--) {
                System.out.print("\\/");
            }

            for (dot = 2; dot <= row; dot++) {
                System.out.print(".");
            }

            for (x = 6; x >= 6; x--) {
                System.out.print("|"); // Side lines
            }

            System.out.println();
        }

        // ============== LOWER PART 2 =====================
        i = 3;
        for (row = 3; row >= 1; row--) {
            for (x = 6; x >= 6; x--) {
                System.out.print("|"); // Side lines
            }

            for (dot = 2; dot <= row; dot++) {
                System.out.print(".");
            }

            for (sym = 3; sym >= row; sym--) {
                System.out.print("/\\");
            }

            for (dot = 6; dot >= i; dot--) {
                System.out.print(".");
            }

            i = i + 2;

            for (sym = 3; sym >= row; sym--) {
                System.out.print("/\\");
            }

            for (dot = 2; dot <= row; dot++) {
                System.out.print(".");
            }

            for (x = 6; x >= 6; x--) {
                System.out.print("|"); // Side lines
            }

            System.out.println();
        }

        // =========== PLUS & EQUAL SYMBOLS ==============
        for (row = 0; row < 1; row++) {
            for (sym = 0; sym >= 0; sym--) {
                System.out.print("+=*");
            }
            for (sym = 4; sym >= -SIZE * 2; sym--) {
                System.out.print("=*");
            }
            System.out.print("+");
            System.out.println();
        }

    }

    // ============== BOTTOM OF THE ROCKET =================
    static void bottom() {
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

        top();
        body();
        bottom();

        // ============ THE END OF THE MAIN METHOD ==================
    }
}
