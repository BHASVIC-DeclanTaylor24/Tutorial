import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    public int health = 5;
    MyWorld world;
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        moveAround();
        hitByBullet();
    }
    public void moveAround(){
        move(2);
        List <Road> road90 = getObjectsAtOffset(-30,0,Road.class);
        for(Road roads: road90){
            if(roads.straight == false && getRotation() == 0){
                setRotation(roads.turn);
            }
        }
        List <Road> road0 = getObjectsAtOffset(0,-30,Road.class);
        for(Road roads: road0){
            if(roads.straight == false && getRotation() == 90){
                setRotation(roads.turn);
            }
        }
        List <Road> road180 = getObjectsAtOffset(0,30,Road.class);
        for(Road roads: road180){
            if(roads.straight == false && getRotation() == 270){
                setRotation(roads.turn);
            }
        }
        List <Road> road270 = getObjectsAtOffset(30,0,Road.class);
        for(Road roads: road270){
            if(roads.straight == false && getRotation() == 180){
                setRotation(roads.turn);
            }
        }
    }
    public void hitByBullet(){
        Actor bullet = getOneIntersectingObject(Bullet.class);
        if(bullet != null){
            health--;
            getWorld().removeObject(bullet);
        }
        if (health < 1){
            world.money += 50; 
            getWorld().removeObject(this);
        }
        else if(isAtEdge()){
            getWorld().removeObject(this);
        }
    }
    public Enemy(int level){
        if(level == 1){
            setImage("wombat.png");
        }
        if(level == 2){
            setImage("elephant.png");
        }
        
    }
}
