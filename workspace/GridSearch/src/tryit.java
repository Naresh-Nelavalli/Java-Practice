
public class tryit {

	public static void main(String[] args){
		a a1 = new b();
	//	b b1 = new a();
		a a2 = new a();
		b b2 = new b();
		a1.add(100,50);
		a2.add(100,50);
		a2=b2;
		a2.add(100,50);
	}
}
 class a {
	public int add(int a, int b)
	{
		System.out.println(a+b);
		return a+b;
		
	}
}
 class b extends a{
	 
	 public int add(int a, int b)
		{
		 System.out.println(a-b);
			return a-b;
			
		}
	 
 }
