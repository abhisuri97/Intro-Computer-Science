import java.util.*;

public class Histogram2
{
   public static void main (String [] args)
   {
      int[] ranges = new int [10];
      int box;
      Scanner scan = new Scanner (System.in);

      System.out.println ("Enter some numbers between 0 and 100.");
      System.out.print ("Signal the end by entering ");
      System.out.println ("a number out of that range.");

      int entered = scan.nextInt ();
      while (entered >= 1 && entered <= 100)
      {
         box = (entered - 1) / 10;
            System.out.println(box);
         ranges[box] ++;
            System.out.println(ranges[box]);
            System.out.println(Arrays.toString(ranges));
         entered = scan.nextInt ();
         
      }

      // print histogram
      for (box = 0; box < 10; box++)
      {
         System.out.print ((10 * box + 1) + "-");
         System.out.print ((10 * box + 10) + "\t|");
         for (int count = 0; count < ranges[box]; count++)
            System.out.print ("*");
         System.out.println ();
      }

   }
}
