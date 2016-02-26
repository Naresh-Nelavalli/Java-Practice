import java.io.*;
import java.util.*;

public class gridsch {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
         int num=0;
		try {
			num = Integer.parseInt(in.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        while(num  > 0){
        
            String rowColumndata = in.readLine();
            String[] rowCols = rowColumndata.split(" ");
            int rows = Integer.parseInt(rowCols[0]);
            int cols = Integer.parseInt(rowCols[1]);
            int [][] message= new int[rows][cols];
            for(int i=0;i<rows;i++){
                String rowsData = in.readLine();
                String[] rowsd = rowsData.split("(?<=.)");
                for(int j=0;j<cols;j++){
                    message[i][j]=Integer.parseInt(rowsd[j]);    
                    
                }
            }
            String rowColumndata1 = in.readLine();
            String[] rowCols1 = rowColumndata1.split(" ");
            int rows1 = Integer.parseInt(rowCols1[0]);
            int cols1 = Integer.parseInt(rowCols1[1]);
            int querylen = rows1 * cols1;
            int[] query = new int[querylen];
            String queryMsg="";
            for(int tk=0;tk<rows1;tk++)
                queryMsg+= in.readLine();
            char [] querychar = queryMsg.toCharArray();
            System.out.println(querychar.length);
            System.out.println(querylen);
            for(int i = 0;i<querylen;i++ ){
                query[i] = Character.getNumericValue(querychar[i]);
            }
            boolean result=true;
            boolean success=false;
            int finalrows = rows-rows1+1;
            int finalcols = cols-cols1+1;
            for(int i=0;i<finalrows;i++){
                
                for(int j=0;j<finalcols;j++){
                    if (message[i][j] ==  query[0]){
                        int u=0;
                        boolean shouldBreak=false;
                        int c=i+ rows1;
                        int d=j +cols1;
                        for(int k=i;k<c;k++){
                            for(int l=j;l<d;l++){
                                if(message[k][l]==query[u]){
                                    u=u+1;
                                }
                                else{
                                    shouldBreak=true;
                                    result=false;
                                    success=false;
                                    break;
                                }
                            }
                            if (shouldBreak==true) 
                                break;
                            else{
                            	success=true;
                            	result=true;
                                }
                            } 
                    }
                    if(success==true)
                    	break;
                }
                if(success==true)
                		break;
            }
            if(result==true)
                System.out.println("Yes");
            else
                System.out.println("No");
                
        }
        
    }
}
