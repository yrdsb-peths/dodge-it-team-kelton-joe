import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Hero extends Actor
{
    private static final int startSpeed = 5;
    private static int speed = startSpeed;
    private final int maxSpeed = 12;
    private static double realSpeed = startSpeed;
    
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
        realSpeed += 0.5f;
        speed = (int)(realSpeed + 0.5);
    }
    
    public static void resetSpeed() {
        speed = startSpeed;
        realSpeed = startSpeed;
    }
}
