import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Moveable here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Moveable extends Actor
{
    int speed = 4;
    /**
     * Act - do whatever the Moveable wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public void moveAround(){
        if(Greenfoot.isKeyDown("right")){
            setRotation(0);
            move(speed);
        }
        if(Greenfoot.isKeyDown("left")){
            setRotation(180);
            move(speed);
        }
        if(Greenfoot.isKeyDown("up")){
            setRotation(270);
            move(speed);
        }
        if(Greenfoot.isKeyDown("down")){
            setRotation(90);
            move(speed);
        }
    }
    public void movePlayer(){
        int x = getX();
        int y = getY();
        if(Greenfoot.isKeyDown("right")){
            setLocation(x+speed,y);
            if(hitWalls()){
                setLocation(x-speed,y);
            }
        }
        if(Greenfoot.isKeyDown("left")){
            setLocation(x-speed,y);
            if(hitWalls()){
                setLocation(x+speed,y);
            }
        }
        if(Greenfoot.isKeyDown("up")){
            setLocation(x,y-speed);
            if(hitWalls()){
                setLocation(x,y+speed);
            }
        }
        if(Greenfoot.isKeyDown("down")){
            setLocation(x,y+speed);
            if(hitWalls()){
                setLocation(x,y-speed);
            }
        }
    }
    public boolean hitWalls(){
        if(isTouching(MazeBlock.class)){
            return true;
        }
        else{
            return false;
        }
    }
    public void eatBoost(){
        if(isTouching(SpeedBoost.class)){
            speed++;
            removeTouching(SpeedBoost.class);
        }
    }
    public void maxSpeed(){
        if(speed>=8){
            speed = 8;
        }
    }
    public boolean hitEnemy(){
        if(isTouching(AllEnemies.class)){
            return true;
        }
        else{
            return false;
        }
    }
}
