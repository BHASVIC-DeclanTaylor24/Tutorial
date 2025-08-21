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
        super(600, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        MazeBlock mazeBlock = new MazeBlock();
        addObject(mazeBlock,0*50,10*50);
        MazeBlock mazeBlock2 = new MazeBlock();
        addObject(mazeBlock2,0*50,9*50);
        MazeBlock mazeBlock3 = new MazeBlock();
        addObject(mazeBlock3,0*50,8*50);
        MazeBlock mazeBlock4 = new MazeBlock();
        addObject(mazeBlock4,1*50,10*50);
        MazeBlock mazeBlock5 = new MazeBlock();
        addObject(mazeBlock5,2*50,10*50);
        removeObject(mazeBlock4);

        addObject(mazeBlock4,2*50,9*50);
        MazeBlock mazeBlock6 = new MazeBlock();
        addObject(mazeBlock6,2*50,8*50);
        MazeBlock mazeBlock7 = new MazeBlock();
        addObject(mazeBlock7,2*50,11*50);
        MazeBlock mazeBlock8 = new MazeBlock();
        addObject(mazeBlock8,3*50,8*50);
        MazeBlock mazeBlock9 = new MazeBlock();
        addObject(mazeBlock9,4*50,8*50);
        MazeBlock mazeBlock10 = new MazeBlock();
        addObject(mazeBlock10,5*50,8*50);
        MazeBlock mazeBlock11 = new MazeBlock();
        addObject(mazeBlock11,6*50,8*50);
        MazeBlock mazeBlock12 = new MazeBlock();
        addObject(mazeBlock12,7*50,8*50);
        MazeBlock mazeBlock13 = new MazeBlock();
        addObject(mazeBlock13,11*50,11*50);
        MazeBlock mazeBlock14 = new MazeBlock();
        addObject(mazeBlock14,10*50,11*50);
        MazeBlock mazeBlock15 = new MazeBlock();
        addObject(mazeBlock15,11*50,10*50);
        removeObject(mazeBlock13);
        removeObject(mazeBlock14);

        addObject(mazeBlock13,10*50,10*50);

        addObject(mazeBlock14,9*50,10*50);
        MazeBlock mazeBlock16 = new MazeBlock();
        addObject(mazeBlock16,9*50,9*50);
        MazeBlock mazeBlock17 = new MazeBlock();
        addObject(mazeBlock17,7*50,7*50);
        MazeBlock mazeBlock18 = new MazeBlock();
        addObject(mazeBlock18,8*50,7*50);
        MazeBlock mazeBlock19 = new MazeBlock();
        addObject(mazeBlock19,9*50,7*50);
        MazeBlock mazeBlock20 = new MazeBlock();
        addObject(mazeBlock20,11*50,7*50);
        MazeBlock mazeBlock21 = new MazeBlock();
        addObject(mazeBlock21,11*50,8*50);
        MazeBlock mazeBlock22 = new MazeBlock();
        addObject(mazeBlock22,8*50,10*50);
        MazeBlock mazeBlock23 = new MazeBlock();
        addObject(mazeBlock23,7*50,10*50);
        MazeBlock mazeBlock24 = new MazeBlock();
        addObject(mazeBlock24,6*50,10*50);
        MazeBlock mazeBlock25 = new MazeBlock();
        addObject(mazeBlock25,4*50,10*50);
        MazeBlock mazeBlock26 = new MazeBlock();
        addObject(mazeBlock26,3*50,10*50);
        removeObject(mazeBlock7);

        addObject(mazeBlock7,4*50,11*50);
        MazeBlock mazeBlock27 = new MazeBlock();
        addObject(mazeBlock27,2*50,7*50);
        MazeBlock mazeBlock28 = new MazeBlock();
        addObject(mazeBlock28,2*50,6*50);
        MazeBlock mazeBlock29 = new MazeBlock();
        addObject(mazeBlock29,1*50,6*50);
        MazeBlock mazeBlock30 = new MazeBlock();
        addObject(mazeBlock30,1*50,5*50);
        MazeBlock mazeBlock31 = new MazeBlock();
        addObject(mazeBlock31,1*50,4*50);
        MazeBlock mazeBlock32 = new MazeBlock();
        addObject(mazeBlock32,2*50,4*50);
        MazeBlock mazeBlock33 = new MazeBlock();
        addObject(mazeBlock33,3*50,4*50);
        MazeBlock mazeBlock34 = new MazeBlock();
        addObject(mazeBlock34,11*50,6*50);
        MazeBlock mazeBlock35 = new MazeBlock();
        addObject(mazeBlock35,11*50,5*50);
        MazeBlock mazeBlock36 = new MazeBlock();
        addObject(mazeBlock36,10*50,5*50);
        MazeBlock mazeBlock37 = new MazeBlock();
        addObject(mazeBlock37,9*50,5*50);
        MazeBlock mazeBlock38 = new MazeBlock();
        addObject(mazeBlock38,8*50,5*50);
        MazeBlock mazeBlock39 = new MazeBlock();
        addObject(mazeBlock39,7*50,5*50);
        MazeBlock mazeBlock40 = new MazeBlock();
        addObject(mazeBlock40,7*50,4*50);
        MazeBlock mazeBlock41 = new MazeBlock();
        addObject(mazeBlock41,9*50,4*50);
        MazeBlock mazeBlock42 = new MazeBlock();
        addObject(mazeBlock42,9*50,3*50);
        MazeBlock mazeBlock43 = new MazeBlock();
        addObject(mazeBlock43,9*50,2*50);
        removeObject(mazeBlock36);

        addObject(mazeBlock36,11*50,4*50);
        MazeBlock mazeBlock44 = new MazeBlock();
        addObject(mazeBlock44,11*50,3*50);
        MazeBlock mazeBlock45 = new MazeBlock();
        addObject(mazeBlock45,11*50,2*50);
        MazeBlock mazeBlock46 = new MazeBlock();
        addObject(mazeBlock46,11*50,1*50);
        removeObject(mazeBlock43);

        addObject(mazeBlock43,10*50,1*50);
        MazeBlock mazeBlock47 = new MazeBlock();
        addObject(mazeBlock47,9*50,1*50);
        MazeBlock mazeBlock48 = new MazeBlock();
        addObject(mazeBlock48,7*50,3*50);
        MazeBlock mazeBlock49 = new MazeBlock();
        addObject(mazeBlock49,7*50,2*50);
        MazeBlock mazeBlock50 = new MazeBlock();
        addObject(mazeBlock50,7*50,1*50);
        MazeBlock mazeBlock51 = new MazeBlock();
        addObject(mazeBlock51,7*50,0*50);
        MazeBlock mazeBlock52 = new MazeBlock();
        addObject(mazeBlock52,2*50,3*50);
        MazeBlock mazeBlock53 = new MazeBlock();
        addObject(mazeBlock53,2*50,2*50);
        MazeBlock mazeBlock54 = new MazeBlock();
        addObject(mazeBlock54,2*50,1*50);
        removeObject(mazeBlock54);

        addObject(mazeBlock54,3*50,1*50);
        MazeBlock mazeBlock55 = new MazeBlock();
        addObject(mazeBlock55,4*50,1*50);
        MazeBlock mazeBlock56 = new MazeBlock();
        addObject(mazeBlock56,5*50,0*50);
        removeObject(mazeBlock53);

        addObject(mazeBlock53,4*50,2*50);
        MazeBlock mazeBlock57 = new MazeBlock();
        addObject(mazeBlock57,5*50,1*50);
        MazeBlock mazeBlock58 = new MazeBlock();
        addObject(mazeBlock58,6*50,4*50);
        MazeBlock mazeBlock59 = new MazeBlock();
        addObject(mazeBlock59,5*50,4*50);
        removeObject(mazeBlock58);

        addObject(mazeBlock58,5*50,5*50);
        MazeBlock mazeBlock60 = new MazeBlock();
        addObject(mazeBlock60,5*50,6*50);
        MazeBlock mazeBlock61 = new MazeBlock();
        addObject(mazeBlock61,3*50,6*50);
        MazeBlock mazeBlock62 = new MazeBlock();
        addObject(mazeBlock62,6*50,3*50);
        MazeBlock mazeBlock63 = new MazeBlock();
        addObject(mazeBlock63,2*50,1*50);
        MazeBlock mazeBlock64 = new MazeBlock();
        addObject(mazeBlock64,1*50,1*50);
        removeObject(mazeBlock63);

        addObject(mazeBlock63,1*50,2*50);
        mazeBlock18.setLocation(406,357);
        MazeBlock mazeBlock65 = new MazeBlock();
        addObject(mazeBlock65,198,591);
        MazeBlock mazeBlock66 = new MazeBlock();
        addObject(mazeBlock66,591,500);
        MazeBlock mazeBlock67 = new MazeBlock();
        addObject(mazeBlock67,450,3);
        MazeBlock mazeBlock68 = new MazeBlock();
        addObject(mazeBlock68,594,397);
        MazeBlock mazeBlock69 = new MazeBlock();
        addObject(mazeBlock69,49,5);
        MazeBlock mazeBlock70 = new MazeBlock();
        addObject(mazeBlock70,98,547);
        MazeBlock mazeBlock71 = new MazeBlock();
        addObject(mazeBlock71,0,550);
        mazeBlock52.setLocation(107,149);
        removeObject(mazeBlock52);

        addObject(mazeBlock52,148,150);
        removeObject(mazeBlock53);

        addObject(mazeBlock53,247,100);
        removeObject(mazeBlock62);

        addObject(mazeBlock62,299,201);
        SpeedBoost speedBoost = new SpeedBoost();
        addObject(speedBoost,399,43);
        SpeedBoost speedBoost2 = new SpeedBoost();
        addObject(speedBoost2,100,23);
        SpeedBoost speedBoost3 = new SpeedBoost();
        addObject(speedBoost3,9,13);
        SpeedBoost speedBoost4 = new SpeedBoost();
        addObject(speedBoost4,147,447);
        SpeedBoost speedBoost5 = new SpeedBoost();
        addObject(speedBoost5,582,445);
        FlyingEnemy flyingEnemy = new FlyingEnemy();
        addObject(flyingEnemy,93,250);
        FlyingEnemy flyingEnemy2 = new FlyingEnemy();
        addObject(flyingEnemy2,24,346);
        flyingEnemy.setLocation(47,149);
        flyingEnemy2.setLocation(49,449);
        Player player = new Player(4);
        addObject(player,49,567);
        WalkingEnemy walkingEnemy = new WalkingEnemy(true);
        addObject(walkingEnemy,200,96);
        WalkingEnemy walkingEnemy2 = new WalkingEnemy(true);
        addObject(walkingEnemy2,504,97);
        WalkingEnemy walkingEnemy3 = new WalkingEnemy(false);
        addObject(walkingEnemy3,107,248);
        PlatformToWin platformToWin = new PlatformToWin();
        addObject(platformToWin,565,561);
    }
}
