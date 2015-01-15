/**
 * Created by Abhi on 1/8/15.
 */
import java.util.*;

public class histogram
{
    public static void main (String[] args)
    {
        int[] range = new int [10]; //initialize array [0,0,0,0,0,0,0,0,0,0]
        int rangeCounter; //initialize rangeCounter
        Scanner scan = new Scanner (System.in); //Scanner Object
        System.out.println ("Enter some numbers between 0 and 100. See the histogram by entering a number out of the range 0 to 100.");

        int input = scan.nextInt (); //store input in input variable
        while (input >= 1 && input <= 100) //only input with 1-100 accepted
        {
            rangeCounter = (input - 1) / 10; //gets 10s place of input. -1 there for cases (e.g. 10 and 11)
            range[rangeCounter] ++; //go to index of rangeCounter in the array range.
            input = scan.nextInt ();

        }

        // print histogram
        for (int counter = 0; counter < 10; counter++) //for loop
        {
            System.out.print ((10 * counter + 1) + "-"); //print out lower limit of range
            System.out.print ((10 * counter + 10) + "\t|"); //print out upper limit of range
            for (int count = 0; count < range[counter]; count++) //for loop for stars
                System.out.print ("*"); //print out amount of stars equal to value of at range[rangeCounter]
            System.out.println ();//next line
        }

    }
}
