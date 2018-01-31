public class Solution {

	
	List<List<Integer>> output = new ArrayList<List<Integer>>();
	
	public List<List<Integer>> combine(int n, int k)
	{
		List<Integer> input = new LinkedList<Integer>() ;
    	for(int i =1;i<n+1;i++)
    	{
    		input.add(i);
    	}
    	performsetSubsets( input,new ArrayList<Integer>(), k);
		return output;

	}
	
	public  void performsetSubsets(List<Integer> input,List<Integer> soFar, int k)
	{
		if ( soFar.size() == k )
		{
			output.add(soFar);
		}
		else if(input.size() == 0)
		{
			int a;
		}
		else
		{
			List<Integer> lp = input.subList(1, input.size());
			ArrayList<Integer> out = new ArrayList<Integer>(soFar);
			out.add(input.get(0));
            performsetSubsets(lp,out,k);
			performsetSubsets(lp,soFar,k);

		}
		
	}

}
