import java.util.Scanner;

public class RotateIt {

	static int rows=0,cols=0,swaps=0;
	static int [][]mat1;
	static int []b1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Welcome to Matrix rotation");
			System.out.println("Enter the number of rows :");
			rows=sc.nextInt();
			System.out.println("Enter then number of cols:");
			cols=sc.nextInt();
			System.out.println("Enter then number of swaps:");
			swaps=sc.nextInt();
			int [][] mat=new int[rows][cols];
			for(int i=0;i<rows;i++){
				for(int j=0;j<cols;j++){
					System.out.println("Enter the values of matrix :");
					mat[i][j]=sc.nextInt();
					
				}
			}
			mat1=mat;
			int minItrs=0;
			if(rows>cols)
				 minItrs=cols;
			else
				 minItrs=rows;
			System.out.println("Before Swapping ::::::::::::::::::");
			for(int i=0;i<rows;i++){
				for(int j=0;j<cols;j++){
					System.out.print(mat1[i][j]+ "\t");
					
				}
				System.out.println("\n");
			}
			
			for(int i=0;i<minItrs/2;i++){
				copyToArray(rows - 2*i,cols-2*i,i);
			}
			System.out.println("After Swapping ::::::::::::::::::");
			for(int i=0;i<rows;i++){
				for(int j=0;j<cols;j++){
					System.out.print(mat1[i][j]+ "\t");
					
				}
				System.out.println("\n");
			}
			
	}
	
	public static void copyToArray(int rows,int cols,int splInt)
	{
		int t=0;
		if(rows > cols)
			t =rows;
		else
			t=cols;
		
		int k=0;
		int size=((2*rows)+(2*cols))-4;
		int []b= new int[size];
		for(int i=0;i<t;i++){
			if(k<rows-1)
			{
				b[k]=mat1[i+splInt][splInt];
				b[k+rows-1+cols-1]=mat1[rows-1-k+splInt][cols-1+splInt];
				
				
			}
			if(k<cols-1){
				b[k+rows-1]=mat1[rows-1+splInt][i+splInt];
				b[k+2*(rows-1)+cols-1]=mat1[splInt][cols-1-k+splInt];
			}
			k=k+1;
			
		}
		int[]c=new int[size];
		// Shallow Copying 
				//c=b
		// Deep copying 
		for(int j=0;j<size;j++)
			c[j]=b[j];
		int newSwaps=swaps%size;
		for(int i=0;i<size;i++){
			b[(i+newSwaps)%size]=c[i];
		}
		b1=b;
		copyBackToMat(rows, cols,splInt);
		
	}
	public static void copyBackToMat(int rows, int cols,int splInt)
	{
		int t=0;
		if(rows > cols)
			t =rows;
		else
			t=cols;
		
		int k=0;
		int size=((2*rows)+(2*cols))-4;
		// b= new int[size];
		for(int i=0;i<t;i++){
			if(k<rows-1)
			{
				mat1[i+splInt][splInt]=b1[k];
				mat1[rows-1-k+splInt][cols-1+splInt]=b1[k+rows-1+cols-1];
				
				
			}
			if(k<cols-1){
				mat1[rows-1+splInt][i+splInt]=b1[k+rows-1];
				mat1[splInt][cols-1-k+splInt]=b1[k+2*(rows-1)+cols-1];
			}
			k=k+1;
			
		}	
		
		
	}

}
