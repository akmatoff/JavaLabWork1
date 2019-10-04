public class Pyramid {
    public static void main(String[] args) {
        int row, i, x = 1;
            for (row = 4; row >= 1; row--) {
                for(int space = 0; space <= row; space++) {
                    System.out.print("  ");
                }
                for (i = 1; i <= x; i++) {
                    System.out.print(i + " ");
                }
                x = x + 2;
                System.out.println();
        }

    }
}
