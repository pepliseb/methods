import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner scanner;
    private static List<Double> memory;

    public static void main(String[] args) {

        scanner = new Scanner(System.in);
        memory = new ArrayList<>();
        System.out.println("Witaj w kalkulatorze!");
        int choice;

        do {
            printMenu();
            choice = Integer.parseInt(scanner.nextLine());
            parseChoice(choice);

        } while (choice != 18);
    }

    private static void printMenu() {
        System.out.println("-------------------------");
        System.out.println("Wpisz: ");
        System.out.println("1 - jeżeli chcesz dodawać;");
        System.out.println("2 - jeżeli chcesz odejmować; ");
        System.out.println("3 - jeżeli chcesz mnożyć; ");
        System.out.println("4 - jeżeli chcesz dzielić; ");
        System.out.println("5 - jeżeli chcesz potęgować; ");
        System.out.println("6 - jeżeli chcesz obliczyć pierwiastek; ");
        System.out.println("7 - jeżeli chcesz zamienić kąty na radiany; ");
        System.out.println("8 - jeżeli chcesz obliczyć sinus kąta; ");
        System.out.println("9 - jeżeli chcesz obliczyć cosinus kąta; ");
        System.out.println("10 - jeżeli chcesz obliczyć tangens kąta; ");
        System.out.println("11 - jeżeli chcesz obliczyć kąt dla danego sinusa; ");
        System.out.println("12 - jeżeli chcesz obliczyć kąt dla danego cosinusa; ");
        System.out.println("13 - jeżeli chcesz obliczyć kąt dla danego tangensa; ");
        System.out.println("14 - jeżeli chcesz obliczyć silnię; ");
        System.out.println("15 - jeżeli chcesz obliczyć resztę z dzielenia; ");
        System.out.println("16 - jeżeli chcesz obliczyć sumę cyfr danej liczby; ");
        System.out.println("17 - jeżeli chcesz obliczyć sumę liczb od A do B; ");
        System.out.println("18 - aby zakończyć działanie kalkulatora; ");
        System.out.print("Twój wybór to: ");
    }

    private static void parseChoice(int choice) {
        Calculator calculator = new Calculator("Kalkulator prosty", 2017, "Paweł Przystarz");
        int secondChoice;

        switch (choice) {
            case 1: {
                System.out.print("Podaj pierwszą liczbę: ");
                int a = Integer.parseInt(scanner.nextLine());
                System.out.print("Podaj drugą liczbę: ");
                int b = Integer.parseInt(scanner.nextLine());
                double result = calculator.sum(a, b);
                System.out.println("Wynikiem dodawania jest: " + calculator.sum(a, b));
                do {
                    printSecondMenu();
                    secondChoice = Integer.parseInt(scanner.nextLine());
                    switch (secondChoice) {
                        case 1: {
                            memory.add(result);
                        }
                        break;
                        case 2: {
                            System.out.println(memory);
                        }
                        break;
                        case 3: {
                            System.out.println("Który obiekt z kolei usunąć? ");
                            int c = Integer.parseInt(scanner.nextLine())-1;
                            memory.remove(c);
                        }
                        break;
                        default:
                            System.out.println("Nie znam takiej komendy!");
                    }
                } while (secondChoice == 1 || secondChoice == 2 || secondChoice == 3);
            }
            break;
            case 2: {
                System.out.print("Podaj pierwszą liczbę: ");
                int a = Integer.parseInt(scanner.nextLine());
                System.out.print("Podaj drugą liczbę: ");
                int b = Integer.parseInt(scanner.nextLine());
                double result = calculator.substract(a, b);
                System.out.println("Wynikiem odejmowania jest: " + calculator.substract(a, b));
                do {
                    printSecondMenu();
                    secondChoice = Integer.parseInt(scanner.nextLine());
                    switch (secondChoice) {
                        case 1: {
                            memory.add(result);
                        }
                        break;
                        case 2: {
                            System.out.println(memory);
                        }
                        break;
                        case 3: {
                            System.out.println("Który obiekt z kolei usunąć? ");
                            int c = Integer.parseInt(scanner.nextLine())-1;
                            memory.remove(c);
                        }
                        break;
                        default:
                            System.out.println("Nie znam takiej komendy!");
                    }
                } while (secondChoice == 1 || secondChoice == 2 || secondChoice == 3);
            }
            break;
            case 3: {
                System.out.print("Podaj pierwszą liczbę: ");
                int a = Integer.parseInt(scanner.nextLine());
                System.out.print("Podaj drugą liczbę: ");
                int b = Integer.parseInt(scanner.nextLine());
                double result = calculator.multiply(a, b);
                System.out.println("Wynikiem mnożenia jest: " + calculator.multiply(a, b));
                do {
                    printSecondMenu();
                    secondChoice = Integer.parseInt(scanner.nextLine());
                    switch (secondChoice) {
                        case 1: {
                            memory.add(result);
                        }
                        break;
                        case 2: {
                            System.out.println(memory);
                        }
                        break;
                        case 3: {
                            System.out.println("Który obiekt z kolei usunąć? ");
                            int c = Integer.parseInt(scanner.nextLine())-1;
                            memory.remove(c);
                        }
                        break;
                        default:
                            System.out.println("Nie znam takiej komendy!");
                    }
                } while (secondChoice == 1 || secondChoice == 2 || secondChoice == 3);
            }
            break;
            case 4: {
                System.out.print("Podaj pierwszą liczbę: ");
                int a = Integer.parseInt(scanner.nextLine());
                System.out.print("Podaj drugą liczbę: ");
                int b = Integer.parseInt(scanner.nextLine());
                double result = calculator.divide(a, b);
                if (b == 0) System.out.println("Nie dzielimy przez zero!");
                else System.out.println("Wynikiem dzielenia jest: " + calculator.divide(a, b));
                do {
                    printSecondMenu();
                    secondChoice = Integer.parseInt(scanner.nextLine());
                    switch (secondChoice) {
                        case 1: {
                            memory.add(result);
                        }
                        break;
                        case 2: {
                            System.out.println(memory);
                        }
                        break;
                        case 3: {
                            System.out.println("Który obiekt z kolei usunąć? ");
                            int c = Integer.parseInt(scanner.nextLine())-1;
                            memory.remove(c);
                        }
                        break;
                        default:
                            System.out.println("Nie znam takiej komendy!");
                    }
                } while (secondChoice == 1 || secondChoice == 2 || secondChoice == 3);
            }
            break;
            case 5: {
                System.out.print("Podaj pierwszą liczbę: ");
                int a = Integer.parseInt(scanner.nextLine());
                System.out.print("Podaj drugą liczbę: ");
                int b = Integer.parseInt(scanner.nextLine());
                double result = calculator.power(a, b);
                System.out.println("Wynikiem potęgowania jest: " + calculator.power(a, b));
                do {
                    printSecondMenu();
                    secondChoice = Integer.parseInt(scanner.nextLine());
                    switch (secondChoice) {
                        case 1: {
                            memory.add(result);
                        }
                        break;
                        case 2: {
                            System.out.println(memory);
                        }
                        break;
                        case 3: {
                            System.out.println("Który obiekt z kolei usunąć? ");
                            int c = Integer.parseInt(scanner.nextLine())-1;
                            memory.remove(c);
                        }
                        break;
                        default:
                            System.out.println("Nie znam takiej komendy!");
                    }
                } while (secondChoice == 1 || secondChoice == 2 || secondChoice == 3);
            }
            break;
            case 6: {
                System.out.print("Podaj liczbę, którą chcesz spierwiastkować: ");
                int a = Integer.parseInt(scanner.nextLine());
                double result = calculator.root(a);
                if (a < 0) System.out.println("Nie da się spierwiastkować ujemnej liczby!");
                else System.out.println("Pierwiastkiem liczby " + a + " jest: " + calculator.root(a));
                do {
                    printSecondMenu();
                    secondChoice = Integer.parseInt(scanner.nextLine());
                    switch (secondChoice) {
                        case 1: {
                            memory.add(result);
                        }
                        break;
                        case 2: {
                            System.out.println(memory);
                        }
                        break;
                        case 3: {
                            System.out.println("Który obiekt z kolei usunąć? ");
                            int c = Integer.parseInt(scanner.nextLine())-1;
                            memory.remove(c);
                        }
                        break;
                        default:
                            System.out.println("Nie znam takiej komendy!");
                    }
                } while (secondChoice == 1 || secondChoice == 2 || secondChoice == 3);
            }
            break;
            case 7: {
                System.out.print("Podaj wartość kąta w stopniach, aby przeliczyć go na radiany: ");
                int a = Integer.parseInt(scanner.nextLine());
                double result = calculator.angleToRadian(a);
                System.out.println("Kąt " + a + " w radianach to: " + calculator.angleToRadian(a));
                do {
                    printSecondMenu();
                    secondChoice = Integer.parseInt(scanner.nextLine());
                    switch (secondChoice) {
                        case 1: {
                            memory.add(result);
                        }
                        break;
                        case 2: {
                            System.out.println(memory);
                        }
                        break;
                        case 3: {
                            System.out.println("Który obiekt z kolei usunąć? ");
                            int c = Integer.parseInt(scanner.nextLine())-1;
                            memory.remove(c);
                        }
                        break;
                        default:
                            System.out.println("Nie znam takiej komendy!");
                    }
                } while (secondChoice == 1 || secondChoice == 2 || secondChoice == 3);
            }
            break;
            case 8: {
                System.out.print("Podaj wartość kąta, aby obliczyć jego sinus: ");
                int a = Integer.parseInt(scanner.nextLine());
                double result = calculator.sinus(a);
                System.out.println("Sinus kąta " + a + " to: " + calculator.sinus(a));
                do {
                    printSecondMenu();
                    secondChoice = Integer.parseInt(scanner.nextLine());
                    switch (secondChoice) {
                        case 1: {
                            memory.add(result);
                        }
                        break;
                        case 2: {
                            System.out.println(memory);
                        }
                        break;
                        case 3: {
                            System.out.println("Który obiekt z kolei usunąć? ");
                            int c = Integer.parseInt(scanner.nextLine())-1;
                            memory.remove(c);
                        }
                        break;
                        default:
                            System.out.println("Nie znam takiej komendy!");
                    }
                } while (secondChoice == 1 || secondChoice == 2 || secondChoice == 3);
            }
            break;
            case 9: {
                System.out.print("Podaj wartość kąta, aby obliczyć jego cosinus: ");
                int a = Integer.parseInt(scanner.nextLine());
                double result = calculator.cosinus(a);
                System.out.println("Cosinus kąta " + a + " to: " + calculator.cosinus(a));
                do {
                    printSecondMenu();
                    secondChoice = Integer.parseInt(scanner.nextLine());
                    switch (secondChoice) {
                        case 1: {
                            memory.add(result);
                        }
                        break;
                        case 2: {
                            System.out.println(memory);
                        }
                        break;
                        case 3: {
                            System.out.println("Który obiekt z kolei usunąć? ");
                            int c = Integer.parseInt(scanner.nextLine())-1;
                            memory.remove(c);
                        }
                        break;
                        default:
                            System.out.println("Nie znam takiej komendy!");
                    }
                } while (secondChoice == 1 || secondChoice == 2 || secondChoice == 3);
            }
            break;
            case 10: {
                System.out.print("Podaj wartość kąta, aby obliczyć jego tangens: ");
                int a = Integer.parseInt(scanner.nextLine());
                double result = calculator.tangens(a);
                System.out.println("Tangens kąta " + a + " to: " + calculator.tangens(a));
                do {
                    printSecondMenu();
                    secondChoice = Integer.parseInt(scanner.nextLine());
                    switch (secondChoice) {
                        case 1: {
                            memory.add(result);
                        }
                        break;
                        case 2: {
                            System.out.println(memory);
                        }
                        break;
                        case 3: {
                            System.out.println("Który obiekt z kolei usunąć? ");
                            int c = Integer.parseInt(scanner.nextLine())-1;
                            memory.remove(c);
                        }
                        break;
                        default:
                            System.out.println("Nie znam takiej komendy!");
                    }
                } while (secondChoice == 1 || secondChoice == 2 || secondChoice == 3);
            }
            break;
            case 11: {
                System.out.print("Podaj wartość sinusa, aby obliczyć jego kąt: ");
                double a = Double.parseDouble(scanner.nextLine());
                double result = calculator.arcsinus(a);
                System.out.println("Wartość kąta dla sinusa równego " + a + " to: " + calculator.arcsinus(a) + " radianów");
                do {
                    printSecondMenu();
                    secondChoice = Integer.parseInt(scanner.nextLine());
                    switch (secondChoice) {
                        case 1: {
                            memory.add(result);
                        }
                        break;
                        case 2: {
                            System.out.println(memory);
                        }
                        break;
                        case 3: {
                            System.out.println("Który obiekt z kolei usunąć? ");
                            int c = Integer.parseInt(scanner.nextLine())-1;
                            memory.remove(c);
                        }
                        break;
                        default:
                            System.out.println("Nie znam takiej komendy!");
                    }
                } while (secondChoice == 1 || secondChoice == 2 || secondChoice == 3);
            }
            break;
            case 12: {
                System.out.print("Podaj wartość cosinusa, aby obliczyć jego kąt: ");
                double a = Double.parseDouble(scanner.nextLine());
                double result = calculator.arccosinus(a);
                System.out.println("Wartość kąta dla cosinusa równego " + a + " to: " + calculator.arccosinus(a) + " radianów");
                do {
                    printSecondMenu();
                    secondChoice = Integer.parseInt(scanner.nextLine());
                    switch (secondChoice) {
                        case 1: {
                            memory.add(result);
                        }
                        break;
                        case 2: {
                            System.out.println(memory);
                        }
                        break;
                        case 3: {
                            System.out.println("Który obiekt z kolei usunąć? ");
                            int c = Integer.parseInt(scanner.nextLine())-1;
                            memory.remove(c);
                        }
                        break;
                        default:
                            System.out.println("Nie znam takiej komendy!");
                    }
                } while (secondChoice == 1 || secondChoice == 2 || secondChoice == 3);
            }
            break;
            case 13: {
                System.out.print("Podaj wartość tangensa, aby obliczyć jego kąt: ");
                double a = Double.parseDouble(scanner.nextLine());
                double result = calculator.arctangens(a);
                System.out.println("Wartość kąta dla tangensa równego " + a + " to: " + calculator.arctangens(a) + " radianów");
                do {
                    printSecondMenu();
                    secondChoice = Integer.parseInt(scanner.nextLine());
                    switch (secondChoice) {
                        case 1: {
                            memory.add(result);
                        }
                        break;
                        case 2: {
                            System.out.println(memory);
                        }
                        break;
                        case 3: {
                            System.out.println("Który obiekt z kolei usunąć? ");
                            int c = Integer.parseInt(scanner.nextLine())-1;
                            memory.remove(c);
                        }
                        break;
                        default:
                            System.out.println("Nie znam takiej komendy!");
                    }
                } while (secondChoice == 1 || secondChoice == 2 || secondChoice == 3);
            }
            break;
            case 14: {
                System.out.print("Podaj wartość, dla której obliczyć jej silnię: ");
                int a = Integer.parseInt(scanner.nextLine());
                double result = calculator.factorial(a);
                System.out.println("Silnie liczby " + a + " to: " + calculator.factorial(a));
                do {
                    printSecondMenu();
                    secondChoice = Integer.parseInt(scanner.nextLine());
                    switch (secondChoice) {
                        case 1: {
                            memory.add(result);
                        }
                        break;
                        case 2: {
                            System.out.println(memory);
                        }
                        break;
                        case 3: {
                            System.out.println("Który obiekt z kolei usunąć? ");
                            int c = Integer.parseInt(scanner.nextLine())-1;
                            memory.remove(c);
                        }
                        break;
                        default:
                            System.out.println("Nie znam takiej komendy!");
                    }
                } while (secondChoice == 1 || secondChoice == 2 || secondChoice == 3);
            }
            break;
            case 15: {
                System.out.print("Podaj pierwszą liczbę: ");
                int a = Integer.parseInt(scanner.nextLine());
                System.out.print("Podaj drugą liczbę: ");
                int b = Integer.parseInt(scanner.nextLine());
                double result = calculator.modulo(a, b);
                if (b == 0) System.out.println("Nie dzielimy przez 0!");
                else System.out.println("Reszta z dzielenia liczby " + a + " przez " + b + " jest równa: " + calculator.modulo(a, b));
                do {
                    printSecondMenu();
                    secondChoice = Integer.parseInt(scanner.nextLine());
                    switch (secondChoice) {
                        case 1: {
                            memory.add(result);
                        }
                        break;
                        case 2: {
                            System.out.println(memory);
                        }
                        break;
                        case 3: {
                            System.out.println("Który obiekt z kolei usunąć? ");
                            int c = Integer.parseInt(scanner.nextLine())-1;
                            memory.remove(c);
                        }
                        break;
                        default:
                            System.out.println("Nie znam takiej komendy!");
                    }
                } while (secondChoice == 1 || secondChoice == 2 || secondChoice == 3);
            }
            break;
            case 16: {
                System.out.print("Podaj liczbę, dla której chcesz policzyc jej sumę cyfr: ");
                int a = Integer.parseInt(scanner.nextLine());
                double result = calculator.sumDigits(a);
                System.out.println("Suma cyfr liczby " + a + " to: " + calculator.sumDigits(a));
                do {
                    printSecondMenu();
                    secondChoice = Integer.parseInt(scanner.nextLine());
                    switch (secondChoice) {
                        case 1: {
                            memory.add(result);
                        }
                        break;
                        case 2: {
                            System.out.println(memory);
                        }
                        break;
                        case 3: {
                            System.out.println("Który obiekt z kolei usunąć? ");
                            int c = Integer.parseInt(scanner.nextLine())-1;
                            memory.remove(c);
                        }
                        break;
                        default:
                            System.out.println("Nie znam takiej komendy!");
                    }
                } while (secondChoice == 1 || secondChoice == 2 || secondChoice == 3);
            }
            break;
            case 17: {
                System.out.print("Podaj pierwszą liczbę: ");
                int a = Integer.parseInt(scanner.nextLine());
                System.out.print("Podaj drugą liczbę: ");
                int b = Integer.parseInt(scanner.nextLine());
                double result = calculator.sumFromAtoB(a, b);
                System.out.println("Suma liczb od " + a + " do " + b + " to: " + calculator.sumFromAtoB(a, b));
                do {
                    printSecondMenu();
                    secondChoice = Integer.parseInt(scanner.nextLine());
                    switch (secondChoice) {
                        case 1: {
                            memory.add(result);
                        }
                        break;
                        case 2: {
                            System.out.println(memory);
                        }
                        break;
                        case 3: {
                            System.out.println("Który obiekt z kolei usunąć? ");
                            int c = Integer.parseInt(scanner.nextLine())-1;
                            memory.remove(c);
                        }
                        break;
                        default:
                            System.out.println("Nie znam takiej komendy!");
                    }
                } while (secondChoice == 1 || secondChoice == 2 || secondChoice == 3);
            }
            break;
            case 18: {
                System.out.println("Dziękuje za korzystanie z mojego kalkulatora :)");
                System.out.println(calculator.getName() + ", produkcja " + calculator.getYearOfProduction() + " rok.\nAutor: " + calculator.getAuthor());
            }
            break;
            default:
                System.out.println("Nie znam takiej komendy, proszę podaj poprawną liczbę!");
        }
    }

    private static void printSecondMenu() {
        System.out.println("Czy chcesz: ");
        System.out.println("1 - dodać liczbę do pamięci kalkulatora; ");
        System.out.println("2 - wyświetlić listę liczb w pamięci kalkulatora; ");
        System.out.println("3 - usunąć liczbę z pamięci kalkulatora; ");
        System.out.println("Inna liczba - powrót do kalkulatora; ");
    }
}
