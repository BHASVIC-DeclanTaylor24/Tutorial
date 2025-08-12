import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket extends Actor
{
    boolean canFire = true;
    /**
     * Act - do whatever the Rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        moveAround();
        fireProjectile();
    }
    public Rocket(){
        setRotation(270);
    }
    public void moveAround(){
        if(Greenfoot.isKeyDown("right")){
            setLocation(getX()+3,getY());
        }
        if(Greenfoot.isKeyDown("left")){
            setLocation(getX()-3,getY());
        }
    }
    public void fireProjectile(){
        if(Greenfoot.isKeyDown("space") && canFire ==true){
            getWorld().addObject(new Bullet(),getX(),getY() -50);
            canFire = false;
        }
        else if (!Greenfoot.isKeyDown("space")){
            canFire = true;
        }
    }
}
