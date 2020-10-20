import java.util.Scanner;
public class FibonacciSearch
{
	public static int fib_srch(int a[], int n, long key)
	{ 
   	 	int initpos=0, pos, k;
	        int fib[]={0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144};
 
		
    		k=0;
    		while(fib[k]<n) 
			k++;		// if n = 8, k = 13
   	
		while(k>0)
		{
    			pos=initpos+fib[--k]; // next position to be compared

			if((pos>=n) || key<a[pos])
			     continue;	// element may be there towards left.. previous fib position will be considered
    			else 
			if (key>a[pos])	// right side, then pos+1
    			{
        			initpos=pos+1;
        			k--;
    			}
			else
				return pos;
    		}
		
		return -1;		
	}
    	

	public static void main(String args[])
	{
    		int a[];
    		int n;
		int key;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		n=sc.nextInt();
		a=new int[n];
		System.out.println("enter array values");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		key = Integer.parseInt(args[0]);  

		int pos = fib_srch(a,n,key);

    		if(pos==-1)
			System.out.println("No such item found");
    		else
			System.out.println("Key found at Locaton :"+ pos);
	}
}
