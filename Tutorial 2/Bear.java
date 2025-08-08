import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bear here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bear extends Actor
{
    int speed = 3;
    int count = 0;
    /**
     * Act - do whatever the Bear wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        moveAround();
        eatFood();
        touchTeleporter();
        Win();
        Lose();
    }
    public Bear(){
        getImage().scale(getImage().getWidth() /3 , getImage().getHeight() / 3);
    }
    public void moveAround(){
        if(Greenfoot.isKeyDown("right")){
            setLocation(getX() + speed , getY());
            if(hitWall() == true){
                setLocation(getX() - speed , getY());
            }
        }
        if(Greenfoot.isKeyDown("left")){
            setLocation(getX() - speed , getY());
            if(hitWall() == true){
                setLocation(getX() + speed , getY());
            }
        }
        if(Greenfoot.isKeyDown("down")){
            setLocation(getX() , getY() + speed);
            if(hitWall() == true){
                setLocation(getX() , getY() - speed);
            }
        }
        if(Greenfoot.isKeyDown("up")){
            setLocation(getX() , getY() - speed);
            if(hitWall() == true){
                setLocation(getX() , getY() + speed);
            }
        }
    }

    public boolean hitWall(){
        if (isTouching(Walls.class)){
            return true;
        }
        else{
            return false;
        }
    }
    public void eatFood(){
        if(getOneIntersectingObject(Lemon.class) != null){
            getWorld().removeObject(getOneIntersectingObject(Lemon.class));
            speed = speed +1;
            count = count +1;
        }
    }
    public void touchTeleporter(){
        if(isTouching(Teleporter.class)){
            setLocation(83,516);
        }
    }
    public boolean hitEnemy(){
        if(isTouching(Enemy.class) || isTouching(MoveEnemy.class)){
            return true;
        }
        else{
            return false;
        }
    }
    public void Lose(){
        if(hitEnemy() == true){
            getWorld().addObject(new YouLose(), 300,300);
            Greenfoot.stop();
        }
    }
    public void Win(){
        if(isTouching(WinTent.class) && count == 4){
            getWorld().addObject(new YouWin(), 300,300);
            Greenfoot.stop();
        }
    }
}
