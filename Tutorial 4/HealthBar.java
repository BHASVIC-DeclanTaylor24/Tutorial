import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HealthBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HealthBar extends Actor
{
    int health = 15;
    int healthBarWidth = 60;
    int healthBarHeight = 10;
    int pixelsPerHP = (int)healthBarWidth / health;
    /**
     * Act - do whatever the HealthBar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        update();
        Lose();
    }
    public void update(){
        setImage(new GreenfootImage(healthBarWidth +2, healthBarHeight +2));
        GreenfootImage myImage = getImage();
        myImage.setColor(Color.WHITE);
        myImage.drawRect(0,0, healthBarWidth +1, healthBarHeight + 1);
        myImage.setColor(Color.RED);
        myImage.fillRect(1,1, health * pixelsPerHP, healthBarHeight);
    }
    public HealthBar(){
        update();
    }
    public void loseHealth(){
        health--;
    }
    public void Lose(){
        if (health == 0){
            getWorld().addObject(new YouLose(),300,400);
            Greenfoot.stop();
        }
    }
}
