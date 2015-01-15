
/**
 * Write a description of class Android here.
 * 
 * @author Maritza Muguira 
 * @version 1.0
 */
public class Android
{
    // instance variables - replace the example below with your own
    Brain myBrain;
    Heart myheart;
    
    // Static class variable shared with all Android objects
    static int numberOfAndroids = 0;

    /**
     * Constructor for objects of class Android
     * 
     * You are just starting to write this code.  You want your android to have a brain.  It needs
     * memory.  The user can decide how much memory it gets.
     */
    public Android(int memory)
    {
        // creating another android - increase android count
        numberOfAndroids++;
        
        // initialise instance variables - build the android
        myBrain = new Brain(memory);
        
        System.out.println("Android: " + numberOfAndroids + " Androids so far.");
        System.out.println("In Android constructor this is: " + this);
        System.out.println();
    }

    
}

class Brain
{
    public String[] myMemories;
    
    Brain(int memory)
    {
        boolean brainOK;
        
        myMemories = new String[memory];
        
        // Check that memory was allocated
        brainOK = Organs.organCheck(this);
        if(!brainOK)
        {
            System.out.println("Oh no... Brain damaged!");
            System.out.println("Exiting program... could not create viable android.");
            System.exit(-1);
        }
        else
            System.out.println("Brain: " + memory + " Memory strings allocated.");
            
       System.out.println("In Brain constructor this is: " + this);
    }
    
}

class Heart
{
    private int beatsPerSec;
    
    Heart(int bps)
    {
        beatsPerSec = bps;
    }
    
}

class Organs
{
    public static boolean organCheck(Brain anotherBrain)
    {
        if(anotherBrain.myMemories == null)
            return false;
        else
            return true;
    }
    
    public static boolean organCheck(Heart anotherHeart)
    {
        return true;
    }
}