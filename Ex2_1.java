import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex2_1 {
    public static void main(String[] args) {

        int number = input("Podaj liczbę: ");
        System.out.println(number);

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę: ");

        int a = input("Podaj pierwszą liczbę: ");
        int b = input("Podaj drugą liczbę: ");
        int c = input("Podaj trzecią liczbę: ");

        int min = 0;
        int max = 0;

        if (a > b && a > c) {
            max = a;
        } else if (a < b && a < c) {
            min = a;
        }
        if (b > a && b > c) {
            max = b;
        } else if (b < a && b < c) {
            min = b;
        }
        if (c > a && c > b) {
            max = c;
        } else if (c < a && c < b) {
            max = c;
        }
        System.out.println("Największa liczba to: " + max);
        System.out.println("Najmniejsza liczba to: " + min);

    }

    static int input(String message) {
        try {
            System.out.print(message);
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Podano błędną wartość");
            return input(message);
        }
    }
}