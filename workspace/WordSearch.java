import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordSearch 
{
	Set<String> output = new HashSet<String>();
	public Set<String> findWords(char[][] board, String[] words) 
	{
		TrieImpl ti = new TrieImpl();
		int [][] isVisited = new int[board.length][board.length] ;

		for(String word : words)
		{
			ti.addNewWord(word);
		}
		for(int i =0;i<board.length;i++)
		{
			for(int j=0;j<board.length;j++)
			{
				checkWords(ti, "",i, j,board ,isVisited);
			}
		}

		return output;

	}

	public void checkWords(TrieImpl trie, String soFar, int x, int y, char [][] board,int [][] isVisited )
	{
		if(x >= board.length || y >= board.length ||  x < 0 || y < 0)
		{
			// out of bound // index xception
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
				if(trie.isThataWord(word) && soFar.equals(word))
					output.add(word);
			}
		}
		else
		{
			// None of words starts with that soFar string, so return empty. 
			isVisited[x][y] =0;
			return;
		}
		if( x < board.length -1  )
		{
			checkWords( trie,  soFar,  x +1,  y , board ,isVisited); 
			isVisited[x+1][y] =0;
		}
		if( x>0 )
		{
			checkWords( trie,  soFar,  x - 1,  y, board ,isVisited);
			isVisited[x-1][y] =0;
		}
		if( y < board.length -1 )
		{
			checkWords( trie,  soFar,  x ,  y + 1, board,isVisited );
			isVisited[x][y+1] =0;
		}
		if( y>0 )
		{
			checkWords( trie,  soFar,  x ,  y-1, board ,isVisited);     
			isVisited[x][y-1] =0;

		}

	}
}
