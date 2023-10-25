public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println();

        //Площадь квадрата
        int x = 5;
        System.out.println("Площадь квадрата со стороной " + x + " = " + calculateSquareArea(x));
        System.out.println();

        //Площадь круга
        double pi = 3.14;
        double r = 10;
        System.out.println("Площадь круга с радиусом " + r + " = " + calculateCircleArea(r, pi));
        System.out.println();

        //Площадь треугольника
        double a = 2;
        double b = 5;
        double c = 5;
        System.out.println("Площадь треугольника с произовльными сторонами " + a + "," + b + "," + c + " = " + calculateЕriangleArea(a, b, c));
        System.out.println();

    }

    private static String calculateЕriangleArea(double a, double b, double c) {
        if ((a + b <= c) || (a + c <= b) || (b + c <= a)) {
            return "Это не может быть треугольником";
        } else {
            double p = (a + b + c) / 2;
            return String.valueOf((Math.sqrt(p * (p - a) * (p - b) * (p - c))));
        }
    }

    private static double calculateCircleArea(double r, double pi) {
        return pi * r * r;

    }

    private static int calculateSquareArea(int x) {
        return x * x;

    }
}

