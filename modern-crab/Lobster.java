// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Lobster extends Actor
{

    /**
     * 
     */
    public Lobster()
    {
        turn(Greenfoot.getRandomNumber(360));
    }

    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAround();
        eat();
        zombify();
        
        if (isGameLost()) {
            transitionToGameOverWorld();
        }
    }

    /**
     * 
     */
    public void moveAround()
    {
        move(4);
        if (Greenfoot.getRandomNumber(10) == 1) {
            turn(Greenfoot.getRandomNumber(90) - 45);
        }
        if (isAtEdge()) {
            turn(180);
        }
    }

    /**
     * 
     */
    public void eat()
    {
        Actor crab = getOneIntersectingObject(Crab.class);
        if (crab != null) {
            World world = getWorld();
            world.removeObject(crab);
            Greenfoot.playSound("youdied.wav");
        }
    }

    /**
     * 
     */
    public void zombify()
    {
        Actor worm = getOneIntersectingObject(Worm.class);
        if (worm != null) {
            int wormX = worm.getX();
            int wormY = worm.getY();
            World world = getWorld();
            world.removeObject(worm);
            Lobster newLobster =  new  Lobster();
            world.addObject(newLobster, wormX, wormY);
        }
    }

    /**
     * 
     */
    public boolean isGameLost()
    {
        World world = getWorld();
        if (world.getObjects(Crab.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * 
     */
    public void transitionToGameOverWorld()
    {
        World gameOverWorld =  new  GameOverWorld();
        Greenfoot.setWorld(gameOverWorld);
    }
}
