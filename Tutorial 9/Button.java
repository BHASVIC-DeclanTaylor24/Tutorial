import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    MyWorld world;
    String name;
    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setImage(new GreenfootImage(name ,20,Color.BLACK,Color.WHITE));
    }
    public Button(String name){
        this.name = name;
        setImage(new GreenfootImage(name ,20,Color.BLACK,Color.WHITE));
    }
}
