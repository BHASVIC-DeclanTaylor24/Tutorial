import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WallHeightLarge here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WallHeightLarge extends Walls
{
    /**
     * Act - do whatever the WallHeightLarge wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public WallHeightLarge(){
        getImage().scale(getImage().getWidth() /2 , getImage().getHeight() * 30);
    }
}
