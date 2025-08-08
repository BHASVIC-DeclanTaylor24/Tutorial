import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Animal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Animal extends Actor
{
    int imageNumber;
    int speed =3;
    /**
     * Act - do whatever the Animal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move(speed);
        if(getX()>590){
            turn(150);
            changeImage();
        }
        if(getX()<2){
            turn(150);
            changeImage();
        }
        if(getY()>390){
            turn(150);
            changeImage();
        }
        if(getY()<2){
            turn(150);
            changeImage();
        }
    }
    public Animal(int direction,int weight, int speed){
        setRotation(direction);
        imageNumber = 0;
        speed = Greenfoot.getRandomNumber(5) +1;
    }
    public void changeImage(){
        imageNumber++;
        if(imageNumber ==1){
            setImage("ant3.png");
        }
        if(imageNumber ==2){
            setImage("camel.png");
        }
        if(imageNumber ==3){
            setImage("ladybug1.png");
        }
        if(imageNumber ==4){
            setImage("turtle2.png");
        }
        if (imageNumber ==5){
            imageNumber = 1;
        }
        
    }
}
