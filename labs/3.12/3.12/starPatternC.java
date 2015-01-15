/**
 * Abhinav Suri
 * v1.0
 * 10/12/2014
 */
public class starPatternC
{
    public static void main (String[] args) {
        
        //list variables
        int row;
        int numberOfStars;
        int numberOfSpaces;
        
        for(row = 0; row < 10; ++row) 
        {
            for(numberOfSpaces = 10; numberOfSpaces > 10 - row - 1; --numberOfSpaces) 
            {
                System.out.print(" "); 
            }
            for(numberOfStars = 10; numberOfStars > row; --numberOfStars) 
            {
                System.out.print ("*");
            }
            System.out.println(); //print final result
        }
    }
}
