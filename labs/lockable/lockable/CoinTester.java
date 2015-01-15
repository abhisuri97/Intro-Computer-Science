
/**
 * Write a description of class CoinTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CoinTester
{
    public static void main(String[] args)
    {
      Coin  coin1 = new Coin(); //creating new Coin object
      coin1.flip(); //flips coin
      System.out.println("First toss: " + coin1.toString()); //outputs the result of flip
      System.out.println("Is coin1 heads? " + coin1.isHeads()); //true if the coin is heads, false if tails
      
      coin1.setKey(2); //setting the key for locking and unlocking
      System.out.println("Is the coin locked?" + coin1.locked()); //this should be false
      System.out.println("We have set the key to 2. \nNow we are we are going to lock the Coin with the value of 2.");
      coin1.lock(2); //this should lock it
      System.out.println("Is it locked? " + coin1.locked()); //should be true
      System.out.println("Let's flip a coin");
      coin1.flip(); //testing out flip. should return LOCKED in both cases
      System.out.println("First toss: " + coin1.toString()); //LOCKED
      System.out.println("Is coin1 heads? " + coin1.isHeads() + "\n"); //LOCKED
      System.out.println("Let's unlock the coin!"); 
      coin1.unlock(2); //this should unlock the coin
      System.out.println("Is it locked? " + coin1.locked()); // return a false
      System.out.println("Let's flip a coin");
      coin1.flip(); //flip coin
      System.out.println("First toss: " + coin1.toString()); // returns a side of the coin
      System.out.println("Is coin1 heads? " + coin1.isHeads() + "\n"); //tests for heads/tails
      System.out.println("Let's try locking the coin with an incorrect key."); 
      coin1.lock(3); //trying to lock with an incorrect key will NOT lock it, should still be unlocked
      System.out.println("Is it locked? " + coin1.locked()); //should be false
      System.out.println("Let's flip a coin");
      coin1.flip(); //flips should work
      System.out.println("First toss: " + coin1.toString());
      System.out.println("Is coin1 heads? " + coin1.isHeads() + "\n\n");
      
      coin1.setKey(4); //setting a new key to lock and unlock
      System.out.println("Is the coin locked?" + coin1.locked()); // should still be false
      System.out.println("We have set the key to 4. \nNow we are we are going to lock the Coin with the value of 4.");
      coin1.lock(4); //should lock it
      System.out.println("Is it locked? " + coin1.locked()); //true
      System.out.println("Let's flip a coin"); 
      coin1.flip(); //flips coin, but will return a LOCKED
      System.out.println("First toss: " + coin1.toString()); //LOCKED
      System.out.println("Is coin1 heads? " + coin1.isHeads() + "\n"); //LOCKED
      System.out.println("Let's unlock the coin!");
      coin1.unlock(4); //unlocks the coin
      System.out.println("Is it locked? " + coin1.locked()); //false
      System.out.println("Let's flip a coin");
      coin1.flip(); //flips coin
      System.out.println("First toss: " + coin1.toString()); //returns face
      System.out.println("Is coin1 heads? " + coin1.isHeads() + "\n"); //tests for heads / tails
      System.out.println("Let's try locking the coin with an incorrect key.");
      coin1.lock(3); //locking with an incorrect key will not lock it
      System.out.println("Is it locked? " + coin1.locked()); //false
      System.out.println("Let's flip a coin"); 
      coin1.flip(); //will return normal results
      System.out.println("First toss: " + coin1.toString());
      System.out.println("Is coin1 heads? " + coin1.isHeads() + "\n\n");
      
   }

        
}
