import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AutoCompleteInteraction 
{
	static String searchString = "";
	public static void main (String [] args)
	{
		
		AutoCompleteSentence acs = new AutoCompleteSentence();
		acs.addNewWord("island", 3);
		acs.addNewWord("ironman", 2);
		acs.addNewWord("i love leetcode", 2);
		acs.addNewWord("i love you", 5);
		Scanner in = new Scanner(System.in);
		String breakk = "a";
		while(breakk != "$")
		{
			System.out.println("Enter the substring value to get words : ");
			String prefix = in.nextLine();
			if(prefix.equals("#"))
			{
				acs.addNewWord(searchString);
				List<AutoCompleteResultSet> output = new ArrayList<AutoCompleteResultSet>();
				output =  acs.findWordsWithPrefix(searchString);
				searchString = "";
				
				for(AutoCompleteResultSet as : output)
				{
					System.out.println(as.completeString + "::::" + as.count);
				}
			}
			else if(prefix.lastIndexOf('#') == prefix.length()-1)
			{
				searchString += prefix.substring(0,prefix.length()-1);
				acs.addNewWord(searchString);
				System.out.println("Added this one successfully::" + searchString);
				searchString = "";
			}	
			else if(prefix.equals("$"))
			{
				breakk = "$";
			}
			else
			{
				searchString += prefix;
			}
			List<AutoCompleteResultSet> output = new ArrayList<AutoCompleteResultSet>();
			output =  acs.findWordsWithPrefix(searchString);
			Collections.sort(output);
			for(AutoCompleteResultSet as : output)
			{
				System.out.println(as.completeString + "::::" + as.count);
			}
		}

		in.close();
	}

}
