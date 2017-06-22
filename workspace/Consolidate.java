import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Consolidate 
{
	
	// Used Static map variable as I created a static function for consolidating the data. 
	// So for testing purpose we should change the value of fName variable to local file location.
	
	static Map<String,Integer> consolidatedData = new HashMap<String,Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        String fName = "C:\\Users\\Naresh\\Desktop\\input.txt";
        String line = null;
        
        try 
        {
            FileReader fileReader = new FileReader(fName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) 
            {
               
            	findKeyCount(line);	
            }   
            for(Map.Entry<String,Integer> entry: consolidatedData.entrySet())
            {
            	System.out.println("The total for " + entry.getKey() + " is " + entry.getValue() + ".");
            }
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) 
        {
            System.out.println("Error opening file'" + fName + "'");                
        } 
        catch (IOException e) 
        {
        	System.out.println("Error reading the file" + fName + "'");
			
		}

	}
	public static void findKeyCount(String line)
	{
		// Split data as we know that each field is separated by ","
		
		String[] fields = line.split(",");
		String Name = fields[0];
		
		// Exception , what if read data is not integer value - 
		try{
			int associatedValue=Integer.parseInt(fields[1]);
			if(consolidatedData.containsKey(Name)){
				consolidatedData.put(Name,consolidatedData.get(Name)+ associatedValue);
			}
			else{
				consolidatedData.put(Name,associatedValue);
			}
		}
		catch(Exception ex){
			System.out.println("Exception handled, Skipped a record with Key: " + Name);
		}
		
	}
}
