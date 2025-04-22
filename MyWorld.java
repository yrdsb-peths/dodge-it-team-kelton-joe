import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        start();
    }
    
    public void start() {
        Hero hero = new Hero();
        addObject(hero, 100, 100);
        
        Balloon balloon = new Balloon();
        addObject(balloon, 600, 100);
        
        SlowBalloon slowBalloon = new SlowBalloon();
        addObject(slowBalloon, 600, 300);
    }
}
