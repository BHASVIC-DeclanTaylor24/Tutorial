import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Player player = new Player();
        addObject(player,251,323);
        Enemy bee = new Enemy();
        addObject(bee, 92, 271);
        Enemy bee1 = new Enemy();
        addObject(bee1, 144, 390);
        Enemy bee2 = new Enemy();
        addObject(bee2, 206, 511);
        player.setLocation(104,76);
        
        Enemy enemy4 = new Enemy();
        addObject(enemy4,270,269);
        Enemy enemy5 = new Enemy();
        addObject(enemy5,322,389);
        Enemy enemy6 = new Enemy();
        addObject(enemy6,383,508);
        Enemy enemy7 = new Enemy();
        addObject(enemy7,443,265);
        Enemy enemy8 = new Enemy();
        addObject(enemy8,505,390);
        Enemy enemy9 = new Enemy();
        addObject(enemy9,570,513);
        Enemy enemy10 = new Enemy();
        addObject(enemy10,625,269);
        Enemy enemy11 = new Enemy();
        addObject(enemy11,686,388);
        Enemy enemy12 = new Enemy();
        addObject(enemy12,746,510);
    }
}
