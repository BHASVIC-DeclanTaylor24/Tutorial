import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    int vertSpeed = 0;
    int acceleration = 1;
    
    int jumpHeight = -20;
    
    int collect =0;
    boolean coinsCollected =false;
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        moveAround();
        checkFalling();
        collectOrb();
        nextLevel();
    }
    public void moveAround(){
        
        
        if(Greenfoot.isKeyDown("space") && onGround() == true){
            vertSpeed = jumpHeight;
            fall();
        }
        if(Greenfoot.isKeyDown("space") && onMiddleGround() == true){
            vertSpeed = jumpHeight;
            fall();
        }
        if(Greenfoot.isKeyDown("space") && onUpperGround() == true){
            vertSpeed = jumpHeight;
            fall();
        }
    }
    public void fall(){
        setLocation(getX(),getY() + vertSpeed);
        vertSpeed = vertSpeed + acceleration;
    }
    boolean onGround(){
        Actor under = getOneObjectAtOffset(0,getImage().getHeight()/2,Ground.class);
        return under != null;
    }
    boolean onMiddleGround(){
        Actor under2 = getOneObjectAtOffset(0,getImage().getHeight()/2,MiddleGround.class);
        return under2 != null;
    }
    boolean onUpperGround(){
        Actor under3 = getOneObjectAtOffset(0,getImage().getHeight()/2,UpperGround.class);
        return under3 != null;
    }
    public void checkFalling(){
        if(onGround() ==  false || onMiddleGround() == false || onUpperGround() == false ){
            fall();
        }
        if(onGround() == true || onMiddleGround() == true || onUpperGround() == true){
            vertSpeed = 0;
        }
        
    }
    public void collectOrb(){
        Actor orb = getOneIntersectingObject(Orb.class);
        if(orb != null){
            getWorld().removeObject(orb);
            collect++;
        }
        if(collect == 10 && coinsCollected == false){
            getWorld().addObject(new House(),1650,400);
            coinsCollected = true;
        }
    }
    public void nextLevel(){
        Actor house = getOneIntersectingObject(House.class);
        if(house!= null){
            Greenfoot.setWorld(new Background2());
        }
    }
}
