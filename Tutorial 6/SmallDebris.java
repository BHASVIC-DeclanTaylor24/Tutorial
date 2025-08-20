import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SmallDebris here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SmallDebris extends AllAstroids
{
    Astroid astroid = new Astroid();
    /**
     * Act - do whatever the SmallDebris wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move(3);
        wrapAtEdge();
    }
    public SmallDebris(){
        getImage().scale(getImage().getWidth()/4,getImage().getHeight()/4);
        setRotation(astroid.getRotation());
        setRotation(Greenfoot.getRandomNumber(360));
    }
}
