
public class EmployeeFunc {

	public static void Updatelastname(Employee1 e1, String Lname)
	{
		e1.bio1.name.setLName(Lname);
	}
	
	public static void UpdateWorkhours(Employee1 e1, int whours)
	{
		e1.Payhours = whours;
	}
	
	public static void isMale(Employee1 e1)
	{
		if(e1.bio1.getGender()=="Male")
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("False");
		}
	 }
	
	public static void isFemale(Employee1 e1)
	{
		if(e1.bio1.getGender()=="Male")
		{
			System.out.println("False");
		}
		else
		{
			System.out.println("True");
		}
	 }
	
	public static void main(String[] Args)
	{
		Name nn = new Name("Naresh","Nelav","Nelavalli");
		BioInfo bi = new BioInfo("Male","Single",24,nn);
		Employee1 ne = new Employee1(80,180,bi);
		System.out.println(ne.bio1.name.getLName());
		System.out.println(ne.Payhours);
		Updatelastname(ne, "Nelavalli1");
		UpdateWorkhours(ne, 200);
		System.out.println(ne.bio1.name.getLName());
		System.out.println(ne.Payhours);
		System.out.println(ne.bio1.getAge());
		isFemale(ne);
		isMale(ne);
		System.out.println(ne.Payrate);		
	}
}
