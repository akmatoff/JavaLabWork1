import java.util.Scanner;

class Hypotenuse {
    static void hypotenuse(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение для катета a: ");
        double kateta = scanner.nextInt();
        System.out.println("Введите значение для катета b: ");
        double katetb = scanner.nextInt();

        // Вычисляю гипотенузу треугольника
        double katetasquare = kateta*kateta;
        double katetbsquare = katetb*katetb;
        double sum = katetasquare + katetbsquare;
        double hypotenuse = Math.sqrt(sum);

        // Вычисляю значение угла треугольника
        double divide = kateta / katetb;
        double tan = Math.tan(divide);
        double todegree = tan * (180 / Math.PI);

        // Вычисляю высоту треугольника
        double p = (kateta + katetb + hypotenuse) / 2;
        double a = p * (p - kateta) * (p - katetb) * (p - hypotenuse);
        double adivide = a / kateta;
        double h = (Math.sqrt(a) * 2) / kateta;

        // Вычисляю площадь треугольника
        double S = (kateta * h) / 2;

        // Вычисляю периметр треугольника
        double P = kateta + katetb + hypotenuse;

        System.out.println("Гипотенуза треугольника равна: " + hypotenuse + " см");
        System.out.println("Значение угла равно: " + todegree + " градусов");
        System.out.println("Высота треугольника равна: " + h + " см");
        System.out.println("Площадь треугольника равна: " + S + " см в квадрате");
        System.out.println("Периметр треугольника равна: " + P + " см");

    }
}
