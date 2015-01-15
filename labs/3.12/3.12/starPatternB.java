
/**
 * Abhinav Suri
 * v1.0
 * 10/12/2014
 */
public class starPatternB
{
    public static void main (String[] args) {
        //list variables
        int row;
        int numberOfStars;
        int numberOfSpaces;
        for(row = 1; row <= 10; ++row) 
        {
            for(numberOfSpaces = 0; numberOfSpaces < 10 - row; ++numberOfSpaces) 
            {
                System.out.print (" ");
            }
            for(numberOfStars = 0; numberOfStars < row; ++numberOfStars) 
            {
                System.out.print ("*");
            }
            System.out.println(); //print final result
        }
  }
}
