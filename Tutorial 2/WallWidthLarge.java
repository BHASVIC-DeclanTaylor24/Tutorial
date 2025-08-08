import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WallWidthLarge here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WallWidthLarge extends Walls
{
    /**
     * Act - do whatever the WallWidthLarge wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public WallWidthLarge(){
        getImage().scale(getImage().getWidth() *16 , getImage().getHeight());
    }
}
