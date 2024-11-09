import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę podaj swój dochód.");
        int income = scanner.nextInt();
        System.out.println("----------------------");
        double tax;
        double verge = 85258;
        double kStala = 14893.02;

        if (income < verge) {
            tax = income * 0.18 - 556.02;
        } else {
                tax = kStala + (income-verge)*0.32;
            }
        System.out.println("Podatek wynosi: " + (tax < 0 ? 0 : tax) + "zł");
    }
}
