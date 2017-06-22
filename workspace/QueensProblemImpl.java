import java.util.Scanner;

public class QueensProblemImpl 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string :");
		String input = in.nextLine();
		if(input==" ")
			System.out.println("Invalid input !, Please run program with valid input");
		int n = Integer.parseInt(input);
		int board[][] = new int[n][n];
		Queen qu = new Queen(n);
		qu.QP1(board, 0, 0, n);
		in.close();

	}

}
