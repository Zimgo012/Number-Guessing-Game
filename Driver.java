import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {


        //This will store value from User
        int userInput;
        //This will store random value from the computer an
        int computerInput = 1 + (int)(Math.random() * 10);

        //This will store some answer from the user.
       String userAnswer;

       //Scanner Object
        Scanner scan = new Scanner(System.in);


do {

        System.out.println("Guess a Number");
        System.out.println("Pick a number from 1 - 10:");

        //storing input from user for the number
        userInput = scan.nextInt();

        scan.nextLine();

        //Condition for the game
        if (computerInput > userInput){
            System.out.println("Computer has greater number!");
        }
        else if (computerInput < userInput){
            System.out.println("Computer has lesser number!");
        } else {
            System.out.println("Congrats, you guess it!");
        }
        System.out.println("Wanna try again?");

       userAnswer = scan.nextLine();

    } while (userAnswer.equalsIgnoreCase("yes"));

    }
}
