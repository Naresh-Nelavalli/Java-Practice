
public class AutoCompleteResultSet implements Comparable<AutoCompleteResultSet>
{
	String completeString;
	int count;
	@Override
	public int compareTo(AutoCompleteResultSet arg0) 
	{
		
		if(this.count == arg0.count  )
		{
			return this.completeString.compareTo(arg0.completeString);
		}
		else
		{
			return arg0.count  - this.count;
			
		}
		
		
	}

}
