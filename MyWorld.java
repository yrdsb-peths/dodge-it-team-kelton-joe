import greenfoot.*;

public class MyWorld extends World {
    public static boolean isStopped = false;
    public static int gameScore = 0;
    
    public MyWorld() {
        super(600, 400, 1);
        setBackground("images/bluerock.jpg");
        start();
    }
    
    public void act() {
        if (Greenfoot.isKeyDown("r") && isStopped) {
            removeObjects(getObjects(null));
            start();
        }
    }
    
    public void start() {
        isStopped = false;
        gameScore = 0;
        this.showText(Integer.toString(MyWorld.gameScore), 25, 25);
        
        Hero hero = new Hero();
        int randomSpawn = Greenfoot.getRandomNumber(8);
        addObject(hero, 100, (randomSpawn+1)*50);
        Hero.resetSpeed();
        
        Balloon balloon = new Balloon();
        addObject(balloon, 600, 100);
        
        SlowBalloon slowBalloon = new SlowBalloon();
        addObject(slowBalloon, 600, 300);
    }
    
    public static void stop() {
        isStopped = true;
    }
}
