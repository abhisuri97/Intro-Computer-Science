/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Laurie White
 * @version April 2012
 */
public class StringExplorer
{

    public static void main(String[] args)
    {
        String sample = "The quick brown fox jumped over the lazy dog.";
        
        //  Demonstrate the indexOf method.
        int position = sample.indexOf("quick");
        System.out.println ("sample.indexOf(\"quick\") = " + position);
        int pos = sample.indexOf("slow");
        if (pos != -1)
            System.out.println("slow is found at position " + pos);
        else
            System.out.println("slow is not found");
        //  Demonstrate the toLowerCase method.
        String lowerCase = sample.toLowerCase();
        System.out.println ("sample.toLowerCase() = " + lowerCase);
        System.out.println ("After toLowerCase(), sample = " + sample);
        
        //  Try other methods here:
        String statement = "Computer Science is the best, the greatest, and the most wonderful subject to study!";
        String phrase = statement.trim().toLowerCase();
        String goal = "the";
        int startPos = 0;
        
        int pos2 = phrase.indexOf(goal, startPos);
        if (pos2 >=0)
        {
            while (pos2 >= 0)
            {
                String before = " ", after = " ";
                if (pos2 > 0)
                {
                    before = phrase.substring(pos2-1, pos2);
                }
                
                if (pos2 + goal.length() < phrase.length() -1)
                {
                    after = phrase.substring(pos2+ goal.length(), pos2 + goal.length() + 1);
                }
                
                if ((before.compareTo("a") < 0 || before.compareTo("z") > 0) && 
                    (after.compareTo("a") < 0 || after.compareTo("z") > 0))
                {
                    System.out.println(pos2);
                }
                
                pos2 = phrase.indexOf(goal, pos2 + 1);
            }
        }
        else 
        {
            System.out.println("-1");
        }
        
    }
        
}

