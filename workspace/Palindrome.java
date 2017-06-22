import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string :");
		String input = in.nextLine();
		if(input==" ")
			System.out.println("Invalid input !, Please run program with valid input");
		Palin palin = new Palin();
		boolean isPalindrome = palin.detectPlindrome(input);
		if(isPalindrome){
			System.out.println("Given string is a palindrome");
		}
		else{
			System.out.println("Given string is not a palindrome");
		}
		in.close();
		
	}

}

class Palin{	
	
	boolean isPalindrome = true;
	
	public boolean detectPlindrome(String input){
	String modifiedInput = input.replaceAll("[^A-Za-z0-9 ]","").toUpperCase().replaceAll(" ", "");
	int length = modifiedInput.length();
	char[] inputArray = modifiedInput.toCharArray();
	int iterations = Math.floorDiv(length,2);
	for(int i=0;i<iterations;i++){
		if(inputArray[i]==inputArray[length-i-1]){  // We used length -1 because array index starts from 0 
			continue;
		}
		else{
			isPalindrome = false;
			break;
		}
	}
	return isPalindrome;
	}
}
