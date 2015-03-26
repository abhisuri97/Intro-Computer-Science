
/**
 * Write a description of class ZombieWar here.
 * 
 * @author Maritza Muguira 
 * @version 3/4/2015
 */
public class ZombieWar
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class ZombieWar
     */
    public ZombieWar()
    {
        // initialise instance variables
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public static void startWar()
    {
        int count;
        int zombieCount;
        
        // Create the CDC
        CDC theCDC = new CDC();
        
        // Humans run the search for the CDC laboratory password
        Human human1 = new Human();
        count = human1.searchLabCode(theCDC);

        System.out.println("Humans broke the password after " + count + " tries!");
        
       
    }
}
