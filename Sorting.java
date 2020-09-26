import java.util.Scanner;

public class Sorting {
	public static void main(String[] args) 
	{
		int a[];
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		a=new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<=n;i++)
			a[i]=sc.nextInt();
		System.out.println("Sorted array using bubblesortis"+bubbleSort(a,n));
	}
	{		
	}
	public static int[] bubbleSort(int a[],int n)
	{
		int i,j,t,min;
		for(i=0;i<n;i++)
		{
			min=i;
			for(j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
					min=j;
			}
			if(min!=i)
			{
				t=a[min];
			}
		}
		return a;
	}
}
