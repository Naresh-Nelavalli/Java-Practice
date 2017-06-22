import java.util.Scanner;

public class Subsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string :");
		String input = in.nextLine();
		if(input==" ")
			System.out.println("Invalid input !, Please run program with valid input");
		performsetSubsets(input," ");
		in.close();

	}
	
	public static void performsetSubsets(String input, String result)
	{
		if (input.equals(""))
		{
			System.out.println(result);
		}
		else
		{
			String lp = input.substring(1);
			String fp = input.substring(0, 1);
			String out = result + fp;
			performsetSubsets(lp,result);
			performsetSubsets(lp,out);
		}
		
	}

}


