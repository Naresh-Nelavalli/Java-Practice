

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class AutoCompleteSentence 
{
	final Trie root = new Trie();
	List<String> wordsWithPrefix1 = new ArrayList<String>();
	List<AutoCompleteResultSet> outputList = new ArrayList<AutoCompleteResultSet>();

	public void addNewWord(String newWord, int count)
	{
		Trie tillNow = new Trie();
		tillNow = addNewCharaterToTrie(newWord.charAt(0),root);

		for(int i = 1;i < newWord.length();i++)
		{
			tillNow = addNewCharaterToTrie(newWord.charAt(i),tillNow);
		}
		tillNow.isWord = true;
		tillNow.count = count;
	}
	
	
	public void addNewWord(String newWord)
	{
		if(newWord.isEmpty())
			return;
		Trie tillNow = new Trie();
		tillNow = addNewCharaterToTrie(newWord.charAt(0),root);

		for(int i = 1;i < newWord.length();i++)
		{
			tillNow = addNewCharaterToTrie(newWord.charAt(i),tillNow);
		}
		tillNow.isWord = true;
		tillNow.count = tillNow.count +1; 
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

	public List<AutoCompleteResultSet>  findWordsWithPrefix(String prefixInput)
	{
		Trie parseTrie = null;
		wordsWithPrefix1.clear();
		outputList.clear();
		parseTrie = checkPrefixLocation(prefixInput);
		getWordsListFromNode(parseTrie,prefixInput);
//		for(String word:wordsWithPrefix1)
//		{
//			System.out.println(word);
//		}
		return outputList;

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
				AutoCompleteResultSet ar = new AutoCompleteResultSet();
				ar.completeString = output;
				ar.count = currentNode.count;
				outputList.add(ar);
				return;
			}
			else if(currentNode.isWord)
			{
				wordsWithPrefix1.add(output);
				AutoCompleteResultSet ar = new AutoCompleteResultSet();
				ar.completeString = output;
				ar.count = currentNode.count;
				outputList.add(ar);
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
	
	public boolean isThataWord(Trie currentNode, String input)
	{
		
		Trie parseTrie = root;
		for(int i = 0;i < input.length();i++)
		{
			if(parseTrie.CharacterSet.containsKey(input.charAt(i)))
			{
				parseTrie = parseTrie.CharacterSet.get(input.charAt(i));				
			}
			else
			{
				return false;
			}
		}
		if(parseTrie.isWord)
			return true;
		
		return false;
	}

}

