public class Converter { 

   // converts integer n into a base b string
    public static String toString(int n, int base) {
       // special case
       if (n == 0) return "0";

       String digits = "0123456789";
       String s = "";
       while (n > 0) {
          int d = n % base;
          s = digits.charAt(d) + s;
          n = n / base;
       }
       return s;
    }
    
    
}