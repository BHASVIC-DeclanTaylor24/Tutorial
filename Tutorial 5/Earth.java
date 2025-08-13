import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Earth here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Earth extends Actor
{
    /**
     * Act - do whatever the Earth wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("right")){
            move(-1);
        }
        if(Greenfoot.isKeyDown("left")){
            move(1);
        }
        
        if(getX() ==0){
            setLocation(getWorld().getWidth()-1,Greenfoot.getRandomNumber(110)+30);
        }
    }
    public Earth(){
        getImage().scale(getImage().getWidth()/3,getImage().getHeight()/3);
    }
}
