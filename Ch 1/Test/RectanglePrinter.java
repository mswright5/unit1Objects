import java.awt.Rectangle;

public class RectanglePrinter
{
   public static void main(String[] args)
   {
      Rectangle r1 = new Rectangle(0, 0, 100, 50);
      Rectangle r2 = r1;
      r2.grow(10, 20);
      /* Your code goes here */
      System.out.println(r1);
      /* and here */
      System.out.println(r2);
   }
}