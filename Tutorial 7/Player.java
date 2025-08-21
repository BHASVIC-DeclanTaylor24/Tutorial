import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Players
{
    int playerLives;
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        movePlayer();
        eatBoost();
        maxSpeed();
        loseLife();
        hitFlyer();
        
        Win();
        Lose();
        
    }
    public Player(int lives){
        getImage().scale(getImage().getWidth()/3,getImage().getHeight()/3);
        playerLives = lives;
    }
    public void hitFlyer(){
        if(hitEnemy() == true){
            setLocation(49, 567);
        }
    }
    public void loseLife(){
        if(hitEnemy()){
            playerLives--;
        }
    }
    public void Lose(){
        if(playerLives == 0){
            getWorld().addObject(new youLose(),getWorld().getWidth()/2, getWorld().getHeight()/2);
            Greenfoot.stop();
        }
    }
}
