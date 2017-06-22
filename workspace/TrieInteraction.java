import java.util.Scanner;

public class TrieInteraction {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string :");
		String input = in.nextLine();
		if(input==" ")
			System.out.println("Invalid input !, Please run program with valid input");
		String [] inputArray = input.split(" ");
		TrieImpl ti = new TrieImpl();
		for(String s : inputArray)
		{
			ti.addNewWord(s);
		}
		String breakk = "a";
		while(breakk != "$")
		{
		System.out.println("Enter the substring value to get words : ");
		String prefix = in.nextLine();
		if(prefix.equals("$"))
		{
			breakk = "$";
		}
		ti.findWordsWithPrefix(prefix);
		}
		in.close();


	}

}
