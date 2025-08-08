import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MoveEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MoveEnemy extends Actor
{
    int speed = 2;
    /**
     * Act - do whatever the MoveEnemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        moveAround();
    }
    public MoveEnemy(){
        getImage().scale(getImage().getWidth() /2 , getImage().getHeight() / 2);
    }
    public void moveAround(){
        setLocation(getX() + speed,getY());
        if(isTouching(Walls.class)){
            speed = -speed;
        }
    }
}
