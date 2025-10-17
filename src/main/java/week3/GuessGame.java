
import java.util.Scanner;
import java.util.Random;

class GuessGame {
public static void main(String[] args) {
int secretNumber, input, totalGuesses;
int totalGames = 0;
Scanner sc = new Scanner(System.in);
Random rand = new Random();

System.out.println("Welcome to the Guessing Game!");  
    System.out.println("Try to guess the secret number between 1 and 100.");  

    int winStatus = 0;  

    while (winStatus == 0) {  
        totalGames++;  
        secretNumber = rand.nextInt(100) + 1;  
        totalGuesses = 0;  

        System.out.println("\nGame " + totalGames + " begins!");  

        while (totalGuesses < 10) {  
            System.out.print("Attempt " + (totalGuesses + 1) + ": Enter your guess: ");  
            input = sc.nextInt();  
            totalGuesses++;  

            if (input < secretNumber) {  
                System.out.println("Your number is lesser.");  
            } else if (input > secretNumber) {  
                System.out.println("Your number is greater.");  
            } else {  
                System.out.println("Your guess is correct!");  
                winStatus = 1;  
                break;  
            }  
        }  

        if (winStatus == 0) {  
            System.out.println("Sorry, you didn’t guess correctly in 10 tries. Starting a new game...");  
        }  
    }  

    System.out.println("\nCongratulations! You won after " + totalGames + " game(s).");  
    sc.close();  
}

}

