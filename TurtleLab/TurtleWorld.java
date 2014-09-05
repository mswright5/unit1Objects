import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
        throws InterruptedException
    {
        World turtleWorld = new World();
        Turtle turtle1 = new Turtle(turtleWorld);
        //Picture picture = new Picture("internet_troll.png");
        //turtle1.setPicture(Picture picture);
        turtle1.setPenColor(Color.RED);
        turtle1.penDown();
        Thread.sleep(1000);
        turtle1.forward(50);
        turtle1.turnLeft();
        Thread.sleep(1000);
        turtle1.forward(50);
        Thread.sleep(1000);
        turtle1.turn(45.0);
    }
}
