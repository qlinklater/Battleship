import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class StartButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartButton extends Actor
{
    
    /**
     * StartButton is the contrector for object of tpye StartButton
     * 
     * @param there are no parameters
     * @return an object of type StartButton
     */
    public StartButton()
    {
        GreenfootImage buttonImage = new GreenfootImage( 90, 90 );
        
        buttonImage.setColor( Color.WHITE );
        buttonImage.fillOval( 0, 0, 90, 90 );
        
        buttonImage.setColor( Color.ORANGE );
        buttonImage.fillOval( 3, 3, 84, 84 );
        
        buttonImage.drawImage( new GreenfootImage( "START", 30, Color.BLACK, new Color( 0, 0, 0, 0 ) ), 6, buttonImage.getHeight() / 3);
        
        setImage( buttonImage );
    }
    
    /**
     * Act - do whatever the StartButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        
        if( Greenfoot.mouseClicked( this ) )
        {
            Greenfoot.setWorld( new PlayerWorld() );
        }
    }
}
