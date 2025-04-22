import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SlowBalloon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SlowBalloon extends Actor
{
    /**
     * Act - do whatever the SlowBalloon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
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
