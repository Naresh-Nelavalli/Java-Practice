import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordSearch 
{
	Set<String> output = new HashSet<String>();
	TrieImpl trie = new TrieImpl();
	char[][] board ;
	public Set<String> findWords(char[][] board, String[] words) 
	{
		int maxLength = board[0].length;
		this.board = board;

		for(String word : words)
		{
			trie.addNewWord(word);
		}
		for(int i =0;i<board.length;i++)
		{
			for(int j=0;j<board.length;j++)
			{
				int [][] isVisited = new int[board.length][maxLength] ;
				checkWords("",i, j,isVisited);
			}
		}

		return output;

	}

	public void checkWords(String soFar, int x, int y,int [][] isVisited )
	{
				if(x >= board.length || y >= board[x].length ||  x < 0 || y < 0)
		{
			return;
		}
		if(isVisited[x][y] == 1)
			return;
		soFar = soFar + board[x][y];
		isVisited[x][y] =1;
		List<String> wordsWithPrefix = trie.findWordsWithPrefix(soFar);

		if(wordsWithPrefix.size() > 0)
		{
			for(String word:wordsWithPrefix)
			{
				if(word.length() == soFar.length())
				{
					if(trie.isThataWord(word) && soFar.equals(word))
						output.add(word);
				}
			}
		}
		else
		{
			// None of words starts with that soFar string, so return empty. 
			isVisited[x][y] =0;
			return;
		}
		if( x < board.length - 1 )
		{
			if(isVisited[x+1][y]!=1)
			{
				checkWords(soFar,  x +1,  y  ,isVisited); 
				isVisited[x+1][y] =0;
			}
		}
		if( y < board[x].length -1 )
		{
			if(isVisited[x][y+1]!=1)
			{
				checkWords( soFar,  x ,  y + 1,isVisited );
				isVisited[x][y+1] =0;
			}
		}
		if( x>0 )
		{
			if(isVisited[x-1][y]!=1)
			{
				checkWords(soFar,  x - 1,  y ,isVisited);
				isVisited[x-1][y] =0;
			}
		}
		if( y>0 )
		{
			if(isVisited[x][y-1]!=1)
			{
				checkWords(soFar,  x ,  y-1 ,isVisited);     
				isVisited[x][y-1] =0;
			}

		}
	}
}
