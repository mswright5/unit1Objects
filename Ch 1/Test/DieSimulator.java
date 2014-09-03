import java.util.Random;

public class DieSimulator
{
    public static void main(String[] args)
    {
        Random rndm = new Random();
        System.out.println(rndm.nextInt(6));
        //System.out.println(rndm);
    }
}
