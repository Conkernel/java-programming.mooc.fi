
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a string:");
        String value = String.valueOf(scan.nextLine());

        System.out.println("Give an integer:");
        Integer value1 = Integer.valueOf(scan.nextLine());

        System.out.println("Give a double:");
        Double value2 = Double.valueOf(scan.nextLine());

        System.out.println("Give a boolean:");
        Boolean value3 = Boolean.valueOf(scan.nextLine());

        System.out.println("You gave the string " + value);
        System.out.println("You gave the integer " + value1);
        System.out.println("You gave the double " + value2);
        System.out.println("You gave the boolean " + value3);

    }
}
