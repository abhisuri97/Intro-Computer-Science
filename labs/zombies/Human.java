
/**
 * Write a description of class Human here.
 * 
 * @author Maritza Muguira 
 * @version 3/5/2015
 */

public class Human
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class Human
     */
    public Human()
    {

    }

    /**
     * Main method to start the search for the password
     * 
     * @param  
     * @return      
     */
    public int searchLabCode(CDC cdc)
    {
        int[] psswrdSearch = new int[cdc.CODELENGTH];//instantiate size of psswrdSearch
        int count = 0; //init count
        int max = cdc.CODELENGTH; //for easy reference
        do{
            do{
                for(int i = 0; i < max; i++) {
                    psswrdSearch[i]=(int)(Math.random()*5); //generate random number
                }
            } while(validityCheck(psswrdSearch) == false); //check if it is valid
            String num = toString2(psswrdSearch); //printout valid result
            System.out.print(num); 
            if(cdc.testPassword(psswrdSearch)==true) //check if matches the string
                System.out.print(" = false\n"); //if false, add '=false' to string
            else
                System.out.print(" = true\n"); //if true, add '=true' to string
            count++; //increment count
        } while(cdc.testPassword(psswrdSearch)==true); //do while the result != the code
        System.out.println("The lab code is: " + toString2(psswrdSearch)); //print out final code
        return count; //return the final count
        //check integer for params
        //check against the checker
        
    }
    public String toString2(int[] array) { //convert array to string
        String k = "";
        for(int i = 0; i < array.length; i++) {
            k += String.valueOf(array[i]);
        }
        return k;
    }
    public boolean validityCheck(int[] array) 
    {
        boolean confirmed = true; //set confirmed to true
        for (int i = 0; i < array.length; i++) {
            for(int j = i + 1; j < array.length; j++) {
                if(array[i]==array[j]) { //go thru all elements of the array and check for similars
                    confirmed=false;
                }
            }
        }
        return confirmed;
    }
}
