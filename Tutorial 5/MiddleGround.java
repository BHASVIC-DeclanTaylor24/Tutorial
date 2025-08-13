import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MiddleGround here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MiddleGround extends Actor
{
    /**
     * Act - do whatever the MiddleGround wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("left")){
            move(5);
        }
        if(Greenfoot.isKeyDown("right")){
            move(-5);
        }
        if(getX() ==0){
            setLocation(getWorld().getWidth()-1,Greenfoot.getRandomNumber(430)+115);
        }
    }
    public MiddleGround(){
        getImage().scale(getImage().getWidth()*6,getImage().getHeight()*2);
    }
}
