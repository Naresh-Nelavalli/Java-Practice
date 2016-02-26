
/*************************************************************************************************
 * CSC 8000
 * Geometry.Java
 * Purpose: To demonstrate the data types and perform basic arithmetic operations on them. 
 * @author Naresh Nelavalli
 * @version 1.0 
 * @Date 8/31/2015
 *
 */
//***********************************************************************************************

public class Geometry {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		final int con1=10;
		final boolean con2 = true;
		final String cons3 ="who am I ?";
		int var1=0;
		boolean var2 = true;
		String var3="Nelavalli Naresh";
		byte var4=0;
		short var5=0;
		int var6=0;
		long var7=0;
		float var8=0;
		double var9=1.0;
		char var10='N';
		
		for(int t=0;t<10;t++)
		{
			var1= var1 + 1;
			System.out.printf("the value of interger variable now is %d\n",var1);
			var2 = ! var2;
			System.out.println("the value of bolean variable now is:" + var2);
			var3+=" NN ";
			System.out.println("the value of string variable now is:" + var3);
			var4 +=t;
			System.out.println("the value of byte variable now is:" + var4);
			var5 +=1;
			System.out.println("the value of short variable now is:" + var5);
			var7*=9999 + t;
			System.out.println("the value of long variable now is:" + var7);
			var8 = var8 + 2;
			System.out.println("the value of float variable now is:" + var8);
			var9 = var9 * 2.5;
			System.out.println("the value of double variable now is:" + var9);
			var6 = var1 + 65;
			var10 = (char)var6;
			System.out.println("the value of Char variable now is:" + var10);
			
		}
		
		

	}

}
