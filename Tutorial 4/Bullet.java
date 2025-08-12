import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        moveAround();
        
        removeBullet();
    }
    public void moveAround(){
        setLocation(getX(),getY()-3);
    }
    public void removeBullet(){
        Actor enemy = getOneIntersectingObject(Enemys.class);
        if (enemy != null){
            getWorld().removeObject(enemy);
            getWorld().removeObject(this);
        }
        else if (getY() == 0){
            getWorld().removeObject(this);
        }
        
    }
    
}
