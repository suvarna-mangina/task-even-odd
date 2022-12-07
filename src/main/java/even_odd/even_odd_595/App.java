package even_odd.even_odd_595;
import java.util.*;
import java.util.Random;
public class App
{
	public static void main(String args[])
	{
	
	}
	public void even_odd(int num) {
		Random rand = new Random(); //instance of random class
        int upperbound = 100;
         num = rand.nextInt(upperbound); 
		if(num%2==0) {
			System.out.println(num+" is even");
		}
			else 
		    System.out.println(num+" is odd");
		}
    }
  
