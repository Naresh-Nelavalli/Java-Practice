//********************************************************************
//  TwoDArray.java
//
//  Demonstrates the use of a two-dimensional array.
//********************************************************************

public class Lab5f
{
   //-----------------------------------------------------------------
   //  Creates a 2D array of integers, fills it with increasing
   //  integer values, then prints them out.
   //-----------------------------------------------------------------
	//-----------------------------------------------------------------
	public static void main (String[] args)
	{
	  int[][] table = new int[5][6];
	  String s = "----------------------------------------------------------------------------------------------------------------------------------------";
	  // Load the table with values
	for (int row=0; row < table.length; row++)
			for (int col=0; col < table[row].length; col++)
					table[row][col] = row * 10 + col;
	  
	  // Print the table
	  for (int row=0; row < table.length; row++)
	  {
		  if(row == 0) {
	 		 System.out.print("#  |\t");
	 		 for(int i = 0; i<table[0].length; i++)
	 		 System.out.print(i + "\t");
	 		 System.out.println();
	 		System.out.println("---+" + s.substring(0, 8*table[0].length));
	 	 }

	     for (int col=0; col < table[row].length; col++) { 
	         if (col == 0)
	        	 System.out.print(row+"  |\t");
	    	 System.out.print (table[row][col] + "\t");
	     }
	     System.out.println();
	  }
	}}