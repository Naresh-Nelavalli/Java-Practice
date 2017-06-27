
public class SudokuImpl 
{
	int size=0;
	
	SudokuImpl(int a)
	{
		size =a;
	}
	
	public void solveSudoku(int[][] board, int row, int col )
	{
		if(solveSudoku1(board,0,0))
		{
			for(int i=0;i<size;i++)
			{
				for(int j=0;j<size;j++)
				{
					System.out.print(board[i][j] + "|");
				}
				System.out.println( " ");
			}
		}
		else
		{
			System.out.println("Stupid !!, You wasted my time. Sudoku can't be solved !!");
		}
	}
	
	public boolean solveSudoku1(int[][] board, int row, int col )
	{
		if(row == size-1 && col == size-1)
		{
			return true;
		}

		else
		{
			for(int i= row;i<size;i++)
			{
				
				for(int j= 0;j<size;j++)
				{
					if(board[i][j] == 0 )
					{
						for(int t= 1;t<size+1;t++)
						{
							if(numFeasability(board,i,j,t))
							{
								board[i][j] = t;
								if(solveSudoku1(board, i, j+1 ))
								{
									return true;
								}
								else
								{
									board[i][j] = 0;
								}

							}
						}
					}
					if(board[i][j]==0)
						return false;
				}
			}
		}
		return true;
	}


	private boolean numFeasability(int[][] board, int row, int col, int t) 
	{
		if(!columnsCheck(board,row,col,t))
			return false;
		else if(!rowsCheck(board,row,col,t))
			return false;
		else if(!localSquareCheck(board,row,col,t))
			return false;
		else
			return true;
	}
	
	private boolean localSquareCheck(int[][] board, int row, int col, int t) 
	{
		int x = row -(row%3);
		int y = col - (col%3);
		for(int i=x;i<x+3;i++)
		{
			for(int j=y;j<y+3;j++)
			{
				if(board[i][j] == t)
				{
					return false;
				}
			}
		}
		
		return true;
	}
	private boolean rowsCheck(int[][] board, int row, int col, int t) 
	{
		for(int i = 0; i<size;i++)
		{
			if(board[row][i] == t)
			{
				return false;
			}
		}
		return true;
	}
	private boolean columnsCheck(int[][] board, int row, int col, int t) 
	{
		for(int i = 0; i<size;i++)
		{
			if(board[i][col] == t)
			{
				return false;
			}
		}
		return true;
	}

}
