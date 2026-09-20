import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean start = false;
        int choice = 0;
        int[] chances = {10, 5, 3};

        System.out.println("Welcome to the guessing game! ");
        System.out.println("Can you guess the correct number between 1 and 100?");
        System.out.println("Let's find out!");

        do {

            System.out.println("Choose a difficulty:");
            System.out.println("1.Easy (10 chances)");
            System.out.println("2.Medium (5 chances)");
            System.out.println("3.Hard (3 chances)");
            System.out.print("->");

            try {

                choice = scanner.nextInt();

                if (choice < 1 || choice > 3) {
                    System.out.println("Please input either 1 or 2 or 3 to choose the difficulty");

                } else {
                    System.out.println("I'm Thinking of an integer between 1 and 100:");

                    Random random = new Random();
                    int randomNumber = random.nextInt(1, 100);

                    int attempts = 0;
                    
                    for (int i = 0; i < chances[choice - 1]; i++) {

                        System.out.print("->");
                        int userGuess = scanner.nextInt();

                        if (userGuess > 100 || userGuess < 1) {
                            System.out.println("You should input a number between 1 and 100 !");
                            chances[choice - 1]++;
                        } else {
                            if (userGuess < randomNumber) {
                                System.out.println("The number is greater than " + userGuess);
                                attempts++;
                            } else if (userGuess > randomNumber) {
                                System.out.println("The number is less than " + userGuess);
                                attempts++;
                            }
                        }


                    }
                }



            } catch (InputMismatchException e) {
                System.out.println("Error! You need to input an integer");
                start = true;
                scanner.next();
            }

        } while (start) ;

    }
}