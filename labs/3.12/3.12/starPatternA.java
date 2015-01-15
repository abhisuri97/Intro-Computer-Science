
/**
 * Abhinav Suri
 * v1.0
 * 10/12/2014
 */
public class starPatternA
{
    public static void main (String[] args) {
        int row; //list variables
        int numberOfStars;
       
        for(row = 1; row <= 10; row++) { //for loop as long as rows are less than 10
            for(numberOfStars = 10; numberOfStars >= row; numberOfStars--) {
            System.out.print ("*");
        }
        System.out.println(); //print final result
    }
}
}
