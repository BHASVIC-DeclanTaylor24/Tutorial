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
        super(1700, 800, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Sun sun = new Sun();
        addObject(sun,642,59);
        Earth earth = new Earth();
        addObject(earth,414,87);
        Mars mars = new Mars();
        addObject(mars,216,123);
        Clouds clouds = new Clouds();
        addObject(clouds,132,49);
        mars.setLocation(184,140);
        Clouds clouds2 = new Clouds();
        addObject(clouds2,184,140);
        Clouds clouds3 = new Clouds();
        addObject(clouds3,306,57);
        earth.setLocation(358,153);
        Clouds clouds4 = new Clouds();
        addObject(clouds4,358,153);
        earth.setLocation(471,103);
        Clouds clouds5 = new Clouds();
        addObject(clouds5,471,103);
        sun.setLocation(601,52);
        Clouds clouds6 = new Clouds();
        addObject(clouds6,601,52);
        Moon moon = new Moon();
        addObject(moon,574,311);
        Moon moon2 = new Moon();
        addObject(moon2,154,350);
        Moon moon3 = new Moon();
        addObject(moon3,305,270);
        Moon moon4 = new Moon();
        addObject(moon4,80,265);
        moon3.setLocation(390,288);
        Moon moon5 = new Moon();
        addObject(moon5,391,475);
        Moon moon6 = new Moon();
        addObject(moon6,212,519);
        Moon moon7 = new Moon();
        addObject(moon7,621,493);
        Moon moon8 = new Moon();
        addObject(moon8,630,616);

        Moon moon9 = new Moon();
        addObject(moon9,478,559);
        moon9.setLocation(505,492);
        moon6.setLocation(154,524);
        moon5.setLocation(376,412);
        moon9.setLocation(312,634);
        moon7.setLocation(592,470);
        moon8.setLocation(634,678);
        Earth earth2 = new Earth();
        addObject(earth2,850,97);
        Earth earth3 = new Earth();
        addObject(earth3,1360,68);
        Mars mars2 = new Mars();
        addObject(mars2,1517,137);
        Mars mars3 = new Mars();
        addObject(mars3,1032,146);
        Sun sun2 = new Sun();
        addObject(sun2,1194,87);
        Sun sun3 = new Sun();
        addObject(sun3,1653,43);
        sun3.setLocation(1592,46);
        Clouds clouds7 = new Clouds();
        addObject(clouds7,1592,46);
        mars2.setLocation(1544,124);
        Clouds clouds8 = new Clouds();
        addObject(clouds8,1544,124);
        mars2.setLocation(1491,157);
        Clouds clouds9 = new Clouds();
        addObject(clouds9,1491,157);
        earth3.setLocation(1327,68);
        Clouds clouds10 = new Clouds();
        addObject(clouds10,1327,68);
        sun2.setLocation(1185,97);
        Clouds clouds11 = new Clouds();
        addObject(clouds11,1185,97);
        sun2.setLocation(1237,177);
        Clouds clouds12 = new Clouds();
        addObject(clouds12,1237,177);
        earth3.setLocation(1424,38);
        Clouds clouds13 = new Clouds();
        addObject(clouds13,1424,38);
        sun2.setLocation(1083,39);
        Clouds clouds14 = new Clouds();
        addObject(clouds14,1083,39);
        mars3.setLocation(1059,179);
        Clouds clouds15 = new Clouds();
        addObject(clouds15,1059,179);
        earth2.setLocation(902,39);
        Clouds clouds16 = new Clouds();
        addObject(clouds16,902,39);
        earth2.setLocation(854,170);
        Clouds clouds17 = new Clouds();
        addObject(clouds17,854,170);
        Clouds clouds18 = new Clouds();
        addObject(clouds18,690,190);
        Clouds clouds19 = new Clouds();
        addObject(clouds19,733,50);
        sun.setLocation(579,128);
        Clouds clouds20 = new Clouds();
        addObject(clouds20,579,128);
        sun.setLocation(611,121);
        sun.setLocation(603,76);

        Moon moon10 = new Moon();
        addObject(moon10,1428,279);
        moon10.setLocation(1373,272);
        Moon moon11 = new Moon();
        addObject(moon11,1553,349);
        Moon moon12 = new Moon();
        addObject(moon12,1168,351);
        Moon moon13 = new Moon();
        addObject(moon13,1338,491);
        Moon moon14 = new Moon();
        addObject(moon14,1037,461);
        Moon moon15 = new Moon();
        addObject(moon15,869,544);
        Moon moon16 = new Moon();
        addObject(moon16,812,389);
        Moon moon17 = new Moon();
        addObject(moon17,895,269);
        Moon moon18 = new Moon();
        addObject(moon18,691,328);
        Moon moon19 = new Moon();
        addObject(moon19,724,648);
        Moon moon20 = new Moon();
        addObject(moon20,905,639);
        Moon moon21 = new Moon();
        addObject(moon21,982,710);
        Moon moon22 = new Moon();
        addObject(moon22,1152,619);
        Moon moon23 = new Moon();
        addObject(moon23,1303,658);
        Moon moon24 = new Moon();
        addObject(moon24,1476,609);
        Moon moon25 = new Moon();
        addObject(moon25,1008,320);
        Moon moon26 = new Moon();
        addObject(moon26,1373,383);

        Player player = new Player();
        addObject(player,75,680);
        Ground ground = new Ground();
        addObject(ground,78,725);
        Ground ground2 = new Ground();
        addObject(ground2,316,714);
        Ground ground3 = new Ground();
        addObject(ground3,571,709);
        Ground ground4 = new Ground();
        addObject(ground4,852,704);
        Ground ground5 = new Ground();
        addObject(ground5,1126,718);
        Ground ground6 = new Ground();
        addObject(ground6,1373,712);
        Ground ground7 = new Ground();
        addObject(ground7,1607,705);
        MiddleGround middleGround = new MiddleGround();
        addObject(middleGround,1590,578);
        MiddleGround middleGround2 = new MiddleGround();
        addObject(middleGround2,1337,577);
        MiddleGround middleGround3 = new MiddleGround();
        addObject(middleGround3,1011,581);
        MiddleGround middleGround4 = new MiddleGround();
        addObject(middleGround4,717,581);
        MiddleGround middleGround5 = new MiddleGround();
        addObject(middleGround5,441,581);
        MiddleGround middleGround6 = new MiddleGround();
        addObject(middleGround6,201,578);
        UpperGround upperGround = new UpperGround();
        addObject(upperGround,215,379);
        UpperGround upperGround2 = new UpperGround();
        addObject(upperGround2,477,371);
        UpperGround upperGround3 = new UpperGround();
        addObject(upperGround3,760,381);
        UpperGround upperGround4 = new UpperGround();
        addObject(upperGround4,1027,370);
        moon26.setLocation(1355,377);
        UpperGround upperGround5 = new UpperGround();
        addObject(upperGround5,1355,377);
        UpperGround upperGround6 = new UpperGround();
        addObject(upperGround6,1602,411);
        middleGround.setLocation(1573,535);
        middleGround2.setLocation(1361,556);
        middleGround3.setLocation(1087,532);
        middleGround4.setLocation(751,523);
        middleGround5.setLocation(457,523);
        middleGround6.setLocation(254,533);
    }

    public void act(){
        if(Greenfoot.getRandomNumber(100)<=1){
            addObject(new Orb(), getWidth()-1,Greenfoot.getRandomNumber(435)+280);
        }
    }
}
