public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println();

        //Площадь квадрата
        int x = 5;
        System.out.println("Площадь квадрата со стороной " + x + " = " + calculateSquareArea(x));
        System.out.println();

        //Площадь круга
        double r = 10;
        System.out.println("Площадь круга с радиусом " + r + " = " + calculateCircleArea(r));
        System.out.println();

        //Площадь треугольника
        double a = 2;
        double b = 3;
        double c = 5;
        if (calculateЕriangleArea(a, b, c) != null){
            System.out.println("Площадь треугольника с произовльными сторонами " + a + "," + b + "," + c + " = " + calculateЕriangleArea(a, b, c));
        }
        System.out.println();

    }

    private static Double calculateЕriangleArea(double a, double b, double c) {
        if ((a + b <= c) || (a + c <= b) || (b + c <= a)) {
            System.out.println( "Это не может быть треугольником");
            return null;
        } else {
            double p = (a + b + c) / 2;
            return (Math.sqrt(p * (p - a) * (p - b) * (p - c)));
        }
    }

    private static double calculateCircleArea(double r) {
        return Math.PI * r * r;

    }

    private static int calculateSquareArea(int x) {
        return x * x;

    }
}

