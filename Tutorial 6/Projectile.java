import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Projectile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Projectile extends SpaceActors
{
    /**
     * Act - do whatever the Projectile wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move(5);
        Actor astroid = getOneIntersectingObject(Astroid.class);
        Actor debris = getOneIntersectingObject(Debris.class);
        Actor debris2 = getOneIntersectingObject(SmallDebris.class);
        if(astroid != null){
            getWorld().removeObject(astroid);
            getWorld().addObject(new Debris(),getX(),getY());
            getWorld().addObject(new Debris(),getX(),getY());
            MyWorld myWorld = (MyWorld)getWorld();
            Counter counter = myWorld.getCounter();
            counter.addScore();
            getWorld().removeObject(this);
        }
        else if(debris != null){
            getWorld().removeObject(debris);
            getWorld().addObject(new SmallDebris(),getX(),getY());
            getWorld().addObject(new SmallDebris(),getX(),getY());
            MyWorld myWorld = (MyWorld)getWorld();
            Counter counter = myWorld.getCounter();
            counter.addScore();
            getWorld().removeObject(this);
        }
        else if(debris2 != null){
            getWorld().removeObject(debris2);
            MyWorld myWorld = (MyWorld)getWorld();
            Counter counter = myWorld.getCounter();
            counter.addScore();
            getWorld().removeObject(this);
        
        }
        else if(getX() == 0){
           getWorld().removeObject(this);
        }
        else if(getY() == 0){
            getWorld().removeObject(this);
        }
        else if(getX() == 699){
            getWorld().removeObject(this);
        }
        else if(getY() == 799){
            getWorld().removeObject(this);
        }
    }
    
}
