// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class GameWonWorld extends World
{

    /**
     * Constructor for objects of class GameWonWorld.
     */
    public GameWonWorld()
    {
        super(560, 560, 1);
        showTextWithBigOrangeFont("You win!", 180, 200);
    }

    /**
     * 
     */
    public void showTextWithBigOrangeFont(String message, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font =  new Font(50);
        bg.setFont(font);
        bg.setColor(Color.ORANGE);
        bg.drawString(message, x, y);
    }
}
