package metods;

public class Metods {
    public static void main(String[] args) {
        Metods me = new Metods();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj liczbe a: ");
//        int a = scanner.nextInt();
//        System.out.println("Podaj liczbe b: ");
//        int b = scanner.nextInt();
//        me.addInt(a,b);
//        System.out.println(me.addInt(a,b));

    }


    public Metods() {
//        Konstruktor klasy Metods
//        Prezentacja "cwiczenia Metody
//        zrealizwoane zadania: 1
        System.out.println(addInt(2, 2));
        System.out.println((int) substract(2, 2));
        System.out.println(isPit(1, 2, 2));
        System.out.println(sumInt(12340));
        System.out.println(sqrInt(16));
        System.out.println(potegaInt(2,4L));
    }


    private int addInt(int a, int b) {
        return a + b;
    }

    private double substract(double a, double b) {
        return a - b;
    }

    private boolean isPit(int a, int b, double c) {
        if ((a * a + b * b) == (c * c)) {
            return true;
        } else {
            return false;
        }
    }

    private int sumInt(int a) {
        int result = 0;
        while (a != 0) {
            result += a % 10;
           a /= 10;
        }
        return result;
    }

    private boolean sqrInt (int as ){
        if (a==1) return true;
        for(int i=2;i<=a;i++)
       if( Math.pow(i,2)  == a)  return true;
       return false;
    }

    private double potegaInt(int a, Long n){
        return Math.pow(a,n);
    }
}










