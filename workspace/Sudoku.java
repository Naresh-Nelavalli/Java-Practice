import java.util.Scanner;

public class Sudoku 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string separated by ,:");
		String input = in.nextLine();
		if(input==" ")
			System.out.println("Invalid input !, Please run program with valid input");
		String[] inputArray = input.split(",");

		int board[][] = new int[9][9];
		int  t =0;
		for(int i = 0;i<9;i++)
		{
			for(int j=0;j<9;j++)
			{
				
				board[j][i] = Integer.parseInt(inputArray[t]);
				t=t+1;
			}
		}
		SudokuImpl si = new SudokuImpl(9);
		si.solveSudoku(board,0,0);
		in.close();

	}
}
