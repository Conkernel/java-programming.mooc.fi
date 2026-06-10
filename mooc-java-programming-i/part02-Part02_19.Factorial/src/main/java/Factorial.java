
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number: ");
        int number = Integer.valueOf(scanner.nextLine());
        int fact = 1;
        for (int i=number; i>0; i--) {
            fact*=i;
        }
        System.out.println("Factorial: " + fact);
    }
}
