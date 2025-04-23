import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Hero extends Actor
{
    private static int speed = 5;
    private final int maxSpeed = 8;
    
    public Hero() {
        setImage("images/tux.png");
    }
    public void act()
    {
        if (speed > maxSpeed) {
            speed = maxSpeed;
        }
        
        if (MyWorld.isStopped == false) {
            if (Greenfoot.isKeyDown("w")) {
                setLocation(getX(), getY() - speed);
            }
            if (Greenfoot.isKeyDown("s")) {
                setLocation(getX(), getY() + speed);
            }
        }
    }
    
    public static void incrementSpeed() {
        speed++;
    }
}
