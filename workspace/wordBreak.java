public class Solution {
	
	List<String> output = new ArrayList<String>();
	Map<String,List<String>>  temp= new HashMap<String,List<String>>();
    public List<String> wordBreak(String s, List<String> wordDict) 
    {
    	List<String> output = wordBreak1( s, wordDict,new ArrayList<String>()); 
    	
		return output;
        
    }
    
    public List<String> wordBreak1(String s, List<String> wordDict,List<String> soFar ) 
    {
    	if(temp.containsKey(s))
    	{
    		return temp.get(s);
    	}
    	if( s.length()==0)
    	{    		
    		return new ArrayList<String>();
    	}
    	else
    	{
    		List<String> temp1 = new ArrayList<String>();
    		for(String word : wordDict)
    		{
    			if(s.startsWith(word))
    			{				
    				String restInput = s.substring(word.length());
    				soFar = wordBreak1(restInput, wordDict,soFar);
    				if(restInput.equals(""))
    				{
    					temp1.add(word);
    				}
    				for(String ss : soFar)
    				{    				
    					temp1.add(word + " " + ss);
    				}
    				
    			}
    		}
    		
    		temp.put(s, temp1);
    		
    	}
		return temp.get(s);
    	
        
    }
}
