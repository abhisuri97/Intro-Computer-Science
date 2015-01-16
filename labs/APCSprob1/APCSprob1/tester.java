
/**
 * Write a description of class tester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tester
{
    public static String tester (String word)
    {
        for(int i = 0 ; i < word.length(); i++)
        {
            if (word.substring(i,i+1).equals("A") && !word.substring(i+1,i+2).equals("A"))
            {
                String str1 = word.substring (0,i);
                String after = word.substring (i+1, i+2);
                String A = "A";
                String last = word.substring (i+2, word.length());
                word = str1 + after + A + last;
                i++;
            }
        }
        return word;
    }
   
    
}
