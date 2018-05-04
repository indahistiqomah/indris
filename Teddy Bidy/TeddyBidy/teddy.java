import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class teddy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class teddy extends Actor
{
    /**
     * Act - do whatever the teddy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public teddy()
    {
        GreenfootImage img=getImage();
        img.scale(img.getWidth(),img.getHeight()+5);
        setImage(img);
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
