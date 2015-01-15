public class RationalNumbers
{
   //-----------------------------------------------------------------
   //  Creates some rational number objects and performs various
   //  operations on them.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      Rational r1 = new Rational (6, 7);
      Rational r2 = new Rational (3, 5);
      Rational r3, r4, r5, r6, r7;

      System.out.println ("First rational number: " + r1);
      System.out.println ("Second rational number: " + r2);

      int compareValue = r1.compareTo(r2);

      if (compareValue == 0)
         System.out.println ("r1 and r2 are equal.");
      else
         if (compareValue < 0)
            System.out.println ("r1 is less than r2");
         else
            System.out.println("r1 is greater than r2");


      Rational r8 = new Rational (8, 9);
      Rational r9 = new Rational (8, 9);


      System.out.println ("\nr8 rational number: " + r8);
      System.out.println ("r9 rational number: " + r9);
      compareValue = r8.compareTo(r9);

      if (compareValue == 0)
         System.out.println ("r8 and r9 are equal.");
      else
         if (compareValue < 0)
            System.out.println ("r8 is less than r9");
         else
      System.out.println("r8 is greater than r9");

      Rational r10 = new Rational (4, 6);
      Rational r11 = new Rational (5, 6);


      System.out.println ("\nr10 rational number: " + r10);
      System.out.println ("r11 rational number: " + r11);
      compareValue = r10.compareTo(r11);

      if (compareValue == 0)
         System.out.println ("r10 and r11 are equal.");
      else
         if (compareValue < 0)
            System.out.println ("r10 is less than r11");
         else
      System.out.println("r10 is greater than r11");

      r3 = r1.reciprocal();
      System.out.println ("\nThe reciprocal of r1 is: " + r3);

      r4 = r1.add(r2);
      r5 = r1.subtract(r2);
      r6 = r1.multiply(r2);
      r7 = r1.divide(r2);

      System.out.println ("r1 + r2: " + r4);
      System.out.println ("r1 - r2: " + r5);
      System.out.println ("r1 * r2: " + r6);
      System.out.println ("r1 / r2: " + r7);
   }
}

