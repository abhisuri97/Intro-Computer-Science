
/**
 * Parses Number to find out how many odd,even, and 0 ints are in it
 * 
 * @Abhinav Suri
 * @v1.0 10/2/14
 */
import java.util.Scanner; //import Scanner
import java.lang.Character; //import Character

public class NumberCounter { 
    public static void main(String[] args){ 
        Scanner scan = new Scanner(System.in); 
        
        //Prompt user 
        System.out.print("Enter a an integer value: "); 
        String input = scan.nextLine(); 
        
        //initial value of number of each type
        int numOfOdd = 0; 
        int numOfEven = 0; 
        int numOfZero = 0; 
        /* 
         * What follows is a for loop:
         * set an integer "i" to zero (initialization)
         * boolean, do the loop while i is less than the input length
         * update: add 1 to i
         */
        for(int i = 0; i < input.length(); i++){ 
            char c = input.charAt(i); //get the character at position i
            int num = Integer.parseInt(Character.toString(c)); //convert that character to an integer
            if(num == 0) 
                numOfZero++; //if the number is 0, increment numOfZero
            else if(num%2 == 0) 
                numOfEven++; //if the number if even, increment numOfEven
            else 
                numOfOdd++; //else case (odd), increment numOfOdd
        } 
        
        //Print results 
        System.out.println("Number of odd: " + numOfOdd); 
        System.out.println("Number of even: " + numOfEven); 
        System.out.println("Number of zero: " + numOfZero); 
    } 
} 
