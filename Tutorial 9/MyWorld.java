import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

import javax.swing.JOptionPane;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    Button popButton = new Button("Population: ");
    public static int population = 0;
    String input;
    
    Button infectedButton = new Button("Infected: ");
    public static  int numInfected = 0;
    
    public static int numRecovered = 0;
    Button recoveredButton = new Button("Recovered: ");
    
    public static int numVulnerable = 0;
    Button vulnerableButton = new Button("Vulnerable: ");
    
    public static boolean socialDistance = false;
    Button socialDistanceButton = new Button("Social Distance: ");
    
    public static boolean wearMasks = false;
    Button masksButton = new Button("Masks: ");
    
    int time;

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 600, 1); 
        addObject(popButton,50,50);
        showText(""+ population,100,50);
        addObject(infectedButton,50,100);
        showText(""+ numInfected,100,100);
        addObject(recoveredButton,50,150);
        showText(""+ numRecovered,100,150);
        addObject(vulnerableButton,50,200);
        showText(""+ (population - (numInfected + numRecovered)),100,200);
        addObject(socialDistanceButton,50,250);
        showText(""+ socialDistance,130,250);
        addObject(masksButton,50,300);
        showText(""+ wearMasks,100,300);
        showText("Time: " + (time/60),50,350);
        setPaintOrder(Button.class, Person.class);
    }
    public void addPeople(int population){
        this.population = population;
        for(int i =0; i< population; i++){
            addObject(new Person(), Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight()));
        }
    }
    public void act(){
        if(Greenfoot.mouseClicked(popButton)){
            input = JOptionPane.showInputDialog("how many people do you want");
            population = Integer.parseInt(input);
            addPeople(population);
        }
        if(Greenfoot.mouseClicked(socialDistanceButton)){
            socialDistance = !socialDistance;
        }
        if(Greenfoot.mouseClicked(masksButton)){
            wearMasks = !wearMasks;
        }
        showText(""+ population,100,50);
        showText(""+ numInfected,100,100);
        showText(""+ numRecovered,100,150);
        showText(""+ (population - (numInfected + numRecovered)),100,200);
        showText(""+ socialDistance,130,250);
        showText(""+ wearMasks,100,300);
        time++;
        showText("Time: " + (time/60),50,350);
    }
}
