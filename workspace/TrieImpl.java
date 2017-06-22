import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class TrieImpl 
{
	final Trie root = new Trie();
	List<String> wordsWithPrefix1 = new ArrayList<String>();

	public void addNewWord(String newWord)
	{
		Trie tillNow = new Trie();
		tillNow = addNewCharaterToTrie(newWord.charAt(0),root);

		for(int i = 1;i < newWord.length();i++)
		{
			tillNow = addNewCharaterToTrie(newWord.charAt(i),tillNow);
		}
		tillNow.isWord = true;
	}

	public Trie addNewCharaterToTrie(Character cha, Trie tillNow)
	{
		if(tillNow.CharacterSet.containsKey(cha))
		{
			return tillNow.CharacterSet.get(cha);
		}
		else
		{
			Trie newNode = new Trie();
			tillNow.CharacterSet.put(cha, newNode);
			return newNode;
		}

	}

	public List<String>  findWordsWithPrefix(String prefixInput)
	{
		Trie parseTrie = null;
		wordsWithPrefix1.clear();
		parseTrie = checkPrefixLocation(prefixInput);
		getWordsListFromNode(parseTrie,prefixInput);
		for(String word:wordsWithPrefix1)
		{
			System.out.println(word);
		}
		return wordsWithPrefix1;

	}

	public Trie checkPrefixLocation(String prefixInput)
	{
		Trie parseTrie = root;
		for(int i = 0;i < prefixInput.length();i++)
		{
			if(parseTrie.CharacterSet.containsKey(prefixInput.charAt(i)))
			{
				parseTrie = parseTrie.CharacterSet.get(prefixInput.charAt(i));				
			}
			else
			{
				return null;
			}
		}
		return parseTrie;
	}

	public void getWordsListFromNode(Trie currentNode, String output)
	{
		try
		{
			Set<Character> chars = currentNode.CharacterSet.keySet();
			if(chars.isEmpty())
			{
				wordsWithPrefix1.add(output);
				return;
			}
			else if(currentNode.isWord)
			{
				wordsWithPrefix1.add(output);
			}
			for(Character c : chars)
			{
				String out = output + c;
				getWordsListFromNode(currentNode.CharacterSet.get(c),out);

			}
		}
		catch(Exception ex)
		{
			System.out.println("Hard Luck, nothing found !! ");
		}

	}

}
