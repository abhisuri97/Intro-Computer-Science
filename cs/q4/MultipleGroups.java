public class MultipleGroups implements NumberGroup
{
   private List<NumberGroup> groupList;
   
   public MultipleGroups( )
   {
   }
   
   public void add( NumberGroup item )
   {
   }
   
   	//Part C of question 4
   public boolean contains(int x)
  {
    for (NumberGroup g : groupList)
      if (g.contains(x))
        return true;
        
    return false;
  }
         
   public String toString()
   {
		return "" + groupList;
   }
}