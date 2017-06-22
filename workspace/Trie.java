import java.util.HashMap;
import java.util.Map;

public class Trie 
{
	Map<Character, Trie> CharacterSet;
	boolean isWord;
	Trie()
	{
		CharacterSet = new HashMap<Character, Trie>();
		isWord = false;
	}

}
