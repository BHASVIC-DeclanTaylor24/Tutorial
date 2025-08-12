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
    HealthBar healthbar = new HealthBar();
    boolean bossLevel = false;

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 800, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Rocket rocket = new Rocket();
        addObject(rocket,136,743);
        rocket.setLocation(477,733);
        rocket.setLocation(304,728);
        addObject(counter, 50,50);
        addObject(healthbar, 150,50);
    }
    public void act(){
        addEnemy1();
        addEnemy2();
        Boss();
    }
    public void addEnemy1(){
        if(Greenfoot.getRandomNumber(60)<1){
            addObject(new Enemy1(), Greenfoot.getRandomNumber(600),0);
        }
        
    }
    public void addEnemy2(){
        if(Greenfoot.getRandomNumber(90)<1){
            addObject(new Enemy2(), Greenfoot.getRandomNumber(600),0);
        }
        
    }
    public Counter getCounter(){
        return counter;
    }
    public HealthBar getHealthBar(){
        return healthbar;
    }
    public void Boss(){
        if(counter.score == 30 || counter.score == 31){
            if(bossLevel == false){
                addObject(new Boss(),300,0);
                bossLevel = true;
            }
        }
    }
}
