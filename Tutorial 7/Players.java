import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Players here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Players extends Moveable
{
    /**
     * Act - do whatever the Players wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public void Win(){
        if(isTouching(PlatformToWin.class)){
            getWorld().addObject(new YouWin(),getWorld().getWidth()/2, getWorld().getHeight()/2);
            Greenfoot.stop();
        }
    }
}
