import java.util.Random;
//********************************************************************
// Abhinav Suri
// December 5th 2014
//********************************************************************
public class Coin implements Lockable
{
   private final int HEADS = 0;
   private final int TAILS = 1;

   private boolean locked;
   private int coinKey;

   private int face;

   public Coin ()
   {
       coinKey = 0;
       locked = false;
       flip();
   }
   
   public void flip ()
   {
      if (!locked)
       face = (int) (Math.random() * 2);
      
   }
   
   public String isHeads ()
   {
       if(!locked)
       if(face == HEADS)
        return "True";
       else
        return "False";
       else
        return "LOCKED";
   }
   
   public String toString()
   {
      if (!locked)
      {
       String faceName;
      if (face == HEADS)
         faceName = "Heads";
      else
         faceName = "Tails";
      return faceName;
    }
    else
     return "LOCKED";
   }
   public void setKey(int key)
   {
       coinKey = key;
   }
   public void lock(int key)
   {
        if(key == coinKey)
            locked = true;
   }
   public void unlock(int key)
   {
        if (key == coinKey)
            locked = false;
   }
   public boolean locked ()
   {
        return locked;
   }
}
