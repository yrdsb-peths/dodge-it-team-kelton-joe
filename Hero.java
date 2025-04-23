import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Hero extends Actor
{
    public Hero() {
        setImage("images/tux.png");
    }
    public void act()
    {
        if (MyWorld.isStopped == false) {
            if (Greenfoot.isKeyDown("w")) {
                setLocation(getX(), getY() - 5);
            }
            if (Greenfoot.isKeyDown("s")) {
                setLocation(getX(), getY() + 5);
            }
        }
    }
}
