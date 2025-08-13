import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Clouds here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Clouds extends Actor
{
    /**
     * Act - do whatever the Clouds wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("right")){
            move(-2);
        }
        if(Greenfoot.isKeyDown("left")){
            move(2);
        }
        
        if(getX() ==0){
            setLocation(getWorld().getWidth()-1,Greenfoot.getRandomNumber(103)+50);
        }
    }
    public Clouds(){
        getImage().scale(getImage().getWidth()/2,getImage().getHeight()/2);
    }
}
