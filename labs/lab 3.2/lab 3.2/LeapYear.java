
/**
 * Test if the year is a leap year!
 * 
 * @Abhinav Suri
 * @v1.0 9/16/14
 */
public class LeapYear
{
    public static void year(int year) {
        if(year < 1582) //Check if it is Gregorian Calendar Year
        {
                System.out.println("Sorry not a leap year since it is not on the Gregorian Calendar");
                return;
        }
        if((year % 4 == 0)) //Initial qualifer for leap year
        {
               if(year % 100 == 0) 
               {
                    if(year % 400 == 0)
                        System.out.println("This is a leap year");//for years such as 2000 (div by 400 and 100)
                    else 
                        System.out.println("This is not a leap year");//return this for years such as 1900 (div by 100 only)
               }
               else
               {
                   System.out.println("This is a leap year"); //output for if it doesn't fulfill 100 divisibility requirement
                   return;
               }
        }
        else 
        {
             System.out.println("This is not a leap year"); //year greater than 1582 not divisible by 4
             return;
        }
    }        
}
