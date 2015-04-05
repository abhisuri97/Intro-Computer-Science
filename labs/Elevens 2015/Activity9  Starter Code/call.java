
/**
 * Write a description of class call here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class call
{
   public int dunno(int m)
    {
        int value;
        
        if(m == 0)
            value = 3;
        else
            value = dunno(m - 1) + 3;
        return value;
    }
    
    public double power(double x, int n)
    {
        System.out.println("In power " + x + " : " + n);
        if(n == 0)
            return 1.0;
        else if(n % 2 != 0)
            return x * Math.pow(power(x, n/2), 2);
        else
            return Math.pow(power(x, n/2), 2);
    }
}
