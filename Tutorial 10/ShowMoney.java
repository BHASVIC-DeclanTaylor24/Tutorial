import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ShowMoney here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ShowMoney extends Actor
{
    MyWorld world;
    /**
     * Act - do whatever the ShowMoney wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setImage(new GreenfootImage("Money : " + world.money,50,Color.BLACK,Color.WHITE, new Color(0,0,0,0)));
        if(Greenfoot.mouseClicked(this)){
            world.money = 100;
        }
    }
    public ShowMoney(){
        setImage(new GreenfootImage("Money : " + world.money,50,Color.BLACK,Color.WHITE, new Color(0,0,0,0)));
    }
}
