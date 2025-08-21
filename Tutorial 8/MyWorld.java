import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    Color color;
    Button orange = new Button(Color.ORANGE,this);
    Button red = new Button(Color.RED,this);
    Button black = new Button(Color.BLACK,this);
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 600, 1); 
        getBackground().setColor(Color.GRAY);
        getBackground().fill();
        drawCalendar();
        addButtons();
        
        
    }
    public void drawCalendar(){
        GreenfootImage column = new GreenfootImage(2,600);
        GreenfootImage rows = new GreenfootImage(700,2);
        column.setColor(Color.BLACK);
        rows.setColor(Color.BLACK);
        column.fillRect(0,0,1,599);
        rows.fillRect(0,0,699,1);
        for(int i = 0; i< 6; i++){
            getBackground().drawImage(column,i * 100 +100,100);
            
        }
        for(int i = 0; i< 5; i++){
            
            getBackground().drawImage(rows,0,i * 100 + 100);
        }
        
        getBackground().setColor(Color.GREEN);
        getBackground().fillRect(0,0,699,99);
        GreenfootImage title =new GreenfootImage("December", 90,Color.BLUE, Color.GREEN,Color.YELLOW);
        getBackground().drawImage(title,150,0);
        
        int dayCount = 1;
        for(int week = 0; week <5; week++){
            for(int daysWeek = 0; daysWeek < 7; daysWeek++){
                if(dayCount < 32){
                    showText(""+ dayCount,daysWeek *100 +90,week * 100 +110);
                    addObject(new Days(this),daysWeek *100 + 50,week * 100 +150);
                    dayCount++;
                }
            }
        }
    }
    public void addButtons(){
        addObject(orange, 30,30);
        addObject(red, 60,30);
        addObject(black, 90,30);
    }
}
