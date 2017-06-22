
public class Permut 
{
	public void performsetPermutation(String input, String result)
	{
		if (input.equals(""))
		{
			System.out.println(result);
		}
		else
		{
			for(int i=0;i<input.length();i++)
			{
				String lp = input.substring(i+1);
				String fp = input.substring(0, i);
				String rest = lp + fp;
				String out =  result + input.substring(i,i+1);
				performsetPermutation(rest,out);
			}
		}
		
	}

}
