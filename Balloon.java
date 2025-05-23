import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Balloon extends Actor
{
    public Balloon() {
        setImage("images/balloon3.png");
    }
    
    private int speed = -7;
    private final int maxSpeed = -15;
    
    public void act() {
        if (speed <= maxSpeed) {
            speed = maxSpeed;
        }
        
        if (!(MyWorld.isStopped)) {
            move(speed);
        }
            
        if (getX() <= 0) {
            resetBalloon();
            MyWorld.gameScore++;
            getWorld().showText(Integer.toString(MyWorld.gameScore), 25, 25);
        }
        
        if (isTouching(Hero.class)) {
            SadFace sadFace = new SadFace();
            getWorld().addObject(sadFace, 300, 200);
            getWorld().removeObject(this);
            MyWorld.stop();
        }
    }

    public void resetBalloon() {
        int num = Greenfoot.getRandomNumber(8);
        setLocation(600, (num+1)*50);
        speed--;
        Hero.incrementSpeed();
    }
}
