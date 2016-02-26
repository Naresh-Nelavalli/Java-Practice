import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

/**
 * Plays the High-Low guessing game.
 * 
 * @author Rephactor Java
 * @version 1.0
 */
public class HighLowGame
{
    /**
     * Chooses a random number for the user to guess. Accepts guesses repeatedly, informing the
     * user whether the guess was high or low.
     * 
     * @param args unused
     */
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random generator = new Random();
        System.out.println("Please enter the minimum value to begin the Game:");
        int min =0;
        int max=0;
        min = in.nextInt();
        System.out.println("Please enter the maximum value :");
        max = in.nextInt();
        int target = generator.nextInt(max-min)+ min;
        int guess = -999;  // initial value out of range
        int count = 0;
        int sum=0; double average=0;
        String guess1=null;
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        
        System.out.println("I've chosen a number between " + min + "and " + max + ". " );
        
        while (guess != target)
        {
            System.out.print("Guess what it is: ");
            //guess = in.nextInt();
            try {
    			guess1 = br.readLine();
    		} catch (IOException e1) {
    			// TODO Auto-generated catch block
    			e1.printStackTrace();
    		}
            System.out.println(guess1);
            
            if(guess1.equals("Hint"))
            {
            	System.out.println("Use Binary Search Trick, Try to guess middle number always:");
            	continue;
            }
            else
            {
            	guess= Integer.parseInt(guess1);
            
            	count++;
            	sum+=guess;
            	average = sum /count ;

            if (guess < target)
                System.out.println("Too low!");
            else if (guess > target)
                System.out.println("Too high!");
            else
            {
                System.out.println("That's it! You got it in " + count + " guesses.");
                System.out.println("Your average for your guess  " + average + ".");
            }
            }
        }

        System.out.println("Thanks for playing.");
    }
}