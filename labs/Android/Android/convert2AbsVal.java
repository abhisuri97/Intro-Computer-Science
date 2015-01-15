
/**
 * Write a description of class convert2AbsVal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class convert2AbsVal {
    private String[] allMyStrings = {"a", "b", "c"};
public static int countChars(String[] allMyStrings)
{
int i = 0;
int a = 0;
int b = 0;
for (i=0; i < allMyStrings.length; i++)
{
	a = allMyStrings[i].length();
	b = b + a;

}
return b;
}
}
