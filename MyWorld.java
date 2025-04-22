import greenfoot.*;

public class MyWorld extends World {
    public static boolean isStopped = false;
    
    public MyWorld() {
        super(600, 400, 1);
        start();
    }
    
    public void act() {
        if (Greenfoot.mouseClicked(null) && isStopped) {
            removeObjects(getObjects(null));
            start();
        }
    }
    
    public void start() {
        isStopped = false;
        
        Hero hero = new Hero();
        addObject(hero, 100, 100);
        
        Balloon balloon = new Balloon();
        addObject(balloon, 600, 100);
        
        SlowBalloon slowBalloon = new SlowBalloon();
        addObject(slowBalloon, 600, 300);
    }
    
    public static void stop() {
        isStopped = true;
    }
}
