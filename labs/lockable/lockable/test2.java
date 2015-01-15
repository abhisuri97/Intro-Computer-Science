
/**
 * Write a description of class test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class test2
{
    private String tester;
    public void test()
{
    String s= "world";
    int n = 6;
    changer(s,n);
    System.out.println(tester);
}
public void changer(String x,int y)
{
    x=x + "peace";
    y=y*2;
    String tester = x + y;
}

}