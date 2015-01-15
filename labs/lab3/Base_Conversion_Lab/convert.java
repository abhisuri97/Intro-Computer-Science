
/**
 * Base conversion revamped
 * 
 * @Abhinav Suri 
 * @Tuesday September 9th, 2014 11:35 PM v3.0
 */
import java.util.Scanner;

public class convert {
    public static void main(String args[])
    {
        //User Input here
        int newBase;
        int decimalNum;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Welcome to the Base Conversion program!\n");

        System.out.println("To start, please enter a decimal number. It must be an integer");
        while (true)
            try {
                decimalNum = Integer.parseInt(in.nextLine());
                break;
            } catch (NumberFormatException nfe) {
                System.out.print("Try again: ");
            }
        System.out.println("\nGood! Now enter in a base from 2 to 9. It must be an integer");
         while (true)
            try {
                newBase = Integer.parseInt(in.nextLine());
                break;
            } catch (NumberFormatException nfe) {
                System.out.print("Try again: ");
            }
        
        //Actual Processing of numbers here
        if(newBase >= 2 && newBase <=9) //If it is not between 2 and 9 skip down to else statement
        {
               double z=0.0; 
               /*
                   while loop magic to find what is the highest power of the base that
                   can fit inside of decimalNumber. Returns a value 1 higher than the actual power (e.g.
                   if decimalNumber=15 and newBase=2 then the value of z when the while loop is finished
                   is 4.0 instead of 3.0. this is corrected in the next part
               */
                    while ((int)decimalNum/(int)Math.pow((double)newBase,z) != 0)
                   {
                       z++;
                   }
               System.out.print(decimalNum + " = "); //self-explanatory
               int remainder = decimalNum;
                    for (double x= z-1; x >= 0; x=--x ) 
                    /*
                        The for loop: First of all we correct the z error from the whilel loop by setting x = z-1. Next the
                        boolean states that the for loop will continue as long as x is greater than or equal to zero. After
                        that the x=--x subtracts 1 from x and reruns the following (given that x is greater than or equal to
                        zero.
                    */
                    {
                        int y = (int)remainder/(int)Math.pow((double)newBase, x);
                        remainder= (int)remainder % (int)Math.pow((double)newBase, x);
                        System.out.print(y);
                    }
               System.out.print(" in base" + newBase); //self-explanatory
            }
        else //if your base was outside of the 2 to 9 range
        {
            System.out.print("Sorry! Your base must be between 2 and 9");
                    System.out.println("\nEnter in a base from 2 to 9. It must be an integer");
            while (true)
            try {
                newBase = Integer.parseInt(in.nextLine());
                break;
            } catch (NumberFormatException nfe) {
                System.out.print("Try again: ");
            }
        }
    }
}