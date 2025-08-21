import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WalkingEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WalkingEnemy extends AllEnemies
{
    boolean upDown;
    int speed = 2;
    /**
     * Act - do whatever the WalkingEnemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        moveAround1();
        enemyHitWalls();
    }
    public WalkingEnemy(boolean upAndDown){
        getImage().scale(getImage().getWidth()/3,getImage().getHeight()/3);
        upDown = upAndDown;
    }
    private void moveAround1(){
        int x = getX();
        int y = getY();
        if(upDown){
            setLocation(x,y + speed);
        }
        else if (!upDown){
            setLocation(x + speed, y);
        }
    }
    public void enemyHitWalls(){
        if(hitWalls() || isAtEdge()){
            speed = -speed;
        }
    }
}
