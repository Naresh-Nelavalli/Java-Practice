
public class BioInfo {
	String Gender  = "";
	String Married ="";
	int Age=0;
	Name name ;//= new Name();
	
	public BioInfo(String g,String m, int a,Name n)
	{
		this.Gender = g;
		this.Married = m;
		this.Age = a;
		this.name = n;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getMarried() {
		return Married;
	}

	public void setMarried(String married) {
		Married = married;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}
	
	
}
