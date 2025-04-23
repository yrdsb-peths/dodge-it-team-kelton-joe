import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Balloon extends Actor
{
    private int speed = -7;
    
    public void act() {
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
        int num = Greenfoot.getRandomNumber(8);
        setLocation(600, (num+1)*50);
        speed--;
    }
}
