
/**
 * Number Guesser
 * 
 * @Abhi Suri
 * @v1.0 
 */
import java.util.Scanner;
public class HiLo
{
    public static void playGame()
    {
        int num = (int) Math.ceil(Math.random()*100); //mathrandom function generates int from 1 to 100
        // System.out.println("Psst " + num);USE ONLY FOR DEV TO AVOID HAVING TO GUESS NUMBER FOR TESTING
        System.out.println("Put in a value in between 1 and 100. Enter \"101\" if you want to quit");
        
        Scanner inputScan = new Scanner(System.in); //scanner. prompt user to put in a guess
        int guess = inputScan.nextInt(); //input has to be integer
        int count = 0; //declare count variable to be 0. initial value
        
        while (guess != num) //cases for if the guess isn't the number
        {
            if(guess > num && guess != 101) //tests to see if its greater than number and NOT the sentinel value
            {
                System.out.println("Too high. Put in a new value."); 
                count++; //increment guess count up by 1
                guess = inputScan.nextInt(); //prompt again for guess
            }
            if(guess < num && guess != 101) //tests to see if guess is less than number and NOT sentinel value
            {
                System.out.println("Too low. Put in a new value.");
                count++; //decrement guess count down by 1
                guess = inputScan.nextInt(); //prompt again for guess
            }
            if(guess == 101) //if sentinel value

            {
                System.out.println("Thanks for playing"); 
                System.exit(0); //kill program.
            }
        }
        
        if (guess == num) //if guess is correct
        {
            System.out.println("you are correct");
            count++; //add to count
        }
        
        if (count == 1) 
        System.out.println("You guessed " + count + " time"); 
        if (count > 1) 
        System.out.println ("You guessed " + count + " times");
        
        System.out.println("Do you want to play again? Say \"Yes\" or \"No\""); //play again?
        
        Scanner continueScanner= new Scanner(System.in); //new scanner. user input
        String continueinput = continueScanner.nextLine();// True if user wants to play again.
        String lowcontinueinput = continueinput.toLowerCase(); //convert to lower case just in case user does not obey upper cases
        
        String a = "yes"; //declare string
        String b = "no"; //declare string
        System.out.println("\n"); //add spacing
        
        while (lowcontinueinput.length() >=0) // while loop: if the length of the string is greater than or equal to 0
        {
            if (lowcontinueinput.equals(a)) //if Yes
            {
                HiLo.playGame(); //kick back to the beginning of the program
            }
            else if (lowcontinueinput.equals(b)) //if No
            {
                System.out.println("Thanks for playing");
                System.exit(0); //end program
            }
            
            else //if neither
            {
                System.out.println("I didn't seem to get a response. Try again");
                continueinput = continueScanner.nextLine(); //declare scanner again
                lowcontinueinput = continueinput.toLowerCase(); //make lowercase
                System.out.println("\n"); //add spacing
            }
        }

    }
}
