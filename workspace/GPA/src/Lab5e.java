import java.util.Scanner;


class Lab5e
{
    public static void main(String[] args)
    {
        int[] anArray;  // declares an array of integers
        anArray = new int[100];
        Scanner scan = new Scanner(System.in);
        int value = scan.nextInt();

        for(int t =0;t<6;t++)
        {
        	anArray[t]=value;
        	value = scan.nextInt();
        	      	
        }
        
        scan.close();
        for(int t =0;t<5;t++)
        {
        	//value = scan.nextInt();
        	System.out.println(anArray[t]);
        	
        }
     
     }
}

