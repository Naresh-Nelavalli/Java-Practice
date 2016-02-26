import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Lab5h {
	
	public static void main (String[] args) throws FileNotFoundException
	   {
		int x,y=0;
		int sum=0;
		double average = 0;
		int [] cArray = new int[10];
		int count = 0;
		long count1 =0;
		 Scanner inFile1 = new Scanner(new File("C:\\Users\\Naresh\\workspace\\GPA\\src\\Infile.txt"));
		 x=inFile1.nextInt();
		 y=inFile1.nextInt();
		 int[][] table=new int[x][y];
		 		 
	      for (int row=0; row < table.length; row++)
	          for (int col=0; col < table[row].length; col++){
		   table[row][col]=    Integer.parseInt(inFile1.next());
	          }
	     
	       inFile1.close();
	    
	      System.out.print("#");
	  	 System.out.print("    |");
	  	 
	       System.out.println("   0         1       2       3       4       5       6       7       8       9       Sum    Average");
	     
	       
	       System.out.println("-----+---------------------------------------------------------------------------------------------------");
		    
	      
	      
	      for (int row=0; row < table.length; row++){
	    	  System.out.print(row+" ");
	    	  System.out.print("   |");
	    	  sum = 0;
	    	  average = 0;
	          for (int col=0; col < table[row].length; col++)
	          {
	        	  sum+=table[row][col];
	        	  
	        	  count1+=table[row][col];
	          	  System.out.print("  " +table[row][col]+"\t");
	              int tm = count%10;
	              count = count + 1;
	              cArray[tm]+=table[row][col];
	          }
	          System.out.print("    " + sum);
	          average=sum/10;
	          System.out.print("    " + average);
	          System.out.println();
	          }
	      
	      System.out.println("------+---------------------------------------------------------------------------------------------------");
	      System.out.print("Sum   |");
	      for(int i =0;i<10;i++)
	    	  System.out.print( "    " + cArray[i]);
	      System.out.println();
	      System.out.print("Avg   |");
	      for(int i =0;i<10;i++)
	    	  System.out.print( "   " + cArray[i]/10.0);
	      
	      int sum1 = 0;
	      for(int i = 0; i < table.length;i++)
	    	  sum1 = sum1 + table[i][0];
	      System.out.println();
	      System.out.println("Final Average : " +count1/1000.0);
	   }
}
