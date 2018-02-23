import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Name: Quentin Linklater 
 * Course: CS30S
 * Teacher: MR. Hardman
 * lab #1, program #0
 * date last modified: feb 22nd, 2018
 */
public class StartMenu extends World
{
    private GreenfootImage startBackground = new GreenfootImage( "battleship.jpg" );
    
    /**
     * StartMenu is the contructor for object for type StartMenu
     * 
     * @param there are no parameters
     * @return an object of type StartMenu
     */
    public StartMenu()
    {    
        // Create a new world with 1080x720 cells with a cell size of 1x1 pixels.
        super(1080, 720, 1); 
        
        startBackground.scale( getWidth(), getHeight() );
        
        setBackground( startBackground );
        
        addObject( new StartButton(), getWidth()/2, getHeight() - 100 );
    }
}
