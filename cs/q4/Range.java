
/**
 * Write a description of class Range here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Range implements NumberGroup
{
   private int minValue, maxValue;
   public Range(int min, int max)
   {
       minValue = min;
       maxValue = max;
    }
    public boolean contains (int x)
    {
        return x>=minValue && x<=maxValue;
    }
}
