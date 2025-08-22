import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

import java.util.List;
/**
 * Write a description of class Person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person extends Actor
{
    public boolean infected = false;
    MyWorld world;
    int healTime = 0;
    int infectArea = 20;
    /**
     * Act - do whatever the Person wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        moveAround();
        getVirus();
        socialDistance(world.socialDistance);
        if (world.wearMasks){
            infectArea = 5;
            getImage().setColor(Color.BLUE);
            getImage().fillOval(14,5,10,4);
        }
        if(!world.wearMasks){
            getImage().setColor(Color.BLACK);
            getImage().fillOval(14,5,10,4);
        }
    }
    public Person(){
        getImage().scale(40,40);
        setRotation(Greenfoot.getRandomNumber(360));
    }
    public void moveAround(){
        move(4);
        turn(Greenfoot.getRandomNumber(20)-10);
        if(isAtEdge()){
            turn(30);
        }
    }
    public void infect(){
        getImage().setColor(Color.RED);
        getImage().fillRect(5,0,10,20);
        getImage().fillRect(0,5,20,10);
        infected = true;
        world.numInfected++;
    }
    public void getVirus(){
        List<Person> people = getObjectsInRange(infectArea,Person.class);
        for(Person persons : people){
            if (persons.infected && infected == false){
                infect();
                infected = true;
                
            }
        }
        if (infected){
            healTime++;
        }
        if(healTime == 200 && infected == true){
            heal();
            
        }
    }
    public void heal(){
        getImage().setColor(Color.WHITE);
        getImage().fillRect(5,0,10,20);
        getImage().fillRect(0,5,20,10);
        world.numRecovered++;
        world.numInfected--;
    }
    public void socialDistance(boolean enabled){
        if(enabled){
            List<Person> people = getObjectsInRange(50,Person.class);
            for(Person persons : people){
                turn(Greenfoot.getRandomNumber(100)-50);
            }
        }
    }
}
