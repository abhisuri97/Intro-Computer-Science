
/**
 * Write a description of class Welcome here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Welcome implements Hello
{
    private String helloEnglish = "Hello";
    private String helloSpanish = "Hola";
    private String helloFrench = "Bonjour";
    
    public void greeting(String language)
       {
           language = language.toLowerCase();
           if (language.equals("english"))
            System.out.println(helloEnglish);
           else if (language.equals("spanish"))
            System.out.println(helloSpanish);
           else if (language.equals("french"))
            System.out.println(helloFrench);
           else
            System.out.println("Something went wrong");
       }
    
       public static void main(String args[])
       {
           Welcome test = new Welcome();
           test.greeting("Spanish");
           String x = "Hello";
           String y = null;
           x = y;
           System.out.println(x);
        }
}
