import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Moon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Moon extends Actor
{
    /**
     * Act - do whatever the Moon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("right")){
            move(-3);
        }
        if(Greenfoot.isKeyDown("left")){
            move(3);
        }
        
        if(getX() ==0){
            setLocation(getWorld().getWidth()-1,Greenfoot.getRandomNumber(413)+265);
        }
    }
    public Moon(){
        getImage().scale(getImage().getWidth()/2,getImage().getHeight()/2);
    }
}
