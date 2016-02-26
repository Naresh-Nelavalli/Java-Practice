
public class Die {
	 private final int MAX = 6;  // maximum face value

	   private int faceValue;  // current value showing on the die

	   //-----------------------------------------------------------------
	   //  Constructor: Sets the initial face value.
	   //-----------------------------------------------------------------
	   public Die()
	   {
	      faceValue = 1;
	   }

	   //-----------------------------------------------------------------
	   //  Rolls the die and returns the result.
	   //-----------------------------------------------------------------
	   public int roll()
	   {
	      faceValue = (int)(Math.random() * MAX) + 1;

	      return faceValue;
	   }

	   //-----------------------------------------------------------------
	   //  Face value mutator.
	   //-----------------------------------------------------------------
	   public void setFaceValue(int value)
	   {
	      faceValue = value;
	   }

	   //-----------------------------------------------------------------
	   //  Face value accessor.
	   //-----------------------------------------------------------------
	   public int getFaceValue()
	   {
	      return faceValue;
	   }
	   
	   //-----------------------------------------------------------------
	   //  Just add a value and round it in a circular way   
	   //-----------------------------------------------------------------
	   public void nudge()
	   {
	      int newFaceValue = faceValue + 1;
	      if (newFaceValue != 6)
	      {
	      newFaceValue%=6;
	      }
	      else
	      {
	    	  newFaceValue =6;
	      }
	      String myOldValue = this.toString();
	      System.out.println( "Value before " + myOldValue + ":" + "Value After Nudge :"+newFaceValue);
	      
	   }
	   
	   

	   //-----------------------------------------------------------------
	   //  Returns a string representation of this die.
	   //-----------------------------------------------------------------
	   public String toString()
	   {
	      String result = " " + faceValue + " ";
	      String result1 = "+---+" + "\n" + "| " + faceValue + " |" + "\n" + "+---+"; 
	      System.out.println(result1);
	      return result;
	   }

}
