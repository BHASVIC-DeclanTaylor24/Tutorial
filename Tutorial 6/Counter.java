import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    int score = 0;
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setImage(new GreenfootImage("Score: "+ score, 40, Color.BLUE, Color.WHITE));
        YouWin();
    }
    public Counter(){
        setImage(new GreenfootImage("Score: "+ score, 40, Color.BLUE, Color.WHITE));
    }
    public void addScore(){
        score++;
    }
    public void YouWin(){
        if (score >= 28){
            getWorld().addObject(new YouWin(), 350,400);
            Greenfoot.stop();
        }
    }
}
