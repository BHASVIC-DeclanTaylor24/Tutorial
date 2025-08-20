import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Astroid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Astroid extends AllAstroids
{
    int verticalSpeed = Greenfoot.getRandomNumber(4)+1;
    int horisontalSpeed = Greenfoot.getRandomNumber(4)+1;
    /**
     * Act - do whatever the Astroid wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setLocation(getX() + horisontalSpeed, getY() + verticalSpeed);
        wrapAtEdge();
    }
    public Astroid(){
        if(Greenfoot.getRandomNumber(2) == 1){
            horisontalSpeed = -horisontalSpeed;
        }
        if(Greenfoot.getRandomNumber(2) == 1){
            verticalSpeed = -verticalSpeed;
        }
        
    }
}
