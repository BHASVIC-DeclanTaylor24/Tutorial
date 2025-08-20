import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    Counter counter = new Counter();
    HealthBar healthBar = new HealthBar();

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 800, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Rocket rocket = new Rocket();
        addObject(rocket,109,196);
        Astroid astroid = new Astroid();
        addObject(astroid, Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        Astroid astroid1 = new Astroid();
        addObject(astroid1, Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        Astroid astroid2 = new Astroid();
        addObject(astroid2, Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));
        Astroid astroid3 = new Astroid();
        addObject(astroid3, Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(800));

        addObject(counter,85,37);
        
        addObject(healthBar,217,34);
    }

    public Counter getCounter(){
        return counter;
    }
    public HealthBar getHealthBar(){
        return healthBar;
    }
}
