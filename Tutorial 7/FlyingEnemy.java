import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FlyingEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlyingEnemy extends AllEnemies
{
    /**
     * Act - do whatever the FlyingEnemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move(5);
        wrapAtEdge();
    }
    public FlyingEnemy(){
        getImage().scale(getImage().getWidth()/3,getImage().getHeight()/3);
    }
}
