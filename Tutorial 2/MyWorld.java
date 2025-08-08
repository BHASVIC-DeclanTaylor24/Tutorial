import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    int time = 0;

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(616, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        WallWidthSmall wallWidthSmall = new WallWidthSmall();
        addObject(wallWidthSmall,290,401);
        WallWidthSmall wallWidthSmall2 = new WallWidthSmall();
        addObject(wallWidthSmall2,285,354);
        WallWidthSmall wallWidthSmall3 = new WallWidthSmall();
        addObject(wallWidthSmall3,391,349);
        WallWidthSmall wallWidthSmall4 = new WallWidthSmall();
        addObject(wallWidthSmall4,329,303);
        WallWidthSmall wallWidthSmall5 = new WallWidthSmall();
        addObject(wallWidthSmall5,490,259);
        WallWidthSmall wallWidthSmall6 = new WallWidthSmall();
        addObject(wallWidthSmall6,250,110);
        WallWidthSmall wallWidthSmall7 = new WallWidthSmall();
        addObject(wallWidthSmall7,192,161);
        WallWidthSmall wallWidthSmall8 = new WallWidthSmall();
        addObject(wallWidthSmall8,99,112);
        WallWidthSmall wallWidthSmall9 = new WallWidthSmall();
        addObject(wallWidthSmall9,155,353);
        WallWidthSmall wallWidthSmall10 = new WallWidthSmall();
        addObject(wallWidthSmall10,154,446);
        WallWidthSmall wallWidthSmall11 = new WallWidthSmall();
        addObject(wallWidthSmall11,337,489);
        WallWidthSmall wallWidthSmall12 = new WallWidthSmall();
        addObject(wallWidthSmall12,441,495);
        WallWidthSmall wallWidthSmall13 = new WallWidthSmall();
        addObject(wallWidthSmall13,538,306);
        WallWidthSmall wallWidthSmall14 = new WallWidthSmall();
        addObject(wallWidthSmall14,529,158);
        wallWidthSmall6.setLocation(231,112);
        wallWidthSmall6.setLocation(247,106);
        wallWidthSmall6.setLocation(240,113);
        wallWidthSmall10.setLocation(144,447);
        wallWidthSmall11.setLocation(344,497);
        wallWidthSmall12.setLocation(419,490);
        wallWidthSmall12.setLocation(433,497);
        wallWidthSmall11.setLocation(341,494);
        wallWidthSmall11.setLocation(336,495);
        WallHeightMedium wallHeightMedium = new WallHeightMedium();
        addObject(wallHeightMedium,454,114);
        wallHeightMedium.setLocation(454,101);
        removeObject(wallHeightMedium);
        WallWidthMedium wallWidthMedium = new WallWidthMedium();
        addObject(wallWidthMedium,462,111);
        WallWidthMedium wallWidthMedium2 = new WallWidthMedium();
        addObject(wallWidthMedium2,270,203);
        WallWidthMedium wallWidthMedium3 = new WallWidthMedium();
        addObject(wallWidthMedium3,170,254);
        WallWidthMedium wallWidthMedium4 = new WallWidthMedium();
        addObject(wallWidthMedium4,111,399);
        wallWidthMedium4.setLocation(127,395);
        WallWidthMedium wallWidthMedium5 = new WallWidthMedium();
        addObject(wallWidthMedium5,169,496);
        wallWidthMedium5.setLocation(155,491);
        wallWidthMedium5.setLocation(168,493);
        WallWidthMedium wallWidthMedium6 = new WallWidthMedium();
        addObject(wallWidthMedium6,496,449);
        wallWidthMedium6.setLocation(527,449);
        wallWidthMedium6.setLocation(501,448);
        wallWidthMedium6.setLocation(513,448);
        WallWidthMedium wallWidthMedium7 = new WallWidthMedium();
        addObject(wallWidthMedium7,326,160);
        wallWidthMedium7.setLocation(398,161);
        wallWidthMedium7.setLocation(422,156);
        wallWidthMedium7.setLocation(377,161);
        wallWidthMedium7.setLocation(401,159);
        wallWidthMedium7.setLocation(364,158);
        WallWidthMedium wallWidthMedium8 = new WallWidthMedium();
        addObject(wallWidthMedium8,364,158);
        WallWidthMedium wallWidthMedium9 = new WallWidthMedium();
        addObject(wallWidthMedium9,463,205);
        wallWidthMedium9.setLocation(444,203);
        wallWidthMedium9.setLocation(451,206);
        wallWidthMedium9.setLocation(416,205);
        WallWidthMedium wallWidthMedium10 = new WallWidthMedium();
        addObject(wallWidthMedium10,416,205);
        WallWidthMedium wallWidthMedium11 = new WallWidthMedium();
        addObject(wallWidthMedium11,414,399);
        wallWidthMedium11.setLocation(426,398);
        wallWidthSmall5.setLocation(490,253);
        wallWidthSmall5.setLocation(478,253);
        wallWidthSmall13.setLocation(527,298);
        wallWidthSmall3.setLocation(385,352);
        WallWidthLarge wallWidthLarge = new WallWidthLarge();
        addObject(wallWidthLarge,307,61);
        WallWidthLarge wallWidthLarge2 = new WallWidthLarge();
        addObject(wallWidthLarge2,311,550);
        wallWidthLarge2.setLocation(340,552);
        wallWidthLarge2.setLocation(315,543);
        WallHeightLarge wallHeightLarge = new WallHeightLarge();
        addObject(wallHeightLarge,61,184);
        wallHeightLarge.setLocation(70,271);
        wallHeightLarge.setLocation(72,277);
        WallHeightLarge wallHeightLarge2 = new WallHeightLarge();
        addObject(wallHeightLarge2,577,263);
        wallHeightLarge2.setLocation(555,326);
        WallHeightSmall wallHeightSmall = new WallHeightSmall();
        addObject(wallHeightSmall,215,420);
        WallHeightSmall wallHeightSmall2 = new WallHeightSmall();
        addObject(wallHeightSmall2,218,322);
        wallHeightSmall2.setLocation(215,324);
        wallHeightSmall2.setLocation(221,328);
        wallHeightSmall2.setLocation(220,328);
        WallHeightSmall wallHeightSmall3 = new WallHeightSmall();
        addObject(wallHeightSmall3,117,467);
        wallHeightSmall3.setLocation(119,473);
        WallHeightSmall wallHeightSmall4 = new WallHeightSmall();
        addObject(wallHeightSmall4,407,476);
        WallHeightSmall wallHeightSmall5 = new WallHeightSmall();
        addObject(wallHeightSmall5,454,474);
        WallHeightSmall wallHeightSmall6 = new WallHeightSmall();
        addObject(wallHeightSmall6,503,520);
        WallHeightSmall wallHeightSmall7 = new WallHeightSmall();
        addObject(wallHeightSmall7,359,526);
        WallHeightSmall wallHeightSmall8 = new WallHeightSmall();
        addObject(wallHeightSmall8,354,430);
        wallHeightSmall8.setLocation(366,424);
        wallHeightSmall8.setLocation(360,421);
        wallWidthMedium11.setLocation(410,395);
        WallHeightSmall wallHeightSmall9 = new WallHeightSmall();
        addObject(wallHeightSmall9,306,424);
        wallHeightSmall9.setLocation(313,425);
        WallHeightSmall wallHeightSmall10 = new WallHeightSmall();
        addObject(wallHeightSmall10,455,237);
        wallHeightSmall10.setLocation(456,225);
        wallHeightSmall10.setLocation(454,232);
        WallHeightSmall wallHeightSmall11 = new WallHeightSmall();
        addObject(wallHeightSmall11,505,185);
        WallHeightSmall wallHeightSmall12 = new WallHeightSmall();
        addObject(wallHeightSmall12,408,189);
        wallHeightSmall12.setLocation(411,176);
        WallHeightSmall wallHeightSmall13 = new WallHeightSmall();
        addObject(wallHeightSmall13,361,141);
        wallHeightSmall13.setLocation(365,125);
        wallHeightSmall13.setLocation(365,134);
        WallHeightSmall wallHeightSmall14 = new WallHeightSmall();
        addObject(wallHeightSmall14,411,95);
        wallHeightSmall14.setLocation(410,74);
        wallHeightSmall14.setLocation(412,89);
        WallHeightSmall wallHeightSmall15 = new WallHeightSmall();
        addObject(wallHeightSmall15,311,96);
        wallHeightSmall15.setLocation(312,87);
        WallHeightSmall wallHeightSmall16 = new WallHeightSmall();
        addObject(wallHeightSmall16,216,96);
        wallHeightSmall16.setLocation(215,82);
        WallHeightSmall wallHeightSmall17 = new WallHeightSmall();
        addObject(wallHeightSmall17,264,140);
        WallHeightSmall wallHeightSmall18 = new WallHeightSmall();
        addObject(wallHeightSmall18,170,138);
        WallHeightSmall wallHeightSmall19 = new WallHeightSmall();
        addObject(wallHeightSmall19,215,187);
        WallHeightSmall wallHeightSmall20 = new WallHeightSmall();
        addObject(wallHeightSmall20,164,241);
        wallHeightSmall20.setLocation(167,226);

        addObject(wallHeightMedium,507,355);
        wallHeightMedium.setLocation(501,345);
        wallHeightMedium.setLocation(504,352);
        WallHeightMedium wallHeightMedium2 = new WallHeightMedium();
        addObject(wallHeightMedium2,456,348);
        wallHeightMedium2.setLocation(458,350);
        WallHeightMedium wallHeightMedium3 = new WallHeightMedium();
        addObject(wallHeightMedium3,407,307);
        wallHeightMedium3.setLocation(408,301);
        WallHeightMedium wallHeightMedium4 = new WallHeightMedium();
        addObject(wallHeightMedium4,309,222);
        wallHeightMedium4.setLocation(313,203);
        WallHeightMedium wallHeightMedium5 = new WallHeightMedium();
        addObject(wallHeightMedium5,261,304);
        WallHeightMedium wallHeightMedium6 = new WallHeightMedium();
        addObject(wallHeightMedium6,264,453);
        wallHeightMedium6.setLocation(262,439);
        wallHeightMedium6.setLocation(263,447);
        WallHeightMedium wallHeightMedium7 = new WallHeightMedium();
        addObject(wallHeightMedium7,118,304);
        wallHeightMedium7.setLocation(118,306);
        WallHeightMedium wallHeightMedium8 = new WallHeightMedium();
        addObject(wallHeightMedium8,117,184);
        wallHeightMedium8.setLocation(120,154);
        WallHeightMedium wallHeightMedium9 = new WallHeightMedium();
        addObject(wallHeightMedium9,360,271);
        wallHeightMedium9.setLocation(360,250);
        wallHeightSmall2.setLocation(215,305);
        WallWidthMedium wallWidthMedium12 = new WallWidthMedium();
        addObject(wallWidthMedium12,215,305);
        WallWidthSmall wallWidthSmall15 = new WallWidthSmall();
        addObject(wallWidthSmall15,286,254);
        WallWidthSmall wallWidthSmall16 = new WallWidthSmall();
        addObject(wallWidthSmall16,143,203);
        WallWidthSmall wallWidthSmall17 = new WallWidthSmall();
        addObject(wallWidthSmall17,485,206);
        WallWidthSmall wallWidthSmall18 = new WallWidthSmall();
        addObject(wallWidthSmall18,441,160);
        wallWidthSmall18.setLocation(440,158);
        WallHeightSmall wallHeightSmall21 = new WallHeightSmall();
        addObject(wallHeightSmall21,215,335);
        wallHeightSmall2.setLocation(218,327);
        wallHeightSmall2.setLocation(214,326);
        wallHeightSmall2.setLocation(217,325);
        Bear bear = new Bear();
        addObject(bear,83,516);
        bear.setLocation(78,520);
        Lemon lemon = new Lemon();
        addObject(lemon,528,510);
        Lemon lemon2 = new Lemon();
        addObject(lemon2,96,87);
        Lemon lemon3 = new Lemon();
        addObject(lemon3,529,319);
        Lemon lemon4 = new Lemon();
        addObject(lemon4,381,177);
        Lemon lemon5 = new Lemon();
        addObject(lemon5,482,228);
        Lemon lemon6 = new Lemon();
        addObject(lemon6,91,140);
        lemon6.setLocation(94,140);
        lemon4.setLocation(382,177);
        lemon5.setLocation(482,223);
        lemon.setLocation(526,514);
        Teleporter teleporter = new Teleporter();
        addObject(teleporter,527,188);
        Teleporter teleporter2 = new Teleporter();
        addObject(teleporter2,135,230);
        Enemy enemy = new Enemy();
        addObject(enemy,Greenfoot.getRandomNumber(560),Greenfoot.getRandomNumber(544));
        Enemy enemy2 = new Enemy();
        addObject(enemy2,Greenfoot.getRandomNumber(560),Greenfoot.getRandomNumber(544));
        MoveEnemy moveEnemy = new MoveEnemy();
        addObject(moveEnemy,386,525);
        MoveEnemy moveEnemy2 = new MoveEnemy();
        addObject(moveEnemy2,98,372);
        MoveEnemy moveEnemy3 = new MoveEnemy();
        addObject(moveEnemy3,244,523);
        MoveEnemy moveEnemy4 = new MoveEnemy();
        addObject(moveEnemy4,287,229);
        MoveEnemy moveEnemy5 = new MoveEnemy();
        addObject(moveEnemy5,434,230);
        moveEnemy.setLocation(390,421);
        moveEnemy3.setLocation(317,521);
        moveEnemy5.setLocation(395,131);
        moveEnemy2.setLocation(96,378);
        moveEnemy2.setLocation(216,378);
        WinTent winTent = new WinTent();
        addObject(winTent,568,75);
        winTent.setLocation(560,87);
        winTent.setLocation(558,78);
    }

    public void act(){
        time++;
        if (time % 180 == 0){
            addObject(new Enemy(),Greenfoot.getRandomNumber(560),Greenfoot.getRandomNumber(544));
        }
    }
}
