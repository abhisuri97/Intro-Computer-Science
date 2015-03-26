
/**
 * Write a description of class CDC here.
 * 
 * @author Maritza Muguira 
 * @version 3/4/2015
 */
import java.util.*;
public class CDC
{
    // instance variables - replace the example below with your own
    public int CODELENGTH = 5;
    private int[] labCode = new int[CODELENGTH];
    private int[] buildingCode = new int[CODELENGTH];
    
    /**
     * Constructor for objects of class War
     */
    public CDC()
    {
        // initialise instance variables
        
        for(int i = 0; i < CODELENGTH; i++)
        {
            boolean found = true;
            while(found)
            {
                found = false;
                int rand = (int)( Math.random()*CODELENGTH); 
                for(int j = 0; j < CODELENGTH; j++)
                {
                    if(i != j)
                       if(labCode[j] == rand)
                          found = true;
                }
                if(!found)
                {
                   labCode[i] = rand;
                   buildingCode[i] = rand;
                }
            }
        }
    }
    
    public boolean testPassword(int[] possiblePsswrd)
    {
        boolean notFound = false;
        for(int i = 0; i < CODELENGTH; i++)
        {
            if(possiblePsswrd[i] != labCode[i])
               notFound = true;
        }
        return notFound;
    }
    
}