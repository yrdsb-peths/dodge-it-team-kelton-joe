import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class SlowBalloon extends Actor
{
    public void act() {
        move(-3);
            
        if (getX() <= 0) {
            resetBalloon();
        }
        if (isTouching(Hero.class)) {
            SadFace sadFace = new SadFace();
            getWorld().addObject(sadFace, 300, 200);
            getWorld().removeObject(this);
        }
    }

    public void resetBalloon() {
        int num = Greenfoot.getRandomNumber(4);
        setLocation(600, (num+1)*100);
    }
}
