/*Abhinav Suri
 * Nov 17
 * v1.0
 */
public class Rational implements Comparable
{
   private int numerator, denominator;
   private final double TOLERANCE = 0.0001;

   public Rational (int numer, int denom)
   {
      if (denom == 0)
         denom = 1;

      // Make the numerator "store" the sign
      if (denom < 0)
      {
         numer = numer * -1;
         denom = denom * -1;
      }

      numerator = numer;
      denominator = denom;

      reduce();
   }

   public int getNumerator ()
   {
      return numerator;
   }

   public int getDenominator ()
   {
      return denominator;
   }

   public Rational reciprocal ()
   {
      return new Rational (denominator, numerator);
   }

   public Rational add (Rational op2)
   {
      int commonDenominator = denominator * op2.getDenominator();
      int numerator1 = numerator * op2.getDenominator();
      int numerator2 = op2.getNumerator() * denominator;
      int sum = numerator1 + numerator2;

      return new Rational (sum, commonDenominator);
   }

   public Rational subtract (Rational op2)
   {
      int commonDenominator = denominator * op2.getDenominator();
      int numerator1 = numerator * op2.getDenominator();
      int numerator2 = op2.getNumerator() * denominator;
      int difference = numerator1 - numerator2;

      return new Rational (difference, commonDenominator);
   }

   public Rational multiply (Rational op2)
   {
      int numer = numerator * op2.getNumerator();
      int denom = denominator * op2.getDenominator();

      return new Rational (numer, denom);
   }

   public Rational divide (Rational op2)
   {
      return multiply (op2.reciprocal());
   }

   public boolean equals (Rational op2)
   {
      return ( numerator == op2.getNumerator() &&
               denominator == op2.getDenominator() );
   }

   public String toString ()
   {
      String result;

      if (numerator == 0)
         result = "0";
      else
         if (denominator == 1)
            result = numerator + "";
         else
            result = numerator + "/" + denominator;

      return result;
   }

  //implements comparable interface
   public int compareTo(Object test)
   {
      Rational num= (Rational)test;

      double thisValue = (double)numerator / denominator;
      double otherValue = (double)num.numerator / num.denominator;

      if (Math.abs(thisValue - otherValue) < TOLERANCE)
         return 0;
      else
         if (thisValue > otherValue)
            return 1;
         else
            return -1;
   }


   //  Reduces this rational number by dividing both the numerator
   
   private void reduce ()
   {
      if (numerator != 0)
      {
         int common = gcd (Math.abs(numerator), denominator);

         numerator = numerator / common;
         denominator = denominator / common;
      }
   }

   
   //  Computes and returns the greatest common divisor of the two
   //  positive parameters. Uses Euclid's algorithm.
   
   private int gcd (int num1, int num2)
   {
      while (num1 != num2)
         if (num1 > num2)
            num1 = num1 - num2;
         else
            num2 = num2 - num1;

      return num1;
   }
}

