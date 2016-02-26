import java.util.Scanner;

public class Coins {
	public enum Coin
	{
	  Penny, Dime, Quarter, Nickel
	}
	
	private Coin coin;
	
	public Coins(Coin coin){
		this.coin=coin;
	}
	
	public void coinValue(Coin coin)
	{
	switch(coin)
	{
		case Penny:
			System.out.println(01);
			break;
		case Dime:
			System.out.println(10);
			break;
		case Nickel:
			System.out.println(05);
			break;
		case Quarter:
			System.out.println(25);
						break;
		default:
			System.out.println("Never knew such kind of coin");
			break;
			
	}
	}
	
	public void coinColor(Coin coin)
	{
	switch(coin)
	{
		case Penny:
			System.out.println("Copper");
			break;
		case Dime:
			System.out.println("Silver");
			break;
		case Nickel:
			System.out.println("Silver");
			break;
		case Quarter:
			System.out.println("Silver");
						break;
		default:
			System.out.println("Never knew such kind of coin");
			break;
			
	}
	}
	
	public static void main(String[] args)
	{
		System.out.println("Please enter the coin to determine:");
		Scanner scan = new Scanner(System.in);
	    String value = scan.nextLine();
	    Coin coin1 = Coin.valueOf(value);
		
		Coins c1 = new Coins(coin1);
		c1.coinColor(coin1);
		c1.coinValue(coin1);
	}

}

