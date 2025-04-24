import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class SlowBalloon extends Actor
{
    public SlowBalloon() {
        setImage("images/balloon1.png");
    }
    private int speed = -3;
    private final int maxSpeed = -12;
    
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
        int num = Greenfoot.getRandomNumber(4);
        setLocation(600, (num+1)*100);
        speed--;
        Hero.incrementSpeed();
    }
}
