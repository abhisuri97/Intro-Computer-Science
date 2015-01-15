import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lobster extends Animal
{
    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int numEaten;
    
    public Lobster()
    {
        numEaten = 0;
    }
    
    public void act() 
    {
        move();
        if(atWorldEdge())
        {
            turn(18);
        }
        else
        {
            double ran = Math.random();
            if(ran < .07)
            {
                int x = (int)(Math.random()*360);
                turn(x);
                if(atWorldEdge())
                {
                    turn(180);
                }
            }
        }
        /*
        if(canSee(Crab.class))
        {
            eat(Crab.class);
            numEaten++;
            Greenfoot.playSound("au.wav");
            Greenfoot.delay(100);
            
        }
        */
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
        /*
        if(canSee(Crab.class))
        {
            eat(Crab.class);
            numEaten++;
            Greenfoot.playSound("au.wav");
            Greenfoot.delay(100);
            
        }
        */
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
