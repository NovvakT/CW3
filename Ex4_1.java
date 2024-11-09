import java.util.InputMismatchException;
import java.util.Scanner;

//public class Ex4_1 {
//    public static void main(String[] args) {
//
//        System.out.println("Cześć, jestem kalkulatorem obsługującym dodawanie, odejmowanie, mnożenie, dzielenie");
//
//        int a = Utils.inputINT("Proszę podaj pierwszą liczbę: ");
//        String sign = inputString("Proszę podaj znak operacji (+, -, *, /): ");
//        int b = Utils.inputINT("Proszę podaj drugą liczbę: ");
//
//        float result = 0;
//            switch (sign) {
//                case "+":
//                    result = a + b;
//                    break;
//                case "-":
//                    result = a - b;
//                    break;
//                case "*":
//                    result = a * b;
//                    break;
//                case "/":
//                    result = a / b;
//                    break;
//                default:
//                    System.out.println("Błędny znak operacji matematycznej");
//            }
//        }
//
//        System.out.println("Wynik to: " + result);
//    }
//    static int inputINT(String message) {
//        try {
//            System.out.print(message);
//            Scanner scanner = new Scanner(System.in);
//            return scanner.nextInt();
//        } catch (InputMismatchException e) {
//            System.out.println("Podano błędną wartość");
//            return inputINT(message);
//        }
//    }
//    static String inputString(String message) {
//        try {
//            System.out.print(message);
//            Scanner scanner1 = new Scanner(System.in);
//            return scanner1.next();
//        } catch (InputMismatchException e) {
//            System.out.println("Podano błędną wartość");
//            return inputString(message);
//        }
//    }
//}
//// dokończyc warunke z dzieleniem przez 0 i dodać default dot. błędnej operacji
