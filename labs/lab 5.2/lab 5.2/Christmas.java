import java.applet.Applet;  // API package for Applets
import java.awt.*;          // API package for Frame and Color classes
  
public class Christmas extends Applet

{
    public Christmas ()
    { 
    }
    
    public void paint (Graphics frame)
    {  
		
	    final int Bottom = 250;	
	    final int Right = 350;		

		
	    setBackground (Color.blue);

		
	    frame.setColor (Color.red);
		
	    frame.fillRect (40, 250, 50, 50); 


		
	    frame.setColor (Color.cyan);

	    frame.fillRect (200,250,50,50);
	    
	    
	    frame.setColor (Color.orange);
	    frame.fillRoundRect(300, 237, 20, 15, 80, 40);
	    
	    frame.setColor (Color.red);
	    frame.fillRoundRect(400, 237, 20, 15, 80, 40);
	    
	    frame.setColor (Color.yellow);
	    frame.fillRoundRect(200, 137, 20, 15, 80, 40);
	    
	    frame.setColor (Color.white);
	    frame.setFont(new Font("default", Font.BOLD,36));
	    frame.drawString ("Happy Holidays!", 100, 150);

    }
}    
