public class Pyramid {
    public static void main(String[] args) {
        int row, i, x = 1;
            for (row = 1; row <= 4; row++) {
                if(row == 3) {
                    System.out.print("  ");
                } else if(row == 2) {
                    System.out.print("    ");
                } else if(row == 1) {
                    System.out.print("      ");
                }
                for (i = 1; i <= x; i++) {
                    System.out.print(i + " ");
                }
                x = x + 2;
                System.out.println();
        }

    }
}
