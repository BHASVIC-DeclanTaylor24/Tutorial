import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket extends SpaceActors
{
    boolean fired = false;
    int verticalSpeed = 0;
    int horisontalSpeed = 0;
    boolean hitAstroids = false;
    
    /**
     * Act - do whatever the Rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        turnAround();
        accelerateCommand();
        setLocation(getX() + horisontalSpeed, getY() + verticalSpeed);
        bounceAtEdge();
        ShootObjects();
        hitAstroids();
    }
    public Rocket(){
        getImage().scale(getImage().getWidth()/3,getImage().getHeight()/3);
    }
    public void turnAround(){
        if(Greenfoot.isKeyDown("right")){
            setRotation(0);
        }
        if(Greenfoot.isKeyDown("left")){
            setRotation(180);
        }
        if(Greenfoot.isKeyDown("down")){
            setRotation(90);
        }
        if(Greenfoot.isKeyDown("up")){
            setRotation(270);
        }
    }
    public void accelerateCommand(){
        if (Greenfoot.isKeyDown("space")){
            if(getRotation() == 0){
                horisontalSpeed++;
            }
            if(getRotation() == 180){
                horisontalSpeed--;
            }
            if(getRotation() == 90){
                verticalSpeed++;
            }
            if(getRotation() == 270){
                verticalSpeed--;
            }
        }
        
    }
    public void bounceAtEdge(){
        if(getX() == 0){
            horisontalSpeed = -horisontalSpeed;
        }
        if(getY() == 0){
            verticalSpeed = -verticalSpeed;
        }
        if(getX() == 699){
            horisontalSpeed = -horisontalSpeed;
        }
        if(getY() == 799){
            verticalSpeed = -verticalSpeed;
        }
    }
    public void ShootObjects(){
        Projectile projectile = new Projectile();
        if(Greenfoot.isKeyDown("g") && fired == false){
            getWorld().addObject(projectile, getX(), getY());
            projectile.setRotation(getRotation());
            fired = true;
        }
        if (!Greenfoot.isKeyDown("g")){
            fired = false;
        }
    }
    public void hitAstroids(){
        if(isTouching(AllAstroids.class) && hitAstroids == false){
            MyWorld myWorld = (MyWorld)getWorld();
            HealthBar healthBar = myWorld.getHealthBar();
            healthBar.health--;
            hitAstroids =true;
        }
        else if (!isTouching(AllAstroids.class)){
            hitAstroids = false;
        }
    }
}
