import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GPA_S {
	
	public static void main(String[] args) {
		
		String subject="";
		String student="";
		int subjects=0;
		double GPA_POINTS=0;
		double Accu_GPA =0;
		int students=0;
		
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of students:");
		try {
			student = br.readLine();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		students=Integer.parseInt(student);
		
		for(int t =0;t<students;t++)
	    
	    {

		System.out.println("Enter the number of subjects for new student:");
		//System.out.println("Enter 'q' to quit.");
		
		try {
			subject = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//if(subject.equals("q") || subject.equals("-1"))
		//	continue;
	    subjects= Integer.parseInt(subject);
	    Accu_GPA =0;
	    for(int i=1;i<=subjects;i++)
	    {
	    	System.out.println("Enter the Grade for subject" + i + ":" );
	    	String grade = null;
			try {
				grade = br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	char[] grades = grade.toCharArray();
	    	GPA_POINTS =0;
	    	
	    	switch(grades[0])
	    	{
	    	case 'A':
	    	case 'a':
	    	{
	    		GPA_POINTS=4;
	    		break;
	    	}
	    	
	    	case 'B':
	    	case 'b':
	    	{
	    		GPA_POINTS=3.5;
	    		break;
	    	}
	    	
	    	case 'C':
	    	case 'c':
	    	{
	    		GPA_POINTS=3;
	    		break;
	    	}
	    	
	    	case 'D':
	    	case 'd':
	    	{
	    		GPA_POINTS=2.5;
	    		break;
	    	}
	    	
	    	default:
	    	{
	    		System.out.println("Seems entered Inccorrect grade Dear !! Try Again!! ");
	    		i=i-1;
	    	}
	    	}
	    	
		    Accu_GPA+= GPA_POINTS ;

	    	}
	    Accu_GPA = Accu_GPA/subjects;
	    System.out.println("Your GPA is " + Accu_GPA + "only");
    }
		System.out.println("You just said Good Bye !!!!");

	    }
		
		 
		   /*do {
		      subject = br.readLine();
		      subjects= Integer.parseInt(subject);
		      
		    } while (!str.equals("q"));*/
}

