import java.util.Scanner;
import java.util.InputMismatchException;

public class Utils {
    static int inputINT(String message) {
        try {
            System.out.print(message);
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Podano błędną wartość");
            return inputINT(message);
        }
    }
}
