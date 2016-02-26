
public class RollingDice {
	
	
	   //-----------------------------------------------------------------
	   //  Creates two Die objects and rolls them several times.
	   //-----------------------------------------------------------------
	   public static void main (String[] args)
	   {
	      Die die1, die2, die3;
	      int sum;

	      die1 = new Die();
	      die2 = new Die();
	      die3 = new Die();

	      die1.roll();
	      die2.roll();
	      die3.roll();
	      System.out.println ("Die One: " + die1 + ", Die Two: " + die2 + ", Die Three: " + die3);
	      die3.toString();

	      die1.roll();
	      die2.setFaceValue(4);
	      die3.roll();
	      System.out.println ("Die One: " + die1 + ", Die Two: " + die2 + ", Die Three: " + die3);

	      sum = die1.getFaceValue() + die2.getFaceValue() + die3.getFaceValue();
	      System.out.println ("Sum: " + sum);

	      sum = die1.roll() + die2.roll() + die3.roll();
	      System.out.println ("Die One: " + die1 + ", Die Two: " + die2 + ", Die Three: " + die3);
	      System.out.println ("New sum: " + sum);
	      
	      System.out.println("Display After nudge -----");
	      die3.nudge();
	      die2.nudge();
	      die1.nudge();
	   }
	}


