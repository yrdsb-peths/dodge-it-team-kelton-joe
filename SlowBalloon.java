import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class SlowBalloon extends Actor
{
    private int speed = -3;
    private final int maxSpeed = -12;
    
    public void act() {
        if (speed <= maxSpeed) {
            speed = maxSpeed;
        }
        move(speed);
            
        if (getX() <= 0) {
            resetBalloon();
        }
        if (isTouching(Hero.class)) {
            SadFace sadFace = new SadFace();
            getWorld().addObject(sadFace, 300, 200);
            getWorld().removeObject(this);
            MyWorld.stop();
        }
    }

    public void resetBalloon() {
        int num = Greenfoot.getRandomNumber(4);
        setLocation(600, (num+1)*100);
        speed--;
    }
}
