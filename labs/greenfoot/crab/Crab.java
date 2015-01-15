import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab. Crabs live on the beach. They like sand worms 
 * (very yummy, especially the green ones).
 */
public class Crab extends Animal
{
    private int numEaten;  // should be initialized to zero
    
    public Crab()
    {
        numEaten = 0;
    }
    
    public void act()
    {
        move();
        if(Greenfoot.isKeyDown("left"))
        {
            turn(-9);
        }
        
        if(Greenfoot.isKeyDown("right"))
        {
            turn(9);
        }
        
        if(atWorldEdge())
        {
            turn(17);
        }
        
        if(canSee(Worm.class))
        {
            eat(Worm.class);
            numEaten++;
            Greenfoot.playSound("slurp.wav");
            if(numEaten % CrabWorld.NUMWORMS == 0)
            {
                Greenfoot.playSound("fanfare.wav");
                Greenfoot.delay(100);
            }
        }
        
    }
}


