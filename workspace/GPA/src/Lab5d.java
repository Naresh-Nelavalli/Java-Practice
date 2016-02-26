class Lab5d
{
    public static void main(String[] args)
    {
        char[] anArray;  // declares an array of integers

        anArray = new char[26];  // allocates memory for 5 integers
        
        char init = 97;
        for(int t=0;t<25;t++)
        {
        	anArray[t] = init;
        	init ++;
        }
        

        System.out.println("Element at index 0: " + anArray[0]);
        System.out.println("Element at index 1: " + anArray[1]);
        System.out.println("Element at index 2: " + anArray[2]);
        System.out.println("Element at index 3: " + anArray[3]);
        System.out.println("Element at index 4: " + anArray[4]);
    }
}