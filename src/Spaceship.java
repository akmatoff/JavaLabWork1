public class Spaceship {
    public static int SIZE = 2;

    static void topAndBottom() {
        int row, sym, space;

        for(row = 5; row >= -(SIZE * 2 - 1) ; row--) {
            for(space = 1; space <= row + (SIZE * 2); space++) {
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

    static void bodyDivider() {
        int row, sym;

        for(row = 0; row < 1; row++) {
            for(sym = 0; sym <= row; sym++) {
                System.out.print("+=*");
            }

            for(sym = 4; sym >= row - SIZE * 2; sym--) {
                System.out.print("=*");
            }
            System.out.print("+");
            System.out.println();
        }
    }

    static void bodyTopHalf() {
        int row, sym, x, dot, i = 0;

        for(row = 3; row >= -SIZE + 1; row--) {
            for(x = 3; x <= 3; x++) {
                System.out.print("|");
            }

            for(dot = 2; dot <= row + SIZE; dot++) {
                System.out.print(".");
            }

            for(sym = 3; sym >= row; sym--) {
                System.out.print("/\\");
            }

            for(dot = 3; dot >= i - SIZE * 2; dot--) {
                System.out.print(".");
            }

            i = i + 2;

            for(sym = 3; sym >= row; sym--) {
                System.out.print("/\\");
            }

            for(dot = 2; dot <= row + SIZE; dot++) {
                System.out.print(".");
            }

            for(x = 3; x <= 3; x++) {
                System.out.print("|");
            }
            System.out.println();
        }
    }

    static void bodyBottomHalf() {
        int row, x, sym, dot, i = 0;

        for(row = 3; row >= -SIZE + 1; row--) {
            for(x = 3; x <= 3; x++) {
                System.out.print("|");
            }

            for(dot = 2; dot >= row - SIZE + SIZE; dot--) {
                System.out.print(".");
            }

            for(sym = 1; sym <= row + SIZE; sym++) {
                System.out.print("\\/");
            }

            for(dot = 1; dot <= i + SIZE - SIZE; dot++) {
                System.out.print(".");
            }

            i = i + 2;

            for(sym = 1; sym <= row + SIZE; sym++) {
                System.out.print("\\/");
            }

            for(dot = 2; dot >= row - SIZE + SIZE; dot--) {
                System.out.print(".");
            }

            for(x = 3; x <= 3; x++) {
                System.out.print("|");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        topAndBottom();
        bodyDivider();
        bodyTopHalf();
        bodyBottomHalf();
        bodyDivider();
        bodyBottomHalf();
        bodyTopHalf();
        bodyDivider();
        topAndBottom();
    }
}
