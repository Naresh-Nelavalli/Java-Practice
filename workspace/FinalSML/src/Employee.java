
public class Employee {
	int Payrate = 0;
	int Payhours = 0;
	BioInfo bio ;//= new BioInfo();
	
	public Employee(int pr,int ph,BioInfo b)
	{
		this.Payhours = ph;
		this.Payrate = pr;
		this.bio = b;
	}
	
	public void Updatelastname(String Lname)
	{
		this.bio.name.setLName(Lname);
	}
	
	public void UpdateWorkhours(int whours)
	{
		this.Payhours = whours;
	}
	
	public void isMale()
	{
		if(this.bio.getGender()=="Male")
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("False");
		}
	 }
	
	public void isFemale()
	{
		if(this.bio.getGender()=="Male")
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
		Employee ne = new Employee(80,180,bi);
		System.out.println(ne.bio.name.getLName());
		System.out.println(ne.Payhours);
		ne.Updatelastname("Nelavalli1");
		ne.UpdateWorkhours(200);
		System.out.println(ne.bio.name.getLName());
		System.out.println(ne.Payhours);
		System.out.println(ne.bio.getAge());
		ne.isFemale();
		ne.isMale();
		System.out.println(ne.Payrate);		
	}
	
	
}
