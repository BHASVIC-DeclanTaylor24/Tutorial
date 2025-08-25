import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cat extends Actor
{
    int mouseX;
    int mouseY;
    /**
     * Act - do whatever the Cat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        followMouse();
        fireGun();
        moveAround();
        if(isTouching(House.class)){
            Greenfoot.setWorld(new Level2());
        }
    }
    public void followMouse(){
        if(Greenfoot.getMouseInfo() != null){
            mouseX = Greenfoot.getMouseInfo().getX();
            mouseY = Greenfoot.getMouseInfo().getY();
        }
        turnTowards(mouseX,mouseY);
    }
    public void fireGun(){
        if(Greenfoot.mouseClicked(null)){
            Bullet bullet = new Bullet();
            getWorld().addObject(bullet,getX(),getY());
            bullet.setRotation(getRotation());
        }
    }
    public void moveAround(){
        if(Greenfoot.isKeyDown("right")){
            setLocation(getX()+5,getY());
        }
        if(Greenfoot.isKeyDown("left")){
            setLocation(getX()-5,getY());
        }
        if(Greenfoot.isKeyDown("down")){
            setLocation(getX(),getY()+5);
        }
        if(Greenfoot.isKeyDown("up")){
            setLocation(getX(),getY()-5);
        }
    }
}
