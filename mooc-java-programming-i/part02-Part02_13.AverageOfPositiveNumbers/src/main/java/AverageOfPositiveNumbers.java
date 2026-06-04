
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double aver = 0;
        int sum = 0;
        int count = 0;

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (count == 0 && number == 0) {
                System.out.println("Cannot calculate the average");
                break;
            } else if (count != 0) {
                if (number > 0) {
                    count ++;
                    sum = sum + number;
                    aver = sum / count;
                } else if (number == 0) {
                    System.out.println(aver);
                    break;
                }
            }
        }
    }
}
