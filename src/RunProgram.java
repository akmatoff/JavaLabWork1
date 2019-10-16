import java.util.Scanner;

public class RunProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Выберите какую программу будем запускать (get day, spaceship, pyramid, hypotenuse): ");
        String action = scanner.nextLine();

        switch(action) {
            case "spaceship":
                Spaceship.drawSpaceship(args);
                break;
            case "get day":
                weekDay.getDay(args);
                break;
            case "pyramid":
                Pyramid.buildP(args);
                break;
            case "hypotenuse":
                Hypotenuse.hypotenuse(args);
                break;
        }
    }
}
