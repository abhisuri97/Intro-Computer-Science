
/**
 * Write a description of class test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class test
{
    public static void main (String args[]) {
        for (int i = 0; i < 1000; i++) {
        if (i < 10) 
            System.out.println("Daisy00" + i);
        else if(i<100) {
            System.out.println("Daisy0" + i);
        }
        else {
            System.out.println("Daisy"+i);
        }
    }
}
}
