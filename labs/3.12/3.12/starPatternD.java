
/**
 *Abhinav Suri
 *v1.0
 *10/12/2014
 */
public class starPatternD
{ 
    public static void main(String[] args)
    {    
            for (int rows=1; rows<10; rows += 2) //for loop start at row one add two rows each iteration
            {
                    for (int spaces=0; spaces < (4 - rows / 2); spaces++) //spaces for loop
                    {
                        System.out.print(" "); 
                    }
                    for (int stars=0; stars<rows; stars++) //stars for loop
                    {
                        System.out.print("*");
                    }
                    System.out.println("");
            }
            int x, y;
            for (y = 5; y >= 1; y--) //bottom half
            { 
                    for (x = 0; x < 5 - y; x++)
                    {
                        System.out.print(' ');
                    }
                        for (x = (2 - y); x < (2 - y) + (2 * y - 1); x++)
                    {   
                        System.out.print('*');
                    }    
                    System.out.print('\n');
            }
    }
}
