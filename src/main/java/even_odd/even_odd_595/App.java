package even_odd.even_odd_595;
import java.util.*;
import java.util.Random;
/**
 * Hello world!
 *
 */
public class App

{
    public static void main(String[] args)

    {
        Random rand = new Random(); //instance of random class
        int upperbound = 100;
        int x = rand.nextInt(upperbound); 
        if(x% 2 == 0)
        {

            System.out.println("The given number "+x+" is Even ");
        }
        else
        {
            System.out.println("The given number "+x+" is Odd ");
  }
    }
}

