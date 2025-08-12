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
        setImage(new GreenfootImage("Score: " + score, 20, Color.GREEN, Color.BLACK));
        Win();
    }
    public Counter(){
        setImage(new GreenfootImage("Score: " + score, 50, Color.GREEN, Color.BLACK));
    }
    public void addScore(){
        score++;
    }
    public void Win(){
        if (score >= 50){
            getWorld().addObject(new YouWin(),300,400);
            Greenfoot.stop();
        }
    }
}
