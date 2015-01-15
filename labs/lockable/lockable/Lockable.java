
/**
 * Write a description of interface Lockable here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface Lockable
{
   public void setKey(int key);
   public void lock (int key);
   public void unlock(int key);
   public boolean locked ();
}
