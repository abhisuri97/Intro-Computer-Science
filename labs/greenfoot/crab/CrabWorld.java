import greenfoot.*;  // imports Actor, World, Greenfoot, GreenfootImage

import java.util.Random;

public class CrabWorld extends World
{
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x460 cells, where every cell is just 1 pixel.
     */
    
    public static final int NUMWORMS = 40;
    
    public CrabWorld() 
    {
        super(560, 460, 1);
        setBackground("sand.jpg");
        
        for(int k = 1; k <= NUMWORMS; k++)
        {
            int x = (int)(Math.random() * getWidth());
            int y = (int)(Math.random() * getHeight());
            addObject(new Worm(), x, y);  // don't need reference to worm, goes to world and world hangs on to
        }
    }
}