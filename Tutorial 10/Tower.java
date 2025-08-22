import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Tower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tower extends Actor
{
    int fireSpeed = 0;
    /**
     * Act - do whatever the Tower wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        enemyDetector();
    }
    public Tower(){
        getImage().scale(60,60);
    }
    public void enemyDetector(){
        fireSpeed++;
        List<Enemy> enemies = getObjectsInRange(100, Enemy.class);
        for(Enemy enemy: enemies){
            if(fireSpeed > 9){
                
                Bullet bullet = new Bullet();
                getWorld().addObject(bullet,getX(),getY());
                bullet.turnTowards(enemy.getX(),enemy.getY());
                fireSpeed = 0;
            }
        }
    }
}
