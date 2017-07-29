public class Calculator implements ICalculations {

    private String name;
    private int yearOfProduction;
    private String author;

    public Calculator(String name, int yearOfProduction, String author) {
        this.name = name;
        this.yearOfProduction = yearOfProduction;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public double sum(int a, int b) {
        return a + b;
    }

    @Override
    public double substract(int a, int b) {
        return a - b;
    }

    @Override
    public double multiply(int a, int b) {
        return a * b;
    }

    @Override
    public double divide(int a, int b) {
        return a / b;
    }

    @Override
    public double power(int a, int b) {
        return Math.pow(a, b);
    }

    @Override
    public double root(int a) {
        return Math.sqrt(a);
    }

    @Override
    public double angleToRadian(int a) {
        return Math.toRadians(a);
    }

    @Override
    public double sinus(int a) {
        return Math.sin(a);
    }

    @Override
    public double cosinus(int a) {
        return Math.cos(a);
    }

    @Override
    public double tangens(int a) {
        return Math.tan(a);
    }

    @Override
    public double arcsinus(double a) {
        return Math.asin(a);
    }

    @Override
    public double arccosinus(double a) {
        return Math.acos(a);
    }

    @Override
    public double arctangens(double a) {
        return Math.atan(a);
    }

    @Override
    public double factorial(int a) {
        int wynik = 1;
        for (int i = 1; i <= a; i++) {
            wynik *= i;
        }
        return wynik;
    }

    @Override
    public int modulo(int a, int b) {
        return a % b;
    }

    @Override
    public int sumDigits(int a) {
        int result = 0;
        while (a != 0) {
            result += a % 10;
            a /= 10;
        }
        return result;
    }

    @Override
    public int sumFromAtoB(int a, int b) {
        int result = 0;
        System.out.println(a + ", " + b);
        if (a == b) return 0;
        if (a > b) {
            for (int i = a; i >= b; i--)
                result += i;
            return result;

        } else {
            for (int i = b; i <= a; i++)
                result += i;
//                Syreturnstem.out.println(result);
            return result;
        }
    }
}
