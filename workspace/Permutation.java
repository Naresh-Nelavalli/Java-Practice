import java.util.Scanner;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string :");
		String input = in.nextLine();
		if(input==" ")
			System.out.println("Invalid input !, Please run program with valid input");
		Permut p = new Permut();
		p.performsetPermutation(input,"");
		in.close();

	}
	
}
