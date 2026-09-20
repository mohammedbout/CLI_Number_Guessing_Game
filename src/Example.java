import java.util.InputMismatchException;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean start = false;
        int number = 0;
        do {

            try {
                System.out.println("Enter a number:");
                number = scanner.nextInt();



            } catch (InputMismatchException e) {
                System.out.println("Please input a number");
               
               
                scanner.next();
            }



        } while (number != 4);
    }
}
