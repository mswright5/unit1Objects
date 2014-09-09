import java.awt.Color;

//Creates a new visible turtle that will draw a diagram on the window
public class TurtleWorld
{
    public static void main(String args[])
        throws InterruptedException
    {
        World turtleWorld = new World();
        //Turtle turtle1 = new Turtle(turtleWorld);
       // Turtle turtle2 = new Turtle(turtleWorld);
        /* unknown code
        Picture picture = new Picture("internet_troll.png");
        turtle1.setPicture(Picture picture);
        */
       //Start Your Engines!
        /*turtle1.setPenColor(Color.RED);
        turtle1.penDown();
        turtle2.setPenColor(Color.BLACK);
        turtle2.penDown();
        Thread.sleep(1000);
        //First legs
        turtle1.turn(-20.0);
        turtle1.forward(50);
        turtle2.turn(70);
        turtle2.forward(50);
        Thread.sleep(1000);
        
        turtle1.turn(-140);
        turtle1.forward(50);
        turtle2.turn(140);
        turtle2.forward(50);
        Thread.sleep(1000);
        
        turtle1.setPenColor(Color.GREEN);
        turtle2.setPenColor(Color.ORANGE);
        turtle1.turnRight();
        turtle1.forward(50);
        turtle2.turn(-40);
        turtle2.forward(50);
        Thread.sleep(1000);
        
        turtle1.turn(-150);
        turtle1.forward(60);
        turtle2.turn(140);
        turtle2.forward(60);
        Thread.sleep(1000);
        
        turtle1.setColor(Color.BLUE);
        turtle1.turn(60);
        turtle1.forward(50);
        
        turtle2.setColor(Color.BLUE);
        turtle2.turnLeft();
        turtle2.forward(60);
        Thread.sleep(1000);*/
        
        
        //Different Diagram
        Turtle turtle3 = new Turtle(200, 100, turtleWorld);
        Turtle turtle4 = new Turtle(200, 100, turtleWorld);
        Turtle turtle5 = new Turtle(200, 100, turtleWorld);
        Turtle turtle6 = new Turtle(200, 100, turtleWorld);
        turtle4.turnLeft();
        turtle5.turn(180);
        turtle6.turn(90);
        Thread.sleep(1000);
        
        //Calling the handy dandy "move the turtles forward" method to make it look nice
        //I also just wanted to make a method
        TurtleWorld.move(turtle3, turtle4, turtle5, turtle6, 50);
        Thread.sleep(1000);
        
        TurtleWorld.turn(turtle3, turtle4, turtle5, turtle6);
        TurtleWorld.move(turtle3, turtle4, turtle5, turtle6, 50);
        
        TurtleWorld.turn(turtle3, turtle4, turtle5, turtle6);
        TurtleWorld.move(turtle3, turtle4, turtle5, turtle6, 50);
        
        turtle3.turn(-45);
        turtle4.turn(-45);
        turtle5.turn(-45);
        turtle6.turn(-45);
        
        Thread.sleep(1000);
        
        TurtleWorld.move(turtle3, turtle4, turtle5, turtle6, 60);
        TurtleWorld.move(turtle3, turtle4, turtle5, turtle6, 47);
        
        TurtleWorld.turn(turtle3, turtle4, turtle5, turtle6);
        TurtleWorld.move(turtle3, turtle4, turtle5, turtle6, 107);
        
        TurtleWorld.turn(turtle3, turtle4, turtle5, turtle6);
        TurtleWorld.move(turtle3, turtle4, turtle5, turtle6, 50);
        
    }
        
    public static void move(Turtle one, Turtle two, Turtle three, Turtle four, int amount)
    {
        one.forward(amount);
        two.forward(amount);
        three.forward(amount);
        four.forward(amount);
    }
    
     public static void turn(Turtle one, Turtle two, Turtle three, Turtle four)
    {
        one.turnLeft();
        two.turnLeft();
        three.turnLeft();
        four.turnLeft();
    }
        
}

